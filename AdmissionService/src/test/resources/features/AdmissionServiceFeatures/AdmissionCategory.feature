Feature: Admission Category Tests
This feature includes Admission Category tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

@AdmissionCategoryTest @AdmissionSaleTest
 Scenario: TC-01 fetch admission category
Given I send a GET request for fetch admission category from "fetch admission category" and capture the response body
When The order request response for fetch admission category from has a '200' response code
 