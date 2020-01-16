package com.AutomationFramework.ReportManager;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {

	static ExtentReports er=new ExtentReports("E:\\enag\\Aviva_Project_final\\target\\ExtentResult\\results.html", true);  
	static ExtentTest et=er.startTest("Validate Aviva text Search"); 
	
 static Reports instance;
	public static Reports getinstance() {
	if(instance == null) {
		instance = new Reports();
	}
		return instance;
	}
	public void test_pass() {
		et.log(LogStatus.PASS, "Aviva link test passed");
	
		er.endTest(et);
		er.flush();
	}
	public void test_fail() {
		// if ur intrested u can just ADD Screenshot code to take Screen shot of Failed Case
		et.log(LogStatus.FAIL, "Aviva Link test Failed");
		er.endTest(et);
		er.flush();
	}

}
