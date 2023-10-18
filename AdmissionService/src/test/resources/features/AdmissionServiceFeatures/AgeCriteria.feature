Feature: Age Criteria Tests
This feature includes Age Criteria tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 @AgeCriteriaTest  @AdmissionSaleTest
 Scenario: TC-01 DPS-1002 fetch admission age criteria details
 Given I send a GET request for Age Criteria from "DPS 1002 fetch admission age criteria details" and capture the response body
 When The order request response for Age Criteria has a '200' response code
 
  @AgeCriteriaTest  @AdmissionSaleTest
 Scenario: TC-02 DPS-1067 Fetch age criteria by ID
 Given I send a GET request for Age Criteria from "DPS 1067 Fetch age criteria by ID" and capture the response body
 When The order request response for Age Criteria has a '200' response code
 
 @AgeCriteriaTest  @AdmissionSaleTest
 Scenario: TC-03 DPS-1065 generate new age creteria for current academicYear
Given I send a POST request for Age Criteria with the request body from "DPS 1065 generate new age creteria for current academicYear.json" and capture the response body
 When The order request response for Age Criteria has a '201' response code
 
  @AgeCriteriaTest  @AdmissionSaleTest
 Scenario: TC-04 DDPS-1066 API to edit age criteria
Given I send a PUT request for Age Criteria with the request body from "DPS 1066 API to edit age criteria.json" and capture the response body
 When The order request response for Age Criteria has a '200' response code
