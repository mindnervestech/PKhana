package com.pharmakhana.util;

import java.sql.Timestamp;
import java.util.Date;

import com.pharmakhana.web.resources.ResponseResource;

public class CommonUtils {

	public static Timestamp getCurrentTimeStamp() {
		
		Date date = new Date();
		long time = date.getTime();
		return new Timestamp(time);
	}
	
	public static ResponseResource prepareResponse(Object resultData) {
		ResponseResource response = new ResponseResource();
		response.setErrorMessage(null);
		response.setResult(resultData);
		response.setStatusCode("200");
		response.setStatusText("OK. Request is successfully processed.");
		return response;
	}
}
