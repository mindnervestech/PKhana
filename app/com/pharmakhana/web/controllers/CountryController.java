package com.pharmakhana.web.controllers;

import java.util.ArrayList;
import java.util.List;

import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.pharmakhana.models.AuditLogging;
import com.pharmakhana.models.Country;
import com.pharmakhana.util.CommonUtils;

public class CountryController extends Controller {
	
	//private static final String CLASS_NAME = CountryController.class.getName();
	
	@Transactional
	public static Result getCountries(final String langCode, final String uniqueId) {
		Logger.info("Executing getCountries service :: Start");
    	Logger.info("Request Parameters : language code = " + langCode + ", Unique Id = " + uniqueId);
    	
		List<Country> countriesList = Country.findCountriesByLangCode(langCode);
    	if (countriesList == null || countriesList.isEmpty()) {
    		//to avoid null pointer exception while JSON conversion in case no data available from db.
    		countriesList = new ArrayList<>();	
    	}
    	
    	logAuditRecord(langCode, uniqueId);
    	Logger.info("Executing getCountries service :: End");
        return ok(Json.toJson(CommonUtils.prepareResponse(countriesList)));
    }
	
	private static void logAuditRecord(final String langCode, final String uniqueId) {
		AuditLogging logging = new AuditLogging();
    	logging.setUniqueId(uniqueId);
    	logging.setLogMessage("Application has been opened on Mobile!");
    	logging.setLogParameters("langCode=" + langCode);
    	logging.setLogType("Application_Open");
    	logging.setLogDateTime(CommonUtils.getCurrentTimeStamp());
    	logging.save();
	}
}
