package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProposedAdmissionsEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1064 API to save update proposed admission.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/proposed-admission?academicYearId=5&curriculumId&classId=1&branchId=1";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ProposedAdmissionsPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}

	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS-997 API proposed admission list":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/proposed-admission?academicYearId=5&curriculumId&classId=&branchId=1";
			break;
	
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	

	
	
}
	
}