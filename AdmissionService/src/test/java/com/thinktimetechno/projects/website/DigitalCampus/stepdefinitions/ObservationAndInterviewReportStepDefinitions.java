package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.endpoints.AdmissionPriliminaryScrutinyEndPoints;

import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.ObservationAndInterviewReportEndPoints;




public class ObservationAndInterviewReportStepDefinitions {


	private ObservationAndInterviewReportEndPoints Observe;


	public ObservationAndInterviewReportStepDefinitions( ObservationAndInterviewReportEndPoints Observe) {
		this.Observe = Observe;
	}


	@Given("I send a POST request for ObservationAndInterviewReport with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		Observe.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( Observe.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	
	
	@Given("I send a GET request for ObservationAndInterviewReport from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		Observe.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( Observe.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	

	

	@When("The order request response for ObservationAndInterviewReport has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		Observe.verifyResponseStatusValue(Observe.result, intValue);
	}
}


