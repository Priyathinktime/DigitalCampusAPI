package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExamScheduleEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	public static int examScheduleId;
	private  String application_ENDPOINT_PATH="";
	 boolean isexamScheduleId=false;
	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "Save Exam Schedule.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule";
				isexamScheduleId=true;
				break;
			case "Cancel Student Registration.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule/cancel/4";
				break;
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ExamSchedulePayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
		if(isexamScheduleId) {
			String responseBody = result.getBody().asString();
		    JSONObject postResponseJson = new JSONObject(responseBody);
		    examScheduleId= postResponseJson.getInt("examScheduleId");
			}
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "Update Exam Schedule for Students.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule/students-schedule";
				break;
			case "Update Exam Schedule By ID.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule/"+examScheduleId;
				break;
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ExamSchedulePayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Exam Schedule List with Filters":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule?search=&instituteId=1&branchId=1&academicYearId=2&curriculumId=1&classId=2&sortBy=examDate";
			break;
		case "Get Exam Schedule By ID":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule/"+examScheduleId;
			break;
		case "Get Students List for Exam Schedule":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule/students-list?instituteId=1&academicYearId=2&branchId=1&curriculumId=1&classId=2";
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	public Response applicationSalesDeletePayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Delete Exam Schedule By ID":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule/"+examScheduleId;
			break;
		
		
		}
			result=requestSpecification.delete(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
}