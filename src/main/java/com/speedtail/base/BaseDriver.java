package com.speedtail.base;

import com.speedtail.utility.ExtentReport;

public class BaseDriver {
	
	private static ExtentReport report;
	
	
	public static ExtentReport getExtentReport() {
		
		if(report==null) {
			report = new ExtentReport();
			report.intializeTestReport("testAutomationReport");
		}
		return report;
	}

}
