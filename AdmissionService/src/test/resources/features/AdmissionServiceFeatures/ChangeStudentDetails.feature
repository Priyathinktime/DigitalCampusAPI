Feature: Change Student Details Tests
This feature includes Change Student Details tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 @ChangeStudentDetailsTest @AdmissionSaleTest
 Scenario: TC-01 API to fetch Student Data By regNo||studentName
Given I send a GET request for Change Student Details from "API to fetch Student Data By regNo studentName" and capture the response body
When The order request response for Change Student Details has a '200' response code

@ChangeStudentDetailsTest @AdmissionSaleTest
Scenario: TC-02 API to fetch Change Student Details List With Filters
Given I send a POST request for Change Student Details with the request body from "API to fetch Change Student Details List With Filters.json" and capture the response body
Then The order request response for Change Student Details has a '200' response code
 
 @ChangeStudentDetailsTest @AdmissionSaleTest
 Scenario: TC-03 API to fetch change student details by Id
Given I send a GET request for Change Student Details from "API to fetch change student details by Id" and capture the response body
When The order request response for Change Student Details has a '200' response code
 
@ChangeStudentDetailsTest @AdmissionSaleTest
Scenario: TC04 API to save the student change details
Given I send a POST request for Change Student Details with the request body from "API to save the student change details.json" and capture the response body
Then The order request response for Change Student Details has a '200' response code
 
 @ChangeStudentDetailsTest @AdmissionSaleTest
 Scenario: TC-05 Exam Schedule Students List
Given I send a GET request for Change Student Details from "Exam Schedule Students List" and capture the response body
When The order request response for Change Student Details has a '200' response code
 
 @ChangeStudentDetailsTest @AdmissionSaleTest
 Scenario: TC-06 Settings By Key
Given I send a GET request for Change Student Details from "Settings By Key" and capture the response body
When The order request response for Change Student Details has a '200' response code
  
 @ChangeStudentDetailsTest @AdmissionSaleTest
 Scenario: TC-07 API Health
Given I send a GET request for Change Student Details from "API Health" and capture the response body
When The order request response for Change Student Details has a '200' response code
  
 @ChangeStudentDetailsTest @AdmissionSaleTest
 Scenario: TC-08 API to fetch list of uploaded images for a registered student
Given I send a GET request for Change Student Details from "API to fetch list of uploaded images for a registered student" and capture the response body
When The order request response for Change Student Details has a '201' response code