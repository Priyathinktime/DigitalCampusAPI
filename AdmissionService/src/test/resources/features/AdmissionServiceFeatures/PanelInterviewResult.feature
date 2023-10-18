Feature: PanelInterviewResult Tests
This feature includes PanelInterviewResult tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

@PanelInterviewResultTest  @AdmissionSaleTest
Scenario: TC01 DPS-888 API POST Add Panel Interview Results
Given I send a POST request for PanelInterviewResult with the request body from "TC01 DPS-888 API POST Add Panel Interview Results.json" and capture the response body
When The order request response for PanelInterviewResult has a '201' response code

@PanelInterviewResultTest  @AdmissionSaleTest
 Scenario: TC-02 DPS-887 API  GET Panel interview results with Filters
Given I send a GET request for PanelInterviewResult from "DPS-887 API  GET Panel interview results with Filters" and capture the response body
When The order request response for PanelInterviewResult has a '200' response code

@PanelInterviewResultTest  @AdmissionSaleTest
Scenario: TC-03 DPS-889 API POST Edit Panel Interview Results
Given I send a PUT request for PanelInterviewResult with the request body from "DPS-889 API POST Edit Panel Interview Results.json" and capture the response body
When The order request response for PanelInterviewResult has a '200' response code
 
 @PanelInterviewResultTest  @AdmissionSaleTest
 Scenario: TC-04 Fetch Panel Interview Result By Id
Given I send a GET request for PanelInterviewResult from "Fetch Panel Interview Result By Id" and capture the response body
When The order request response for PanelInterviewResult has a '200' response code
