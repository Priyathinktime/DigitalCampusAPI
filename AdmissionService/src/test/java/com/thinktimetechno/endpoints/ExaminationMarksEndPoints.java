package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExaminationMarksEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "Save Exam Marks List.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/exam-marks";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ExaminationMarksPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "Update Exam Marks by studentRegId.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/exam-marks/17";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ExaminationMarksPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Get Exam Marks List with Filter":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-marks?academicYearId=8&curriculumId=5&instituteId=1&classId=99&branchId=1";
			break;
		case "Get Exam Marks Subject Names":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-marks/exam-subjects?instituteId=1&branchId=1&academicYearId=8&curriculumId=1&classId=1";
			break;
		case "Get Exam Marks by studentRegId & marksEntryId":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-marks/17?marksEntryId=7738";
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	public Response applicationSalesDeletePayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Delete Exam Marks by studentRegId":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-marks/17";
			break;
		
		
		}
			result=requestSpecification.delete(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
}