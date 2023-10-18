package com.thinktimetechno.endpoints;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

public class NewStudentRegistraionAPIsEndPoints extends BaseEndpoints{


		RequestSpecification requestSpecification;
		public Response result;
		public static int registrationId;
		public static String registrationNo;
		public static String examId;
		public static String actual;
		private  String application_ENDPOINT_PATH="";
	   boolean isregistrationId=false;
	   boolean isregistrationNo=false;
	   boolean isimage=false;
	   boolean ispdf=false;
	   boolean ispdfhas=false;
		public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

			
			requestSpecification = getRequestWithJSONHeadersToken(token);
			switch (jsonFile){
				case "DPS-939 upload documents for student registrations.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/35719/documents";
					ispdf=true;
					break;
				case "DPS 938 save or update images for new registration student.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/2925/5/uploadImages";
					isimage=true;
					break;
					
				case "API to create student registration form.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration";
					isregistrationId=true;
					break;
				case "DPS 836 API to fetch list of registered students.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/students";
					break;
				case "Upload file for admission.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/upload-admission-file";
					ispdfhas=true;
					break;
				case "DPS 860 API to download student registration pdf.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/3568/generateAdmissionFormPdf";
					break;
				case "DPS 1329 Submission tab with otp.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/2/generate-otp";
					break;
				case "DPS 1329 verify OTP.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/2/verify-otp?otp=4347";
					break;
				case "DPS 1330 Registration form link will be valid 72 hours.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/381/linkActivate";
					break;
				case "DPS 859 API GET Print Application Form PRINT.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/35668/generateFullAdmissionFormPdf";
					break;
					
			}
			
		
//			result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
if(isimage) {
	
	File testUploadimage = new File(System.getProperty("user.dir") + "/src/test/resources/licensed-image.jpeg");
	result = RestAssured.given()
	        .header("Authorization", "Bearer " + token) // Added a space after "Bearer"
	        .multiPart("imageType", "FATHER_PHOTO", "text/plain")
	        .multiPart("file", testUploadimage, "image/jpeg")
	        .when()
	        .post(getBaseUrl() + application_ENDPOINT_PATH);
	
}
else if(ispdf) {
//	File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/NewStudentRegistraionAPIsPayloads/"+jsonFile);
	File testUploadFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/NewStudentRegistraionAPIsPayloads/DPS-939_upload_documents_for_student_registrations.pdf");
	String document="{\"instituteId\":1,\"branchId\": 1,\"documentId\": 14}";
			 
			  
			  
			
	
	result = RestAssured.given().log().all()
	        .header("Authorization", "Bearer " + token)
	        .multiPart("file", testUploadFile, "application/pdf")
	        .multiPart("documentRequest", document, "text/plain")
	        .multiPart("fileType", "PDF", "text/plain")
	        .when()
	        .post(getBaseUrl() + application_ENDPOINT_PATH);
}
else if(ispdfhas) {
	
	File testUploadFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/NewStudentRegistraionAPIsPayloads/DPS-939_upload_documents_for_student_registrations.pdf");
	result = RestAssured.given()
	        .header("Authorization", "Bearer " + token)
	       
	        .multiPart("file", testUploadFile,"application/pdf")
            .when()
	        .post(getBaseUrl() + application_ENDPOINT_PATH);
}
else {
	File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/NewStudentRegistraionAPIsPayloads/"+jsonFile);
	result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
}
			
			if(isregistrationId) {
			String responseBody = result.getBody().asString();
		    JSONObject postResponseJson = new JSONObject(responseBody);
		    registrationId= postResponseJson.getInt("registrationId");
			}
		    return result;
		
		}
		public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
			

			requestSpecification = getRequestWithJSONHeadersToken(token);
			switch (jsonFile){
			      case "API to update student registration profile.json":
				     application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/update-profile";
				  break;
				case "DPS 1161 API to to update student registration curricular activities.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/3883/update-co-curricular-activities";
					break;
				case "API to update student communication details.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/update-communication-details";
					break;
				case "API to update student last year results.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/update-last-year-results";
					break;
				case "API to update student sibling details.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/35719/update-sibling-details";
					break;
				case "API to update student parent details.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/update-parent-details";
					break;
				case "API to calculate points in tab after student registration .json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/calculate-registration-points";
					break;
				
				case "API to cancel admission registration.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/cancel-admission?reason=Far from home";
					break;

				case "API to update final Student Registration Submission.json":
					application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/35719/final-submission";
					break;
			}
			File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/NewStudentRegistraionAPIsPayloads/"+jsonFile);
			result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
			
			
			return result;
		}
		public Response applicationSalesfetchPayload(String token,String name ) {
			requestSpecification = getRequestWithJSONHeadersToken(token);
			switch (name){
			case "Get Exam Marks List with Filter":
				application_ENDPOINT_PATH="/admission/api/admission-service/exam-marks?academicYearId=8&curriculumId=5&instituteId=1&classId=99&branchId=1";
				isregistrationNo=true;
				break;
			case "DPS-858 view application documents for a registered student":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/5505/fetch-documents?docType=";
//				                          
				break;
			
			case "DPS 832 API to Fetch student by registration number, branch and academic year":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/student?branchId=1&academicYearId=8&registrationNo="+actual;
//				isregistrationNo=false;
				break;
			case "API to fetch student profile by registration id":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/fetch-profile";
				break;
			case "API to fetch student sibling details by registration id.":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/fetch-sibling-details";
				break;
			case "API to fetch student parent details by registration id.":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/fetch-parent-details";
				break;
			case "API to fetch student last year results by registration id.":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/"+registrationId+"/fetch-last-year-details";
				break;
			case "DPS - 860 API to get view of registration form after submission":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/4/get-consolidated-preregistration-view";
				break;
			case "DPS 1324 API to fetch registration details by username":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/users/NHAP233703";
				break;
			case "DPS 1327 Document list API needs to be integrated":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/class-documents?studentRegId=5505&classId=67";
				break;

			case "DPS 1368 API to fetch Student Communication Details By Student Reg Id":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/6656/fetch-communication-details";
				break;
			case "fetch Student CoCurricular Activities by registration number":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/3883/co-curricular-activities";
				break;
			
			case "API to fetch Final Submission Student Registraiom":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/35719/final-submission";
				break;
				
			case "API to fetch Full Admission Form Preview":
				application_ENDPOINT_PATH="/admission/api/admission-service/pre-admissions/registration/35937/generateFullAdmissionForm-preview";
				                         
				break;
			
			}
				result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
				if(isregistrationNo) {

					ArrayList<Object> nestedArray = (ArrayList<Object>) result.jsonPath().getList("data");

				

						Map<String, String> map = (Map<String, String>) nestedArray.get(0);
						actual = String.valueOf(map.get("registrationNo"));
					
					

					}
				
				return result;
		
	}
	}