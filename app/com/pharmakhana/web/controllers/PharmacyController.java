package com.pharmakhana.web.controllers;

import java.util.ArrayList;
import java.util.List;

import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import com.pharmakhana.web.resources.PharmacyResource;

public class PharmacyController extends Controller {
	
	@Transactional(readOnly=true)
	public static Result searchPharmacies(
			final String langCode,
			final String longitude, final String latitude/*, final String pharmacyName,
			final String location, final String insuranceCoverage*/) {
		
		System.out.println(" --- "  + request().getQueryString("pharmacyName") + " location " + request().getQueryString("location") + " " +request().getQueryString("insuranceCoverage"));
		
    	System.out.println("searchPharmacies");
        return ok(index.render("searchPharmacies."));
    }
	
	@Transactional(readOnly=true)
	public static Result searchContainsPharmacies(
			final String langCode, final String countryCode, final String pharmacyName) {
		System.out.println("searchContainsPharmacies :: langCode: " + langCode + " countryCode: " + countryCode + " pharmacyName: " + pharmacyName);
    	final List<PharmacyResource> countries = new ArrayList<>();
        return ok(Json.toJson(countries));
	}
	
	@Transactional
	public static Result updatePharmacySeenCount(final int pharmacyId) {
		return ok("");
	}
	
	@Transactional
	public static Result updatePharmacyContactByCount(final int pharmacyId) {
		return ok("");
	}

	//Post request...
	
	/*public Result updatePharmacy(final int pharmacyId, final String requestType) {
		
		Result ok = null;
		if ("profileSeen".equals(requestType)) {
			ok = updatePharmacyViewCount(pharmacyId);
		} else if ("profileContacted".equals(requestType)) {
			ok = updatePharmacyContactByCount(pharmacyId);
		}
		return ok;
	}*/
	
		
}
