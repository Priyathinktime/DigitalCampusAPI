package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import java.io.IOException;

import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.DownloadEndPoints;
import com.thinktimetechno.endpoints.ExaminationMarksEndPoints;



public class DownloadStepDefinitions {


	private  DownloadEndPoints dwnd;

	String responseBody ;
	public DownloadStepDefinitions( DownloadEndPoints dwnd) {
		this.dwnd = dwnd;
	}



	@Given("I send a GET request for Download from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		dwnd.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( dwnd.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	

	
//	@When("^The order request response has a '(\\d+)' response code$")
//	public void the_response_has_the_correct_response_code(Integer rc) {
//		examMark.verifyResponseStatusValue(examMark.result, rc.intValue());
//		
//	}
	
	@When("The order request response for Download has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		dwnd.verifyResponseStatusValue(dwnd.result, intValue);
	}
}


