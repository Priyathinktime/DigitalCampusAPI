package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EnquiryEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String token ,String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS-841 API POST Add new Offline Enquiry.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/enquries";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/EnquiryPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesUpdatePayload(String token ,String jsonFile) throws IOException {
		

		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "DPS-845 API POST Update Enquiry Details Status.json":
				application_ENDPOINT_PATH="/admission/api/admission-service/enquries/enquiry-status/401?enquiryStatus=OPEN";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/EnquiryPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS-842 API GET View enquiry details by Id":
			application_ENDPOINT_PATH="/admission/api/admission-service/enquries/10";
			break;
		case "DPS-840 API GET All Enquiries with Filters":
			application_ENDPOINT_PATH="/admission/api/admission-service/enquries/all?academicYearId=3&branchId=1&curriculumId=1&classId=8&startDate=2016-05-04&endDate=2017-05-04&searchString=&pageNo=0&pageSize=10";
			break;
		case "Fetch count of  all enquiry records":
			application_ENDPOINT_PATH="/admission/api/admission-service/enquries/count-enquiries?day=2016-05-04&month=05&year=2016&previousDay=2023-05-03&previousMonth=06";
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	public Response applicationSalesDeletePayload(String token,String name ) {
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "DPS-843 API POST Delete enquiry by ID":
			application_ENDPOINT_PATH="/admission/api/admission-service/enquries/7956";
			break;
		
		
		}
			result=requestSpecification.delete(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
}