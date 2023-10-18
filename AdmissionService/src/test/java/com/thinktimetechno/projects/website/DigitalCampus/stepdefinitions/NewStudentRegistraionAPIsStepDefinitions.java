package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.NewStudentRegistraionAPIsEndPoints;



public class NewStudentRegistraionAPIsStepDefinitions {


	private NewStudentRegistraionAPIsEndPoints newstren;


	public NewStudentRegistraionAPIsStepDefinitions( NewStudentRegistraionAPIsEndPoints newstren) {
		this.newstren = newstren;
	}


	@When("I send a POST request for New Student Registraion APIs with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		newstren.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( newstren.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	@When("I send a PUT request for New Student Registraion APIs with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		newstren.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@When("I send a GET request for New Student Registraion APIs from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException, InterruptedException {

		Response result=newstren.applicationSalesfetchPayload(AuthExample.token,name);
         System.out.println(result.getBody().asString());
	}
	
	
	@Then("The order request response for New Student Registraion APIs has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		newstren.verifyResponseStatusValue(newstren.result, intValue);
	}
}


