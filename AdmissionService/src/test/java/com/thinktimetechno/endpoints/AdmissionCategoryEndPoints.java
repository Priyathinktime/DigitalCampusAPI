 package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AdmissionCategoryEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	

	
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "fetch admission category":
			application_ENDPOINT_PATH="/admission/api/admission-service/admission-category";
			break;
		
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	
}