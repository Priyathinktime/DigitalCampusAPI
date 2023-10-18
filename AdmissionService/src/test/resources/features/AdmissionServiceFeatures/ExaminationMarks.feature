Feature: Examination Marks Tests
This feature includes Examination Marks tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"


@ExaminationMarksTest @AdmissionSaleTest
Scenario: TC-01 Get Exam Marks List with Filter
 Given I send a GET request for Examination Marks from "Get Exam Marks List with Filter" and capture the response body
 When The order request response for Examination Marks has a '200' response code
 
 @ExaminationMarksTest @AdmissionSaleTest
Scenario: TC-02 Get Exam Marks Subject Names
 Given I send a GET request for Examination Marks from "Get Exam Marks Subject Names" and capture the response body
  When The order request response for Examination Marks has a '200' response code
 
 @ExaminationMarksTest @AdmissionSaleTest
 Scenario: TC-03 Save Exam Marks List
Given I send a POST request for Examination Marks with the request body from "Save Exam Marks List.json" and capture the response body
 When The order request response for Examination Marks has a '201' response code
 
 @ExaminationMarksTest @AdmissionSaleTest
 Scenario: TC-04 Get Exam Marks by studentRegId & marksEntryId
 Given I send a GET request for Examination Marks from "Get Exam Marks by studentRegId & marksEntryId" and capture the response body
 When The order request response for Examination Marks has a '200' response code
 
 @ExaminationMarksTest @AdmissionSaleTest
 Scenario: TC-05 Update Exam Marks by studentRegId
Given I send a PUT request for Examination Marks with the request body from "Update Exam Marks by studentRegId.json" and capture the response body
 When The order request response for Examination Marks has a '200' response code

 @ExaminationMarksTest @AdmissionSaleTest
 Scenario: TC-06 Delete Exam Marks by studentRegId
 Given I send a DELETE request for Examination Marks from "Delete Exam Marks by studentRegId" and capture the response body
 When The order request response for Examination Marks has a '200' response code