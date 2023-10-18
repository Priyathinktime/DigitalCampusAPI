package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import java.io.IOException;

import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.ExaminationMarksEndPoints;



public class ExaminationMarksStepDefinitions {


	private  ExaminationMarksEndPoints examMark;

	String responseBody ;
	public ExaminationMarksStepDefinitions( ExaminationMarksEndPoints examMark) {
		this.examMark = examMark;
	}


    @Given("I send a POST request for Examination Marks with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		examMark.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( examMark.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
    @Given("I send a PUT request for Examination Marks with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		examMark.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@Given("I send a GET request for Examination Marks from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		examMark.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( examMark.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	@Given("I send a DELETE request for Examination Marks from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		examMark.applicationSalesDeletePayload(AuthExample.token, name);
	}

	
//	@When("^The order request response has a '(\\d+)' response code$")
//	public void the_response_has_the_correct_response_code(Integer rc) {
//		examMark.verifyResponseStatusValue(examMark.result, rc.intValue());
//		
//	}
	@When("The order request response for Examination Marks has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		examMark.verifyResponseStatusValue(examMark.result, intValue);
	}
}


