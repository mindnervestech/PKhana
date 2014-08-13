package com.pharmakhana.web.controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class FeedbackController extends Controller {
	public static Result logFeedbackMessage(final String uniqueId) {
		System.out.println("logFeedbackMessage");
        return ok("");
	}
}
