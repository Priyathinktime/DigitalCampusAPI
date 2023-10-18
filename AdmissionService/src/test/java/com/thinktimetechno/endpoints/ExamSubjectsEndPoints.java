package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExamSubjectsEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1006 fetch admission exam subjects details.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-subjects/all";
				break;
			case "DPS 1068 add subject to a class.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-subjects";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/ExamSubjectsPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1069 edit subjects from a class.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-subjects/938";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/ExamSubjectsPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS 1070 fetch subject details based on ID":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-subjects/629";
			break;
		case "DPS 1115 API to fetch List of class having Stream Group":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-subjects/all-stream-groups?curriculumId=1&classIds=14,17";
			break;
		case "DPS 1116 API to fetch Subjects by class while Saving Exam Subjects":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-subjects/all-subjects?academicYearId=3&curriculumId=1&classIds=1,3&subjectIds=34,5";
			break;
		
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	
}