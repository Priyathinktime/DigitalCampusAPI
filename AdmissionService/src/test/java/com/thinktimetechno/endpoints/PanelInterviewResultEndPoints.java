package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PanelInterviewResultEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";
	boolean isApplicationId=false;

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "TC01 DPS-888 API POST Add Panel Interview Results.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/interview-result";
				isApplicationId=true;
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/PanelInterviewResultPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
		if(isApplicationId) {
			String responseBody = result.getBody().asString();
		    JSONObject postResponseJson = new JSONObject(responseBody);
//		    Id= postResponseJson.getInt("applicationId");
			}
		return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS-889 API POST Edit Panel Interview Results.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/interview-result/24935?admissionType=Normal_Admission";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/PanelInterviewResultPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS-887 API  GET Panel interview results with Filters":
			application_ENDPOINT_PATH="/admission/api/admission-service/interview-result?academicYearId=3&branchId=2&searchString=&pageNo&pageSize&sortBy&orderType";
			break;
		case "Fetch Panel Interview Result By Id":
			application_ENDPOINT_PATH="/admission/api/admission-service/interview-result/24935";
			break;
		

		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	
}