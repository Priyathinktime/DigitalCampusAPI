package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AdmissionPriliminaryScrutinyEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
//	public static int studentRegistrationId;
//	public static int studentRegistrationNo;
//	 boolean isstudentRegistrationId=false;
//	 boolean isstudentRegistrationNo=false;
//	 public static int scrutinyId;
//	 boolean isscrutinyId=false;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS-866 API  POST  Update Accept Reject OnHold application in Scrutiny.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/evaluation/preliminaryScrutiny";
				break;
			case "API to APPROVE RECONSIDER Documents.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/evaluation/preliminaryScrutiny/approve-documents?scrutinyId=26273&studentRegId=35719";
				break;
			case "API to Approve Academics Approval.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/evaluation/preliminaryScrutiny/academics-approval";
				break;
			case "API to Approve Head Dept Approval.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/evaluation/preliminaryScrutiny/head-dept-approval";
				break;
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/AdmissionPriliminaryScrutinyPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS-864 API To Fetch Scrutiny List With FIlters.":
			application_ENDPOINT_PATH="/admission/api/admission-service/evaluation/preliminaryScrutiny/all?academicYearId=8&curriculumId=&branchId=&classId=&startDate=&endDate=&searchString=&pageNo=0&pageSize=10&orderBy=&sortBy=&scrutinyStatus=INPROGRESS";
//		   isstudentRegistrationId=true;
			break;
			
		case "API to fetch Admission Preliminary Scrutiny By Id.":
			application_ENDPOINT_PATH="/admission/api/admission-service/evaluation/preliminaryScrutiny?scrutinyId=3412&studentRegId=5505";
			
//			isscrutinyId=true;
			break;
		case "API to fetch Documents for Approval":
			application_ENDPOINT_PATH="/admission/api/admission-service/evaluation/preliminaryScrutiny/fetch-documents-for-approval/35719";
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
//			if(isstudentRegistrationId) {
//				String responseBody = result.getBody().asString();
//			    JSONObject postResponseJson = new JSONObject(responseBody);
//			    studentRegistrationId= postResponseJson.getInt("studentRegistrationId");
//				}
//			if(isstudentRegistrationNo) {
//				String responseBody = result.getBody().asString();
//			    JSONObject postResponseJson = new JSONObject(responseBody);
//			    studentRegistrationNo= postResponseJson.getInt("studentRegistrationNo");
//				}
//			if(isscrutinyId) {
//				String responseBody = result.getBody().asString();
//			    JSONObject postResponseJson = new JSONObject(responseBody);
//			    scrutinyId= postResponseJson.getInt("scrutinyId");
//				}
			return result;
	
}
	
}