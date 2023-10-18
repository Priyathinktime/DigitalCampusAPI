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
import com.thinktimetechno.endpoints.ExamScheduleEndPoints;



public class ExamScheduleStepDefinitions {


	private ExamScheduleEndPoints examsche;


	public ExamScheduleStepDefinitions( ExamScheduleEndPoints examsche) {
		this.examsche = examsche;
	}


	@Given("I send a POST request for Exam Schedule with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		examsche.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( examsche.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	@Given("I send a PUT request for Exam Schedule with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		examsche.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@Given("I send a GET request for Exam Schedule from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		examsche.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( examsche.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	@Given("I send a DELETE request for Exam Schedule from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		examsche.applicationSalesDeletePayload(AuthExample.token, name);
	}

	
	@When("The order request response for Exam Schedule has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		examsche.verifyResponseStatusValue(examsche.result, intValue);
	}
}


