package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import java.io.IOException;

import org.json.JSONObject;

import com.thinktimetechno.endpoints.ApplicationSaleEndPoints;
import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.utils.LogUtils;



public class ApplicationSaleStepDefinitions {


	private ApplicationSaleEndPoints Appsale;
   
	String responseBody ;
	public ApplicationSaleStepDefinitions(ApplicationSaleEndPoints Appsale) {
		this.Appsale = Appsale;
	}


	@Given("I send a POST request for Application sales with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		Appsale.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( Appsale.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	@Given("I send a PUT request for Application sales with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

     Appsale.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
     System.out.println(Appsale.applicationSalesUpdatePayload(AuthExample.token,jsonFile).getBody().asString());
	}
	@Given("I send a GET request for Application sales from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {
//	    responseBody = result.getBody().asString();
//        JSONObject postResponseJson = new JSONObject(responseBody);
//     String appID=  postResponseJson.getString("applicationId");
     Appsale.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( Appsale.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
     
	}
	
	@When("^The order request response for Application sales has a '(\\d+)' response code$")
	public void the_response_has_the_correct_response_code(Integer rc) {
		Appsale.verifyResponseStatusValue(Appsale.result, rc.intValue());
		
	}
//	
//	@When("The order request response has a {string} response code")
//	public void the_order_request_response_has_a_response_code(String value) {
//		int intValue = Integer.parseInt(value);
//		Appsale.verifyResponseStatusValue(Appsale.result, intValue);
//	}
	@Then("verify response value {string} has {string}")
	public void verifyResposeResult(String key,String value) {
		Appsale.verifyResponseKeyValues(key, value, Appsale.result);
	}
}


