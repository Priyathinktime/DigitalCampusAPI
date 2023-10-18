package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ApplicationSaleEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	public static int applicationNameId;
	public static String examId;
	private  String application_ENDPOINT_PATH="";
   boolean isApplicationId=false;
	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "Appliations Sale List with Filters.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/fetch";
				break;
			case "Save Appliations Sale Form CBSE.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale";
				isApplicationId=true;
				break;
			case "Save Appliations Sale Form Cambridge.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale";
				
				
				break;
			case "Get Appliations Sale By Application Number.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/fetch";
				break;
			case "Cancel Appliations Sale By Id.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/cancel/"+applicationNameId;
				break;
			case "Send Payment Link Email.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/email-send-payment-link/"+applicationNameId;
				break;
			case "Send Email Notification.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/email-notification/"+applicationNameId;
				break;
			case "Send SMS Notification.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/sms-notification/"+applicationNameId;
				break;
			case "Application Sale Fee Receipt PDF.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/receipt-generate/"+applicationNameId;
				break;
			case "Application Sale Fee Receipt Html Preview.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/html-receipt-preview/"+applicationNameId;
				break;
			case "Token.json":
				application_ENDPOINT_PATH="/auth-service/api/auth/login?instituteId=1&branchId=1";
				break;
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ApplicationSalePayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
		if(isApplicationId) {
		String responseBody = result.getBody().asString();
	    JSONObject postResponseJson = new JSONObject(responseBody);
	    applicationNameId= postResponseJson.getInt("applicationId");
		}
	    return result;
	
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "Update Appliations Sale Form By Id.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/"+applicationNameId;
				break;
			case "Update Appliations Sale Payment Status.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/payment-status/"+applicationNameId;
				break;
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/ApplicationSalePayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Get Appliations Sale By Id":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/"+applicationNameId;
			break;
		case "Front Desk Stats For Applcation Sale":
			application_ENDPOINT_PATH="/admission/api/admission-service/front-desk/stats?academicYearId=8";
			break;
		case "Get PreAdmission Subjects for CBSE":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/preadmission-subjects?instituteId=1&classId=56&groupId=54";
			break;
		case "Get PreAdmission Subjects For Cambridge":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/igcse-subjects?instituteId=1&academicYearId=8&classId=99";
			break;
		case "Get 2nd or 3rd Languages-1":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/languages?instituteId=1&academicYearId=3&branchId=1&curriculumId=2&classId=25&type=SECOND";
			break;
		case "Get 2nd or 3rd Languages-2":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/languages?instituteId=1&academicYearId=3&branchId=1&curriculumId=1&classId=8&type=THIRD";
			break;
		case "Get classes list for sale dropdown":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/classes?instituteId=1&academicYearId=4&branchId=1&curriculumId=1&availability=yes&dateOfBirth=2019-04-04";
			break;
		case "Get districts list for dropdown":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale/districts?countryId=100&stateId=37";
			break;
		case "{{BASE_URL}}/admission/api/admission-service/application-sale":
			application_ENDPOINT_PATH="/admission/api/admission-service/application-sale";
			break;
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
}