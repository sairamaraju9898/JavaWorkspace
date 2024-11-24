package com.rameshsoft.automation.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class REports {
	public static void main(String[] args) {
	//	ExtentReports extentreports=new ExtentReports("H:\\JAVA Workspace\\properties2\\Reports\\reports.html");
ExtentReports  extentreports=new ExtentReports("H:\\JAVA Workspace\\properties2\\reports");
		  Map<String, String> mapinfo=new  HashMap<String, String>();
		  mapinfo.put("username", "rameshsoft");
		  mapinfo.put("applicaton", "java selnium");
		  mapinfo.put("testcases", "regressionsuite");
		  extentreports.addSystemInfo(mapinfo);
		  ExtentTest extentTest=extentreports.startTest("demo");
				  extentTest.log(LogStatus.PASS, "Browser is opened");
		  extentTest.log(LogStatus.PASS, "entered url as www.gmail.com");
		  extentTest.log(LogStatus.PASS, "enteered url as rameshsoft.com");
		  extentTest.log(LogStatus.PASS, "entered url as next button");
		  extentreports.endTest(extentTest);
		  extentreports.flush();
		  extentreports.close();
	}

}
