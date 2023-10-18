package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.endpoints.AdmissionCategoryEndPoints;
import com.thinktimetechno.endpoints.AuthExample;




public class AdmissionCategoryStepDefinitions {


	private  AdmissionCategoryEndPoints admiss;

	String responseBody ;
	public AdmissionCategoryStepDefinitions( AdmissionCategoryEndPoints admiss) {
		this.admiss = admiss;
	}


	@Given("I send a GET request for fetch admission category from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		admiss.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( admiss.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}


	@When("The order request response for fetch admission category from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		admiss.verifyResponseStatusValue(admiss.result, intValue);
	}
}


