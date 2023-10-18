package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import org.json.JSONObject;

import com.thinktimetechno.endpoints.AdmissionAvailabilityEndPoints;
import com.thinktimetechno.endpoints.ApplicationSaleEndPoints;
import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.ExamScheduleEndPoints;
import com.thinktimetechno.endpoints.ExaminationMarksEndPoints;



public class AdmissionAvailabilityStepDefinitions {


	private  AdmissionAvailabilityEndPoints adavail;

	String responseBody ;
	public AdmissionAvailabilityStepDefinitions( AdmissionAvailabilityEndPoints adavail) {
		this.adavail = adavail;
	}


	@Given("I send a POST request for Admission Availability with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		adavail.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( adavail.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	@Given("I send a PUT request for Admission Availability with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		adavail.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@Given("I send a GET request for Admission Availability from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		adavail.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( adavail.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	
	

	@When("The order request response for Admission Availability has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		adavail.verifyResponseStatusValue(adavail.result, intValue);
	}
}


