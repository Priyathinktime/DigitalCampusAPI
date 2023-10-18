Feature: Admission Sibling Verification Tests
This feature includes Admission Sibling Verification tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"
 
 @AdmissionSiblingVerificationTest @AdmissionSaleTest
 Scenario: TC-01 DPS-891 API | GET Sibling Verification List with Filters
Given I send a POST request for Admission Sibling Verification with the request body from "DPS 891 API GET Sibling Verification List with Filters.json" and capture the response body
 When The order request response for Admission Sibling Verification has a '200' response code

 @AdmissionSiblingVerificationTest @AdmissionSaleTest
 Scenario: TC-02 DPS-892 GET Sibling Verification Details by ID
 Given I send a GET request for Admission Sibling Verification from "DPS 892 GET Sibling Verification Details by ID" and capture the response body
 When The order request response for Admission Sibling Verification has a '200' response code
 
 @AdmissionSiblingVerificationTest @AdmissionSaleTest
 Scenario: TC-03 API to Count List Of Sibling Verification Records By Approval Status
 Given I send a GET request for Admission Sibling Verification from "API to Count List Of Sibling Verification Records By Approval Status" and capture the response body
 When The order request response for Admission Sibling Verification has a '200' response code
 
 @AdmissionSiblingVerificationTest @AdmissionSaleTest
 Scenario: TC-04 DPS-893 Update status Sibling Verification By ID
Given I send a PUT request for Admission Sibling Verification with the request body from "DPS 893 Update status Sibling Verification By ID.json" and capture the response body
 When The order request response for Admission Sibling Verification has a '200' response code
 
 
