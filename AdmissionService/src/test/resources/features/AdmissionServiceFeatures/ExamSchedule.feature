Feature: Exam Schedule Tests
This feature includes Exam Schedule tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

@ExamScheduleTest  @AdmissionSaleTest
Scenario: TC-01 Exam Schedule List with Filters 
 Given I send a GET request for Exam Schedule from "Exam Schedule List with Filters" and capture the response body
 When The order request response for Exam Schedule has a '200' response code

@ExamScheduleTest  @AdmissionSaleTest
Scenario: TC-02 Save Exam Schedule
Given I send a POST request for Exam Schedule with the request body from "Save Exam Schedule.json" and capture the response body
 When The order request response for Exam Schedule has a '200' response code

@ExamScheduleTest  @AdmissionSaleTest
Scenario: TC-03 Update Exam Schedule for Students
Given I send a PUT request for Exam Schedule with the request body from "Update Exam Schedule for Students.json" and capture the response body
 When The order request response for Exam Schedule has a '200' response code

@ExamScheduleTest  @AdmissionSaleTest
Scenario: TC-04 Update Exam Schedule By ID
Given I send a PUT request for Exam Schedule with the request body from "Update Exam Schedule By ID.json" and capture the response body
 When The order request response for Exam Schedule has a '200' response code

@ExamScheduleTest  @AdmissionSaleTest
Scenario: TC-05 Delete Exam Schedule By ID
 Given I send a DELETE request for Exam Schedule from "Delete Exam Schedule By ID" and capture the response body
 When The order request response for Exam Schedule has a '200' response code
 
 @ExamScheduleTest  @AdmissionSaleTest
 Scenario: TC-06 Cancel Student Registration
Given I send a POST request for Exam Schedule with the request body from "Cancel Student Registration.json" and capture the response body
 When The order request response for Exam Schedule has a '200' response code

@ExamScheduleTest  @AdmissionSaleTest
Scenario: TC-07 Get Exam Schedule By ID 
 Given I send a GET request for Exam Schedule from "Get Exam Schedule By ID" and capture the response body
 When The order request response for Exam Schedule has a '200' response code
 
 @ExamScheduleTest  @AdmissionSaleTest
Scenario: TC-08 Get Students List for Exam Schedule
 Given I send a GET request for Exam Schedule from "Get Students List for Exam Schedule" and capture the response body
 When The order request response for Exam Schedule has a '200' response code
