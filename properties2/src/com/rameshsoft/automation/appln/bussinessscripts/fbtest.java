package com.rameshsoft.automation.appln.bussinessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.basetest;
import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class fbtest extends basetest {
	@Test
public void fbtest() throws FrameworksException, IOException {
		getExtentTest().log(LogStatus.PASS, "Browser is opened");
		String url=	PojoReader.getPrconf().getpropertyvalue("fb_url");
		//getDriver().get(url); 
		getExtentTest().log(LogStatus.PASS, "entered url as"+url);
}}