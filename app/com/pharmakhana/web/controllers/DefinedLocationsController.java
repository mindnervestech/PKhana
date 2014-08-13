package com.pharmakhana.web.controllers;

import java.util.ArrayList;
import java.util.List;

import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.pharmakhana.models.Country;
import com.pharmakhana.models.Language;
import com.pharmakhana.models.PreDefinedLocations;
import com.pharmakhana.util.CommonUtils;

public class DefinedLocationsController extends Controller {
	@Transactional(readOnly=true)
	public static Result getPreDefinedLocations(final String langCode, final String countryCode) {
		System.out.println("getPreDefinedLocations :: langCode: " + langCode + " countryCode: " + countryCode);
/*    	
		PreDefinedLocations location = new PreDefinedLocations();
		Language language = new Language();
		language.setLanguageCode(langCode);
		Country country = new Country();
		country.setCountryCode(countryCode);
*/
		List<PreDefinedLocations> definedLocations = PreDefinedLocations.findLocationsByCountry(langCode, countryCode);

		if (definedLocations == null || definedLocations.isEmpty()) {
			definedLocations = new ArrayList<>();
		}
		
        return ok(Json.toJson(CommonUtils.prepareResponse(definedLocations)));
    }
}
