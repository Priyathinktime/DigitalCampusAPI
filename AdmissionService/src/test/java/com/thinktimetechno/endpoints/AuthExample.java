package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AuthExample extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	public static String token;
	private  String application_ENDPOINT_PATH="";

	public String generateToken(String jsonFile) throws IOException {

		
		application_ENDPOINT_PATH="/auth-service/api/auth/login?instituteId=1&branchId=1";
		requestSpecification = getRequestWithJSONHeaders();
	
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/AuthenticationPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
		 String responseBody = result.getBody().asString();
	     JSONObject postResponseJson = new JSONObject(responseBody);
	     token=postResponseJson.getString("token");
	     return  token;
	}

}
