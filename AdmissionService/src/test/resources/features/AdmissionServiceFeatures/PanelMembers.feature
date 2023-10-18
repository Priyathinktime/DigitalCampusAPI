Feature: Panel Members Tests
This feature includes Panel Members tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

@PanelMembersTest  @AdmissionSaleTest
 Scenario: TC-01 DPS-1010 fetch admission panel members details
Given I send a POST request for Panel Members with the request body from "DPS 1010 fetch admission panel members details.json" and capture the response body
 When The order request response for Panel Members has a '200' response code
 
@PanelMembersTest  @AdmissionSaleTest
 Scenario: TC-02 DPS-1071 Add panel members and assign to classes
Given I send a POST request for Panel Members with the request body from "DPS 1071 Add panel members and assign to classes.json" and capture the response body
 When The order request response for Panel Members has a '201' response code
 
 @PanelMembersTest  @AdmissionSaleTest
 Scenario: TC-03 API to fetch Employees
 Given I send a GET request for Panel Members from "API to fetch Employees" and capture the response body
 When The order request response for Panel Members has a '200' response code
 
  @PanelMembersTest  @AdmissionSaleTest
 Scenario: TC-04 DPS-1072 Edit panel members and assign to classes
Given I send a PUT request for Panel Members with the request body from "DPS 1072 Edit panel members and assign to classes.json" and capture the response body
 When The order request response for Panel Members has a '200' response code
 
 @PanelMembersTest  @AdmissionSaleTest
 Scenario: TC-05 DPS-1073 Fetch panel members details for a given ID
 Given I send a GET request for Panel Members from "DPS 1073 Fetch panel members details for a given ID" and capture the response body
 When The order request response for Panel Members has a '200' response code
