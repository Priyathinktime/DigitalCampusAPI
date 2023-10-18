package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	
	
//
//		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ExaminationMarksPayloads/"+jsonFile);
//		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
//     	return result;
	
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Download Exam Marks Template":
			application_ENDPOINT_PATH="/admission/api/admission-service/download?templateName=exam_marks.xlsx";
			break;
		case "Download Exam Marks Template2":
			application_ENDPOINT_PATH="/admission/api/admission-service/download2?templateName=exam_marks.xlsx";
			break;
	
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	


			
	
}
	
}