package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import org.json.JSONObject;

import com.thinktimetechno.endpoints.AdmissionSiblingVerificationEndPoints;
import com.thinktimetechno.endpoints.ApplicationSaleEndPoints;
import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.ExamScheduleEndPoints;
import com.thinktimetechno.endpoints.ExaminationMarksEndPoints;



public class AdmissionSiblingVerificationStepDefinitions {

//	private Response result;
	private  AdmissionSiblingVerificationEndPoints admsblvrf;

	String responseBody ;
	public AdmissionSiblingVerificationStepDefinitions( AdmissionSiblingVerificationEndPoints admsblvrf) {
		this.admsblvrf = admsblvrf;
	}
//	AuthExample auth =new AuthExample();
//    @Given("Generate an API AuthExample.token with the  request body from {string}")
//    public void genrateAuthExample.token(String jsonfile) throws IOException {
//    	 AuthExample.token=auth.generateAuthExample.token(jsonfile);
//    }

    @When("I send a POST request for Admission Sibling Verification with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
    	admsblvrf.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( admsblvrf.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
    @When("I send a PUT request for Admission Sibling Verification with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

    	admsblvrf.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@When("I send a GET request for Admission Sibling Verification from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		admsblvrf.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( admsblvrf.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	
//	@Then("^The order request response has a '(\\d+)' response code$")
//	public void the_response_has_the_correct_response_code(Integer rc) {
//		examMark.verifyResponseStatusValue(examMark.result, rc.intValue());
//		
//	}
	@Then("The order request response for Admission Sibling Verification has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		admsblvrf.verifyResponseStatusValue(admsblvrf.result, intValue);
	}
}


