Feature: ObservationAndInterviewReport Tests
This feature includes ObservationAndInterviewReport tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

  @ObservationAndInterviewReportTest  @AdmissionSaleTest
 Scenario: TC-01 DPS-884 | Save Observation Report
Given I send a POST request for ObservationAndInterviewReport with the request body from "DPS-884 Save Observation Report.json" and capture the response body
When The order request response for ObservationAndInterviewReport has a '201' response code

 @ObservationAndInterviewReportTest  @AdmissionSaleTest
Scenario: TC-02 DPS-865| getByObservationId
 Given I send a GET request for ObservationAndInterviewReport from "DPS-865 getByObservationId" and capture the response body
 When The order request response for ObservationAndInterviewReport has a '200' response code
 
  #@ObservationAndInterviewReportTest
 #Scenario: TC-03 DPS-886 | edit Observation Report
#Given I send a POST request for ObservationAndInterviewReport with the request body from "DPS-886 edit Observation Report.json" and capture the response body
#When The order request response for ObservationAndInterviewReport has a '201' response code

  @ObservationAndInterviewReportTest  @AdmissionSaleTest
 Scenario: TC-04 DPS-864 | getWithFilter
 Given I send a GET request for ObservationAndInterviewReport from "DPS-864 | getWithFilter" and capture the response body
When The order request response for ObservationAndInterviewReport has a '200' response code
