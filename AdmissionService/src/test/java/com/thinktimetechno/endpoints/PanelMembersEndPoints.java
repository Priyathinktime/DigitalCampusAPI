package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PanelMembersEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1010 fetch admission panel members details.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/panel-members/all";
				break;
			case "DPS 1071 Add panel members and assign to classes.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/panel-members";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/PanelMembersPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1072 Edit panel members and assign to classes.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/panel-members/398";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/PanelMembersPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "API to fetch Employees":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/panel-members/all-employees?instituteId=1&branchId=1&searchString=";
			break;
		case "DPS 1073 Fetch panel members details for a given ID":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/panel-members/30";
			break;
		
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	
}