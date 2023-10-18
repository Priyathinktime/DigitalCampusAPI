Feature: Admission Contribute Stake Tests
This feature includes Admission Contribute Stake tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 @AdmissionContributeStakeTest @AdmissionSaleTest
 Scenario: TC-01 {{BASE_URL}}/admission/api/admission-service/contribute-stake?instituteId=1&searchString=medi&rs=A
Given I send a GET request for Admission Contribute Stake from "{{BASE_URL}}/admission/api/admission-service/contribute-stake?instituteId=1&searchString=medi&rs=A" and capture the response body
When The order request response for Admission Contribute Stake from has a '200' response code
 
