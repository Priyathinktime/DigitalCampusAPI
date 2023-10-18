Feature: AdmissionPanelInterviewSchedule Tests
This feature includes AdmissionPanelInterviewSchedule tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"
  

@AdmissionPanelInterviewScheduleTest @AdmissionSaleTest
Scenario: TC-01 DPS 940 fetch list of students for scheduling the panel interview
Given I send a POST request for Admission Panel Interview Schedule with the request body from "DPS 940 fetch list of students for scheduling the panel interview.json" and capture the response body
When The order request response for Admission Panel Interview Schedule has a '200' response code

@AdmissionPanelInterviewScheduleTest @AdmissionSaleTest
Scenario: TC-02 DPS 878 API GET Interview Schedule list with Filters
Given I send a POST request for Admission Panel Interview Schedule with the request body from "DPS 878 API GET Interview Schedule list with Filters.json" and capture the response body
When The order request response for Admission Panel Interview Schedule has a '200' response code
    
@AdmissionPanelInterviewScheduleTest @AdmissionSaleTest
Scenario: TC-03 DPS 879 API POST Schedule Interview
Given I send a POST request for Admission Panel Interview Schedule with the request body from "DPS 879 API POST Schedule Interview.json" and capture the response body
When The order request response for Admission Panel Interview Schedule has a '201' response code
 
@AdmissionPanelInterviewScheduleTest @AdmissionSaleTest
Scenario: TC-04 DPS 880 API GET View interview schedule details
 Given I send a GET request for Admission Panel Interview Schedule from "DPS 880 API GET View interview schedule details" and capture the response body
When The order request response for Admission Panel Interview Schedule has a '200' response code

@AdmissionPanelInterviewScheduleTest @AdmissionSaleTest
Scenario: TC-05 DPS 881 API POST Edit update interview schedule details
Given I send a PUT request for Admission Panel Interview Schedule with the request body from "DPS 881 API POST Edit update interview schedule details.json" and capture the response body
When The order request response for Admission Panel Interview Schedule has a '200' response code

@AdmissionPanelInterviewScheduleTest @AdmissionSaleTest
Scenario: TC-06 DPS 882 API | POST Delete interview schedule
 Given I send a DELETE request for Admission Panel Interview Schedule from "DPS 882 API POST Delete interview schedule" and capture the response body
 When The order request response for Admission Panel Interview Schedule has a '204' response code



