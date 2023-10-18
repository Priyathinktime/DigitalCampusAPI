package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ObservationAndInterviewReportEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS-884 Save Observation Report.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/observation-interview/save";
				break;
//			case "DPS-886 edit Observation Report.json":
//				application_ENDPOINT_PATH="/admission/api/admission-service/observation-interview/";
//				break;
//			case "DPS-864 getWithFilter.json":
//				application_ENDPOINT_PATH="/admission/api/admission-service/observation-interview/all?academicYearId=2&curriculumId=&branchId=&classId=&startDate=&endDate=&searchString=&pageNo=0&pageSize=10&orderBy=&sortBy=";
//				break;
//			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ObservationAndInterviewReportPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS-865 getByObservationId":
			application_ENDPOINT_PATH="/admission/api/admission-service/observation-interview/2766";
			break;
		case "DPS-864 | getWithFilter":
			application_ENDPOINT_PATH="/admission/api/admission-service/observation-interview/all?academicYearId=2&curriculumId=&branchId=&classId=&startDate=&endDate=&searchString=&pageNo=0&pageSize=10&orderBy=&sortBy=";
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
}