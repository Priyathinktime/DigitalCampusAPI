package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class EvaluationProcessEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";
	Random random = new Random();

    
    int randomValue = random.nextInt(85) + 1;
    String stringValue = String.valueOf(randomValue);

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1074 Assign evolution process to a class.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/evaluation-process";
				break;
		
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/EvaluationProcessPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS 1106 Update evolution process to a class id.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/settings/evaluation-process/?id="+stringValue;
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/SettingsPayloads/EvaluationProcessPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS 1014 fetch admission evaluation process details":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/evaluation-process/all?academicYearId=8&curriculumId&classId=&pageNo=0&pageSize=10&sortBy=&orderBy";
			break;
		case "DPS 1075 Fetch evaluation details from a class based on given ID":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/evaluation-process/10";
			break;
		case "DPS 1105 API to fetch classes for a given Evaluation":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/evaluation-process/evaluation-classes?academicYearId=8&curriculumId=1&evaluationCode=PINT";
			break;
		case "API to fetch Institute Evaluations":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/evaluation-process/institute-evaluations";
			break;
		case "API to fetch Classes While Adding in Evaluation Process":
			application_ENDPOINT_PATH="/admission/api/admission-service/settings/evaluation-process/all-classes?academicYearId=9&curriculumId=1";
			break;
		case "Admission Documents By classId":
			application_ENDPOINT_PATH="/admission/api/admission-service/documents/1?instituteId=1";
			break;
		
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	
}