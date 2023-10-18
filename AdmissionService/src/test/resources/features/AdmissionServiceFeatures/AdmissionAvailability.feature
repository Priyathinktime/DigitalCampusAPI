Feature: Admission Availability Tests
This feature includes Admission Availability tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

@AdmissionAvailabilityTest @AdmissionSaleTest
 Scenario: TC-01 DPS-995 fetch admission availability details
Given I send a POST request for Admission Availability with the request body from "DPS 995 fetch admission availability details.json" and capture the response body
 When The order request response for Admission Availability has a '200' response code
 
@AdmissionAvailabilityTest @AdmissionSaleTest
 Scenario: TC-02 DPS-1062 API to create Admission Availability
Given I send a POST request for Admission Availability with the request body from "DPS 1062 API to create Admission Availability.json" and capture the response body
 When The order request response for Admission Availability has a '201' response code
 
 @AdmissionAvailabilityTest @AdmissionSaleTest
 Scenario: TC-03 DPS-1063 API to edit Admission Availability
Given I send a PUT request for Admission Availability with the request body from "DPS 1063 API to edit Admission Availability.json" and capture the response body
 When The order request response for Admission Availability has a '200' response code
 
 @AdmissionAvailabilityTest @AdmissionSaleTest
 Scenario: TC-04 API to fetch Classes In Admission Availability
 Given I send a GET request for Admission Availability from "API to fetch Classes In Admission Availability" and capture the response body
 When The order request response for Admission Availability has a '200' response code
 
 @AdmissionAvailabilityTest @AdmissionSaleTest
 Scenario: TC-05 API to fetch admission availability details by Id
 Given I send a GET request for Admission Availability from "API to fetch admission availability details by Id" and capture the response body
 When The order request response for Admission Availability has a '200' response code
