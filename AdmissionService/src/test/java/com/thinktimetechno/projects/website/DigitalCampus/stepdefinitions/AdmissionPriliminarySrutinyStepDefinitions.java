package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.endpoints.AdmissionPriliminaryScrutinyEndPoints;

import com.thinktimetechno.endpoints.AuthExample;


public class AdmissionPriliminarySrutinyStepDefinitions {


	private AdmissionPriliminaryScrutinyEndPoints adprsce;


	public AdmissionPriliminarySrutinyStepDefinitions( AdmissionPriliminaryScrutinyEndPoints adprsce) {
		this.adprsce = adprsce;
	}

	@When("I send a POST request for Admission Priliminary Scrutiny with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		adprsce.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( adprsce.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	
	
	@When("I send a GET request for Admission Priliminary Scrutiny from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		adprsce.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( adprsce.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	

	

	@Then("The order request response for Admission Priliminary Scrutiny has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		adprsce.verifyResponseStatusValue(adprsce.result, intValue);
	}
}


