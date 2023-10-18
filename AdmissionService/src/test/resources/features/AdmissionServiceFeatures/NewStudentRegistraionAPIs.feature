Feature: New Student Registraion APIs Tests
This feature includes New Student Registraion APIs tests using RESTFul services
	
Background:
Given Generate an API token with the  request body from "Login.json"

  @NewStudentRegistraionAPIsTest @AdmissionSaleTest 
 Scenario: TC-01 DPS 939 upload documents for student registrations
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 939 upload documents for student registrations.pdf" and capture the response body
When The order request response for New Student Registraion APIs has a '201' response code

  @NewStudentRegistraionAPIsTest @AdmissionSaleTest @NewAPIsTest 
 Scenario: TC-02 DPS 938 save or update images for new registration student
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 938 save or update images for new registration student.json" and capture the response body
When The order request response for New Student Registraion APIs has a '201' response code

@NewStudentRegistraionAPIsTest @AdmissionSaleTest   @NewAPIsTest
Scenario: TC-03  DPS 858 view application documents for a registered student
 Given I send a GET request for New Student Registraion APIs from "DPS-858 view application documents for a registered student" and capture the response body
When The order request response for New Student Registraion APIs has a '201' response code
 
 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-04 API to create student registration form
Given I send a POST request for New Student Registraion APIs with the request body from "API to create student registration form.json" and capture the response body
When The order request response for New Student Registraion APIs has a '201' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-05  API to update student registration profile
Given I send a PUT request for New Student Registraion APIs with the request body from "API to update student registration profile.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-06 DPS-1161 API to to update student registration curricular activities
Given I send a PUT request for New Student Registraion APIs with the request body from "DPS 1161 API to to update student registration curricular activities.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-07 API to update student communication details
Given I send a PUT request for New Student Registraion APIs with the request body from "API to update student communication details.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-08 API to update student last year results
Given I send a PUT request for New Student Registraion APIs with the request body from "API to update student last year results.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-09 API to update student sibling details
Given I send a PUT request for New Student Registraion APIs with the request body from "API to update student sibling details.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-10 API to update student parent details
Given I send a PUT request for New Student Registraion APIs with the request body from "API to update student parent details.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest @SalTest 
Scenario: TC-11 DPS 832 API to Fetch student by registration number, branch and academic year
 Given I send a GET request for New Student Registraion APIs from "Get Exam Marks List with Filter" and capture the response body
 Given I send a GET request for New Student Registraion APIs from "DPS 832 API to Fetch student by registration number, branch and academic year" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code

  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-12 DPS 836 API to fetch list of registered students
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 836 API to fetch list of registered students.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-13 API to fetch student profile by registration id
 Given I send a GET request for New Student Registraion APIs from "API to fetch student profile by registration id" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-14 API to fetch student sibling details by registration id.
 Given I send a GET request for New Student Registraion APIs from "API to fetch student sibling details by registration id." and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-15 API to fetch student parent details by registration id.
 Given I send a GET request for New Student Registraion APIs from "API to fetch student parent details by registration id." and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-16 API to fetch student last year results by registration id.
 Given I send a GET request for New Student Registraion APIs from "API to fetch student last year results by registration id." and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest @NewAPIsTest
 Scenario: TC-17 Upload file for admission
Given I send a POST request for New Student Registraion APIs with the request body from "Upload file for admission.json" and capture the response body
When The order request response for New Student Registraion APIs has a '201' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest  @NewAPIsTest 
Scenario: TC-18 DPS 860 API to get view of registration form after submission
 Given I send a GET request for New Student Registraion APIs from "DPS - 860 API to get view of registration form after submission" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code

  @NewStudentRegistraionAPIsTest @AdmissionSaleTest  @NewAPIsTest @SaleTest
 Scenario: TC-19 DPS 860 API to download student registration pdf 
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 860 API to download student registration pdf.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest @NewAPIsTest  @SaleTest
 Scenario: TC-20 API to calculate points in tab after student registration 
Given I send a PUT request for New Student Registraion APIs with the request body from "API to calculate points in tab after student registration.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest @NewAPIsTest  @SaleTest
 Scenario: TC-21 API to cancel admission registration
Given I send a PUT request for New Student Registraion APIs with the request body from "API to cancel admission registration.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-22 DPS 1324 API to fetch registration details by username
 Given I send a GET request for New Student Registraion APIs from "DPS 1324 API to fetch registration details by username" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-23 DPS 1327 Document list API needs to be integrated
 Given I send a GET request for New Student Registraion APIs from "DPS 1327 Document list API needs to be integrated" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-24 DPS 1329 Submission tab with otp
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 1329 Submission tab with otp.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

  @NewStudentRegistraionAPIsTest @AdmissionSaleTest @NewAPIsTest
 Scenario: TC-25 DPS 1329 verify OTP
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 1329 verify OTP.json" and capture the response body
When The order request response for New Student Registraion APIs has a '201' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-26 DPS 1368 API to fetch Student Communication Details By Student Reg Id
 Given I send a GET request for New Student Registraion APIs from "DPS 1368 API to fetch Student Communication Details By Student Reg Id" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code

  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-27 DPS 1330 Registration form link will be valid 72 hours
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 1330 Registration form link will be valid 72 hours.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest
Scenario: TC-28 fetch Student CoCurricular Activities by registration numbers
 Given I send a GET request for New Student Registraion APIs from "fetch Student CoCurricular Activities by registration number" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest  @NewAPIsTest
Scenario: TC-29 API to fetch Final Submission Student Registraiom  
 Given I send a GET request for New Student Registraion APIs from "API to fetch Final Submission Student Registraiom" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest
 Scenario: TC-30 API to update final Student Registration Submission
Given I send a PUT request for New Student Registraion APIs with the request body from "API to update final Student Registration Submission.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code
 
  @NewStudentRegistraionAPIsTest @AdmissionSaleTest @NewAPIsTest  @SaleTest
 Scenario: TC-31 DPS 859 API GET Print Application Form PRINT
Given I send a POST request for New Student Registraion APIs with the request body from "DPS 859 API GET Print Application Form PRINT.json" and capture the response body
When The order request response for New Student Registraion APIs has a '200' response code

 @NewStudentRegistraionAPIsTest @AdmissionSaleTest  @NewAPIsTest
Scenario: TC-32 API to fetch Full Admission Form Preview         
 Given I send a GET request for New Student Registraion APIs from "API to fetch Full Admission Form Preview" and capture the response body
 When The order request response for New Student Registraion APIs has a '200' response code
 
 