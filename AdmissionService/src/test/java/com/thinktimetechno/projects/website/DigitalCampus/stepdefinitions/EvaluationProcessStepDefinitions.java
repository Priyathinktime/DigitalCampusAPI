package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.EvaluationProcessEndPoints;



public class EvaluationProcessStepDefinitions {


	private  EvaluationProcessEndPoints evalproc;

	String responseBody ;
	public EvaluationProcessStepDefinitions( EvaluationProcessEndPoints evalproc) {
		this.evalproc = evalproc;
	}


	@Given("I send a POST request for Evaluation Process with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		evalproc.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( evalproc.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	@Given("I send a PUT request for Evaluation Process with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		evalproc.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@Given("I send a GET request for Evaluation Process from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		evalproc.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( evalproc.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	
	
	@When("The order request response for Evaluation Process has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		evalproc.verifyResponseStatusValue(evalproc.result, intValue);
	}
}


