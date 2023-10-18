package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import org.json.JSONObject;

import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.ExamSubjectsEndPoints;
import com.thinktimetechno.endpoints.PanelMembersEndPoints;



public class ExamSubjectsStepDefinitions {


	private  ExamSubjectsEndPoints examsub;

	String responseBody ;
	public ExamSubjectsStepDefinitions( ExamSubjectsEndPoints examsub) {
		this.examsub = examsub;
	}


	@Given("I send a POST request for Exam Subjects with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		examsub.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( examsub.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	@Given("I send a PUT request for Exam Subjects with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		examsub.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@Given("I send a GET request for Exam Subjects from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		examsub.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( examsub.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	
	
	@When("The order request response for Exam Subjects has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		examsub.verifyResponseStatusValue(examsub.result, intValue);
	}
}


