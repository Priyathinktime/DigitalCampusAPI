package com.thinktimetechno.listeners;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import org.json.JSONObject;

import com.thinktimetechno.endpoints.AgeCriteriaEndPoints;
import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.endpoints.PanelMembersEndPoints;



public class AgeCriteriaStepDefinitions {


	private  AgeCriteriaEndPoints agecri;

	String responseBody ;
	public AgeCriteriaStepDefinitions( AgeCriteriaEndPoints agecri) {
		this.agecri = agecri;
	}


	@Given("I send a POST request for Age Criteria with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		agecri.applicationSalesCreatePayload(AuthExample.token,jsonFile);
		System.out.println( agecri.applicationSalesCreatePayload(AuthExample.token,jsonFile).getBody().asString());
		

	}
	@Given("I send a PUT request for Age Criteria with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile) throws IOException {

		agecri.applicationSalesUpdatePayload(AuthExample.token,jsonFile);
	}
	@Given("I send a GET request for Age Criteria from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		agecri.applicationSalesfetchPayload(AuthExample.token,name);
     System.out.println( agecri.applicationSalesfetchPayload(AuthExample.token,name).getBody().asString());
	}
	
	
	@When("The order request response for Age Criteria has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		agecri.verifyResponseStatusValue(agecri.result, intValue);
	}
}


