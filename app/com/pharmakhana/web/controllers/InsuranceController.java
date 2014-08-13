package com.pharmakhana.web.controllers;

import java.util.ArrayList;
import java.util.List;

import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.pharmakhana.web.resources.InsurancesResource;

public class InsuranceController extends Controller {
	@Transactional(readOnly=true)
	public static Result getInsuranceProfiles(final String langCode, final String countryCode) {
		System.out.println("getInsuranceProfiles :: langCode: " + langCode + " countryCode: " + countryCode);
    	final List<InsurancesResource> insurances = new ArrayList<>();
        return ok(Json.toJson(insurances));
    }
}
