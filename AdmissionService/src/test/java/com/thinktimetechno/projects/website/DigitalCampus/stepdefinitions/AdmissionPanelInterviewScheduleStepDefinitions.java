package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.endpoints.AdmissionPanelInterviewScheduleEndPoints;
import com.thinktimetechno.endpoints.AuthExample;



public class AdmissionPanelInterviewScheduleStepDefinitions {

//	private Response result;
	private  AdmissionPanelInterviewScheduleEndPoints admpnlintrwschl;

	String responseBody ;
	public AdmissionPanelInterviewScheduleStepDefinitions( AdmissionPanelInterviewScheduleEndPoints admpnlintrwschl) {
		this.admpnlintrwschl = admpnlintrwschl;
	}
	AuthExample auth =new AuthExample();
	@Given("I send a POST request for Admission Panel Interview Schedule with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		admpnlintrwschl.applicationSalesCreatePayload(AuthExample.token,jsonFile);
//		System.out.println( admpnlintrwschl.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
	}

	@Given("I send a PUT request for Admission Panel Interview Schedule with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		admpnlintrwschl.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	 
	 @Given("I send a GET request for Admission Panel Interview Schedule from {string} and capture the response body")
	 public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		 admpnlintrwschl.applicationSalesfetchPayload(AuthExample.token,name);
	     System.out.println( admpnlintrwschl.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
		}
	 

@Given("I send a DELETE request for Admission Panel Interview Schedule from {string} and capture the response body")
public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
	admpnlintrwschl.applicationSalesDeletePayload(AuthExample.token, name);
}
	 


@When("The order request response for Admission Panel Interview Schedule has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		admpnlintrwschl.verifyResponseStatusValue(admpnlintrwschl.result, intValue);
	}
}
