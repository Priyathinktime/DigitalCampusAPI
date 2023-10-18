package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AgeCriteriaEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1065 generate new age creteria for current academicYear.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/age-criteria";
				break;
		
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/AgeCriteriaPayloads/"+jsonFile);
//		result=requestSpecification.multiPart("jsonFile", jsonDataInFile, "application/json").post(getBaseUrl() + application_ENDPOINT_PATH);
//		result=requestSpecification.multiPart(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1066 API to edit age criteria.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/age-criteria/458";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/AgeCriteriaPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS 1002 fetch admission age criteria details":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/age-criteria?branchId=1&academicYearId=8&curriculumId&pageSize=10&pageNo=0&orderBy=&sortBy=";
			break;
		case "DPS 1067 Fetch age criteria by ID":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/age-criteria/6";
			break;
		
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	
}