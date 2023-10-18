Feature: Exam Subjects Tests
This feature includes Exam Subjects tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

@ExamSubjectsTest @AdmissionSaleTest
 Scenario: TC-01 DPS-1006 fetch admission exam subjects details
Given I send a POST request for Exam Subjects with the request body from "DPS 1006 fetch admission exam subjects details.json" and capture the response body
 When The order request response for Exam Subjects has a '200' response code
 
@ExamSubjectsTest @AdmissionSaleTest
 Scenario: TC-02 DPS-1068 add subject to a class
Given I send a POST request for Exam Subjects with the request body from "DPS 1068 add subject to a class.json" and capture the response body
 When The order request response for Exam Subjects has a '201' response code
 
 @ExamSubjectsTest  @AdmissionSaleTest
 Scenario: TC-03 DPS-1070 fetch subject details based on ID
 Given I send a GET request for Exam Subjects from "DPS 1070 fetch subject details based on ID" and capture the response body
 When The order request response for Exam Subjects has a '200' response code
 
  @ExamSubjectsTest  @AdmissionSaleTest
 Scenario: TC-04 DPS-1069 edit subjects from a class
Given I send a PUT request for Exam Subjects with the request body from "DPS 1069 edit subjects from a class.json" and capture the response body
 When The order request response for Exam Subjects has a '200' response code
 
 @ExamSubjectsTest  @AdmissionSaleTest
 Scenario: TC-05 DPS-1115 API to fetch List of class having Stream Group
 Given I send a GET request for Exam Subjects from "DPS 1115 API to fetch List of class having Stream Group" and capture the response body
 When The order request response for Exam Subjects has a '200' response code
 
  @ExamSubjectsTest  @AdmissionSaleTest
 Scenario: TC-06 DPS-1116 API to fetch Subjects by class while Saving Exam Subjects
 Given I send a GET request for Exam Subjects from "DPS 1116 API to fetch Subjects by class while Saving Exam Subjects" and capture the response body
 When The order request response for Exam Subjects has a '200' response code
