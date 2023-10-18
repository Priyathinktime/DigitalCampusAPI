Feature: Admission Priliminary Scrutiny Tests
This feature includes Admission Priliminary Scrutiny tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 @AdmissionPriliminaryScrutinyTest @AdmissionSaleTest
Scenario: TC-01 DPS-864 API To Fetch Scrutiny List With FIlters.
 Given I send a GET request for Admission Priliminary Scrutiny from "DPS-864 API To Fetch Scrutiny List With FIlters." and capture the response body
 When The order request response for Admission Priliminary Scrutiny has a '200' response code
 
 #@AdmissionPriliminaryScrutinyTest
 #Scenario: DPS-866 API | POST  Update Accept/Reject/OnHold application in Scrutiny
#Given I send a POST request for Admission Priliminary Scrutiny with the request body from "DPS-866 API  POST  Update Accept Reject OnHold application in Scrutiny.json" and capture the response body
 #When The order request response for Admission Priliminary Scrutiny has a '201' response code

 @AdmissionPriliminaryScrutinyTest @AdmissionSaleTest
Scenario: TC-02 API to fetch Admission Preliminary Scrutiny By Id.
 Given I send a GET request for Admission Priliminary Scrutiny from "API to fetch Admission Preliminary Scrutiny By Id." and capture the response body
  When The order request response for Admission Priliminary Scrutiny has a '200' response code
 
 @AdmissionPriliminaryScrutinyTest @AdmissionSaleTest
Scenario: TC-03 API to fetch Documents for Approval
 Given I send a GET request for Admission Priliminary Scrutiny from "API to fetch Documents for Approval" and capture the response body
 When The order request response for Admission Priliminary Scrutiny has a '200' response code

 @AdmissionPriliminaryScrutinyTest @AdmissionSaleTest
 Scenario: TC-04 API to APPROVE\RECONSIDER Documents
Given I send a POST request for Admission Priliminary Scrutiny with the request body from "API to APPROVE RECONSIDER Documents.json" and capture the response body
 When The order request response for Admission Priliminary Scrutiny has a '200' response code

 @AdmissionPriliminaryScrutinyTest @AdmissionSaleTest
 Scenario: TC-05 API to Approve Academics Approval
Given I send a POST request for Admission Priliminary Scrutiny with the request body from "API to Approve Academics Approval.json" and capture the response body
 When The order request response for Admission Priliminary Scrutiny has a '200' response code

 @AdmissionPriliminaryScrutinyTest @AdmissionSaleTest
 Scenario: TC-06 API to Approve Head Dept Approval
Given I send a POST request for Admission Priliminary Scrutiny with the request body from "API to Approve Head Dept Approval.json" and capture the response body
 When The order request response for Admission Priliminary Scrutiny has a '200' response code
