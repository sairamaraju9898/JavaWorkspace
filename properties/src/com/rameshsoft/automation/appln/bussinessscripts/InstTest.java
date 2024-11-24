package com.rameshsoft.automation.appln.bussinessscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.basetest;
import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class InstTest extends basetest {
	@Test
public void instTest() throws IOException, InterruptedException, FrameworksException {
	 
		String url=	PojoReader.getPrconf().getpropertyvalue("inst_url");
		getDriver().get(url ); 
	 
		String instvideos=	PojoReader.getPror().getpropertyvalue("inst_videos");
		 getDriver().findElement(By.xpath(instvideos)).click();
		 
}}


