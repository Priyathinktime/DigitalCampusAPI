package com.thinktimetechno.endpoints;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.http.ContentType;

public class AdmissionPanelInterviewScheduleEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";
	public static int responseBodyint;
	public static String responseBody;
//	int contentLength = jsonData.length();
	 boolean isvalue=false;
//	 boolean isheader=false;
	 
	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 940 fetch list of students for scheduling the panel interview.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/panelInterview/students";
//				isheader=true;
			      break;
			case "DPS 878 API GET Interview Schedule list with Filters.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/panelInterview/all";
				break;
			case "DPS 879 API POST Schedule Interview.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/panelInterview";
				isvalue=true;
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/AdmissionPanelInterviewSchedulePayloads/"+jsonFile);
		
//	if(isheader)
//	{
//		result=requestSpecification.header("Content-Length", String.valueOf(contentLength))
//		}
	
	
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
	
		if(isvalue) {
			responseBody = result.getBody().asString();
//			responseBodyint   =Integer.parseInt(responseBody);
			}
		return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 881 API POST Edit update interview schedule details.json":
//			    DPS 881 API POST Edit update interview schedule details.json
				application_ENDPOINT_PATH="/admission/api/admission-service/panelInterview/"+responseBody;
			
				
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/AdmissionPanelInterviewSchedulePayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
		
		return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS 880 API GET View interview schedule details":
			application_ENDPOINT_PATH="/admission/api/admission-service/panelInterview/"+responseBody;
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	public Response applicationSalesDeletePayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS 882 API POST Delete interview schedule":
			application_ENDPOINT_PATH="/admission/api/admission-service/panelInterview/"+responseBody;
			break;
		
		
		}
			result=requestSpecification.delete(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
}