Feature: Proposed Admissions Tests
This feature includes Proposed Admissions tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 @ProposedAdmissionsTest @AdmissionSaleTest
 Scenario: TC-01 DPS-997 API proposed admission list
Given I send a GET request for Proposed Admissions from "DPS-997 API proposed admission list" and capture the response body
When The order request response for Proposed Admissions from has a '200' response code
 
@ProposedAdmissionsTest @AdmissionSaleTest
 Scenario: TC-02 DPS-1064 API to save/update proposed admission
Given I send a POST request for Proposed Admissions from with the request body "DPS 1064 API to save update proposed admission.json" and capture the response body
 When The order request response for Proposed Admissions from has a '201' response code