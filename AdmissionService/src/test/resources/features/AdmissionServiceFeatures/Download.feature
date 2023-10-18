Feature: Download Tests
This feature includes Download tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 @DownloadTest @AdmissionSaleTest
 Scenario: TC-01 Download Exam Marks Template
Given I send a GET request for Download from "Download Exam Marks Template" and capture the response body
When The order request response for Download has a '200' response code
 
 @DownloadTest @AdmissionSaleTest
 Scenario: TC-02 Download Exam Marks Template2
Given I send a GET request for Download from "Download Exam Marks Template2" and capture the response body
 When The order request response for Download has a '200' response code