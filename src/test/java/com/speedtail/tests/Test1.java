package com.speedtail.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.speedtail.actions.GetApiCalls;
import com.speedtail.utility.ExtentReport;
import com.speedtail.utility.TestStatus;

import io.restassured.response.Response;

public class Test1 {
	
	GetApiCalls apiCall;
	ExtentReport report;
	
	@BeforeTest
	public void beforeTest() {
		apiCall = new GetApiCalls();
		report = new ExtentReport();
		
	}
	
	@Test
	public void test() throws IOException {
		report.intializeTestReport("TestApiCall");
		report.insertStep("Started Api Call", "to get User Info", TestStatus.INFO, null, false);
		Response res = apiCall.getResponseApiCall();
		if(res.getStatusCode()==200) {
			report.insertStep("Started Api Call", "to get User Info", TestStatus.PASS, null, false);
		}else {
			report.insertStep("Started Api Call", "to get User Info", TestStatus.FAIL, null, false);
		}
		
	}

}
