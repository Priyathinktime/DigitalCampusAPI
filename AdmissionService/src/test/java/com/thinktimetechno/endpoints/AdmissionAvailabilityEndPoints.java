package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

public class AdmissionAvailabilityEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 995 fetch admission availability details.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-availability/all";
				break;
			case "DPS 1062 API to create Admission Availability.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-availability";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/AdmissionAvailabilityPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1063 API to edit Admission Availability.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-availability?id=450&availabilityStatus=Yes";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/AdmissionAvailabilityPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "API to fetch Classes In Admission Availability":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-availability/all-classes?academicYearId=10&curriculumId=2";
			break;
		case "API to fetch admission availability details by Id":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/admission-availability/11";
			break;
		
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	
}