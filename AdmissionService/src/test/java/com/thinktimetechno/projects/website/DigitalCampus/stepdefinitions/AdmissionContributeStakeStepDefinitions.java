package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import org.json.JSONObject;

import com.thinktimetechno.endpoints.AdmissionContributeStakeEndPoints;
import com.thinktimetechno.endpoints.ApplicationSaleEndPoints;
import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.DownloadEndPoints;
import com.thinktimetechno.endpoints.ExamScheduleEndPoints;
import com.thinktimetechno.endpoints.ExaminationMarksEndPoints;



public class AdmissionContributeStakeStepDefinitions {

	private Response result;
	private  AdmissionContributeStakeEndPoints adctrstk;

	String responseBody ;
	public AdmissionContributeStakeStepDefinitions( AdmissionContributeStakeEndPoints adctrstk) {
		this.adctrstk = adctrstk;
	}
	AuthExample auth =new AuthExample();
	@Given("I send a GET request for Admission Contribute Stake from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		adctrstk.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( adctrstk.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}

//
//	
////	@Then("^The order request response has a '(\\d+)' response code$")
////	public void the_response_has_the_correct_response_code(Integer rc) {
////		examMark.verifyResponseStatusValue(examMark.result, rc.intValue());
////		
////	}

@When("The order request response for Admission Contribute Stake from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		adctrstk.verifyResponseStatusValue(adctrstk.result, intValue);
	}
}


