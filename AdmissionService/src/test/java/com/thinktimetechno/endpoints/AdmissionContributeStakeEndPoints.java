package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AdmissionContributeStakeEndPoints extends BaseEndpoints{

	RequestSpecification requestSpecification;
	public Response result;
//	public static int applicationNameId;
//	public static String examId;
	private  String application_ENDPOINT_PATH="";
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "{{BASE_URL}}/admission/api/admission-service/contribute-stake?instituteId=1&searchString=medi&rs=A":
			application_ENDPOINT_PATH="/admission/api/admission-service/contribute-stake?instituteId=1&searchString=medi&rs=A";
			break;

		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
}