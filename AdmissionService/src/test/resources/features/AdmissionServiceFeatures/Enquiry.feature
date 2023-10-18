Feature: Enquiry Tests
This feature includes Enquiry tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

 @EnquiryTest @AdmissionSaleTest
Scenario: TC-01 DPS-842 API | GET View enquiry details by Id
 Given I send a GET request for Enquiry from "DPS-842 API GET View enquiry details by Id" and capture the response body
 When The order request response for Enquiry has a '200' response code
 
 @EnquiryTest @AdmissionSaleTest
Scenario: TC-02 DPS-845 API | POST Update Enquiry Details/Status
Given I send a PUT request for Enquiry with the request body from "DPS-845 API POST Update Enquiry Details Status.json" and capture the response body
When The order request response for Enquiry has a '200' response code

 @EnquiryTest @AdmissionSaleTest
 Scenario: TC-03 DPS-843 API | POST Delete enquiry by ID
 Given I send a DELETE request for Enquiry from "DPS-843 API POST Delete enquiry by ID" and capture the response body
 When The order request response for Enquiry has a '200' response code
 
 @EnquiryTest @AdmissionSaleTest
Scenario: TC-04 DPS-841 API POST Add new Offline Enquiry
Given I send a POST request for Enquiry with the request body from "DPS-841 API POST Add new Offline Enquiry.json" and capture the response body
When The order request response for Enquiry has a '200' response code
 
  @EnquiryTest @AdmissionSaleTest
Scenario: TC-05 DPS-840 API | GET All Enquiries with Filters
Given I send a GET request for Enquiry from "DPS-840 API GET All Enquiries with Filters" and capture the response body
 When The order request response for Enquiry has a '200' response code
 
  @EnquiryTest @AdmissionSaleTest
Scenario: TC-06 Fetch count of  all enquiry records
 Given I send a GET request for Enquiry from "Fetch count of  all enquiry records" and capture the response body
 When The order request response for Enquiry has a '200' response code