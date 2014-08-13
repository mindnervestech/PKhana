package com.pharmakhana.web.controllers;

import java.util.ArrayList;
import java.util.List;

import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.pharmakhana.models.PreDefinedLocations;
import com.pharmakhana.util.CommonUtils;
import com.pharmakhana.web.resources.DefinedLocationResource;

public class DefinedLocationsController extends Controller {
	@Transactional(readOnly=true)
	public static Result getPreDefinedLocations(final String langCode, final String countryCode) {
		System.out.println("getPreDefinedLocations :: langCode: " + langCode + " countryCode: " + countryCode);
		List<PreDefinedLocations> definedLocations = PreDefinedLocations.findLocationsByCountry(langCode, countryCode);
		List<DefinedLocationResource> locationResources = new ArrayList<DefinedLocationResource>();

		if (definedLocations == null || definedLocations.isEmpty()) {
		definedLocations = new ArrayList<>();
		} else {
		for (PreDefinedLocations location: definedLocations) {
		DefinedLocationResource res = new DefinedLocationResource();
		res.setLocationName(location.getLocationName());
		res.setLocationId(location.getLocId());
		locationResources.add(res);
		}
		}

		return ok(Json.toJson(CommonUtils.prepareResponse(locationResources)));
		}
}
