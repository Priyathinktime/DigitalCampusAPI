package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ChangeStudentDetailsEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "API to fetch Change Student Details List With Filters.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/change-student-details/all";
				break;
			case "API to save the student change details.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/change-student-details";
				break;
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ChangeStudentDetailsPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}

	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "API to fetch Student Data By regNo studentName":
			application_ENDPOINT_PATH="/admission/api/admission-service/change-student-details/student-data/R1161551";
			break;
		case "API to fetch change student details by Id":
			application_ENDPOINT_PATH="/admission/api/admission-service/change-student-details/15";
			break;
		case "Exam Schedule Students List":
			application_ENDPOINT_PATH="/admission/api/admission-service/exam-schedule/students-list?academicYearId=8&branchId=1&curriculumId=1&classId=1";
			break;
		case "Settings By Key":
			application_ENDPOINT_PATH="/admission/api/admission-service/setting/fetch/:settingsKey?instituteId=1&branchId=1";
			break;
		case "API Health":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/health";
			break;
		case "API to fetch list of uploaded images for a registered student":
			application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/1/fetch-upload-images";
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	

	
}
	
}