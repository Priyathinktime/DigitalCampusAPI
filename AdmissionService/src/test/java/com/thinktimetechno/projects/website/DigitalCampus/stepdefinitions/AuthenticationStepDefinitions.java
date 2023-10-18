package com.thinktimetechno.projects.website.DigitalCampus.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

import org.json.JSONObject;

import com.thinktimetechno.endpoints.ApplicationSaleEndPoints;
import com.thinktimetechno.endpoints.AuthExample;
import com.thinktimetechno.utils.LogUtils;



public class AuthenticationStepDefinitions {


	AuthExample auth =new AuthExample();
    @Given("Generate an API token with the  request body from {string}")
    public void genratetoken(String jsonfile) throws IOException {
    	 auth.generateToken(jsonfile);
    }

}


