Feature: Evaluation Process Tests
This feature includes Evaluation Process tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 
  @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-01 DPS-1074 Assign evolution process to a class
Given I send a POST request for Evaluation Process with the request body from "DPS 1074 Assign evolution process to a class.json" and capture the response body
 When The order request response for Evaluation Process has a '201' response code

  @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-02 DPS-1014 fetch admission evaluation process details
 Given I send a GET request for Evaluation Process from "DPS 1014 fetch admission evaluation process details" and capture the response body
 When The order request response for Evaluation Process has a '200' response code
 
  @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-03 DPS-1075 Fetch evaluation details from a class based on given ID
 Given I send a GET request for Evaluation Process from "DPS 1075 Fetch evaluation details from a class based on given ID" and capture the response body
 When The order request response for Evaluation Process has a '200' response code
 
  @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-04 DPS-1106 Update evolution process to a class id
Given I send a PUT request for Evaluation Process with the request body from "DPS 1106 Update evolution process to a class id.json" and capture the response body
 When The order request response for Evaluation Process has a '200' response code
 
  @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-05 DPS-1105 API to fetch classes for a given Evaluation
 Given I send a GET request for Evaluation Process from "DPS 1105 API to fetch classes for a given Evaluation" and capture the response body
 When The order request response for Evaluation Process has a '200' response code
 
  @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-06 API to fetch Institute Evaluations
 Given I send a GET request for Evaluation Process from "API to fetch Institute Evaluations" and capture the response body
 When The order request response for Evaluation Process has a '200' response code
 
   @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-07 Admission Documents By classId
 Given I send a GET request for Evaluation Process from "API to fetch Classes While Adding in Evaluation Process" and capture the response body
 When The order request response for Evaluation Process has a '200' response code
 
  @EvaluationProcessTest  @AdmissionSaleTest
 Scenario: TC-08 Admission Documents By classId
 Given I send a GET request for Evaluation Process from "Admission Documents By classId" and capture the response body
 When The order request response for Evaluation Process has a '200' response code
