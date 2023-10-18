package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.EnquiryEndPoints;



public class EnquiryStepDefinitions {


	private  EnquiryEndPoints enquire;

	String responseBody ;
	public EnquiryStepDefinitions( EnquiryEndPoints enquire) {
		this.enquire = enquire;
	}


   @Given("I send a POST request for Enquiry with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		enquire.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( enquire.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
    @Given("I send a PUT request for Enquiry with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		enquire.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@Given("I send a GET request for Enquiry from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		enquire.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( enquire.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	@Given("I send a DELETE request for Enquiry from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		enquire.applicationSalesDeletePayload(AuthExample.token, name);
	}

	
	@When("The order request response for Enquiry has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		enquire.verifyResponseStatusValue(enquire.result, intValue);
	}
}


