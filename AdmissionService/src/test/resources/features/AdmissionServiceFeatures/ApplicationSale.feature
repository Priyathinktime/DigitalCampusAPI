Feature: Application Sale Tests
This feature includes Application Sale tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"
  

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-01 Appliations Sale List with Filters 
Given I send a POST request for Application sales with the request body from "Appliations Sale List with Filters.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-02 Save Appliations Sale Form CBSE
Given I send a POST request for Application sales with the request body from "Save Appliations Sale Form CBSE.json" and capture the response body
When The order request response for Application sales has a '201' response code
    
@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-03 Save Appliations Sale Form Cambridge
Given I send a POST request for Application sales with the request body from "Save Appliations Sale Form Cambridge.json" and capture the response body
When The order request response for Application sales has a '201' response code
 
 @ApplicationSaleTest @AdmissionSaleTest   
Scenario: TC-04 Update Appliations Sale Form By Id
Given I send a PUT request for Application sales with the request body from "Update Appliations Sale Form By Id.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-05 Update Appliations Sale Payment Status
Given I send a PUT request for Application sales with the request body from "Update Appliations Sale Payment Status.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-06 Get Appliations Sale By Id
 Given I send a GET request for Application sales from "Get Appliations Sale By Id" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-07 Get Appliations Sale By Application Number
Given I send a POST request for Application sales with the request body from "Get Appliations Sale By Application Number.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-08 Send Payment Link Email
Given I send a POST request for Application sales with the request body from "Send Payment Link Email.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-09 Send Email Notification
Given I send a POST request for Application sales with the request body from "Send Email Notification.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-10 Send SMS Notification
Given I send a POST request for Application sales with the request body from "Send SMS Notification.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-11 Front Desk Stats For Applcation Sale
 Given I send a GET request for Application sales from "Front Desk Stats For Applcation Sale" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-12 Application Sale Fee Receipt PDF
Given I send a POST request for Application sales with the request body from "Application Sale Fee Receipt PDF.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-13 Application Sale Fee Receipt Html Preview
Given I send a POST request for Application sales with the request body from "Application Sale Fee Receipt Html Preview.json" and capture the response body
When The order request response for Application sales has a '200' response code

@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-14 Get PreAdmission Subjects for CBSE
 Given I send a GET request for Application sales from "Get PreAdmission Subjects for CBSE" and capture the response body
When The order request response for Application sales has a '200' response code
 
 @ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-15 Get PreAdmission Subjects For Cambridge
 Given I send a GET request for Application sales from "Get PreAdmission Subjects For Cambridge" and capture the response body
When The order request response for Application sales has a '200' response code
 
 @ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-16 Get 2nd or 3rd Languages-1
 Given I send a GET request for Application sales from "Get 2nd or 3rd Languages-1" and capture the response body
 When The order request response for Application sales has a '200' response code
 
 @ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-17 Get 2nd or 3rd Languages-2
 Given I send a GET request for Application sales from "Get 2nd or 3rd Languages-2" and capture the response body
When The order request response for Application sales has a '200' response code
#When verify response value "data[0].languageId" has "1" 
 
 @ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-18 Get classes list for sale dropdown
 Given I send a GET request for Application sales from "Get classes list for sale dropdown" and capture the response body
When The order request response for Application sales has a '200' response code
 
 @ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-19 Get districts list for dropdown
 Given I send a GET request for Application sales from "Get districts list for dropdown" and capture the response body
When The order request response for Application sales has a '200' response code


@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-20 Token
Given I send a POST request for Application sales with the request body from "Token.json" and capture the response body
When The order request response for Application sales has a '200' response code


@ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-21 {{BASE_URL}}/admission/api/admission-service/application-sale
 Given I send a GET request for Application sales from "{{BASE_URL}}/admission/api/admission-service/application-sale" and capture the response body
 When The order request response for Application sales has a '200' response code
 
 @ApplicationSaleTest @AdmissionSaleTest
Scenario: TC-22 Cancel Appliations Sale By Id
Given I send a POST request for Application sales with the request body from "Cancel Appliations Sale By Id.json" and capture the response body
When The order request response for Application sales has a '200' response code

