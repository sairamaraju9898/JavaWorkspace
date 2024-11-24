package com.rameshsoft.automation.appln.bussinessscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.actionengine;
import com.rameshsoft.automation.base.basetest;
import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class InstTest extends basetest {
	 
	@Test
public void instTest() throws IOException, InterruptedException, FrameworksException {
		getExtentTest().log(LogStatus.PASS, "Browser is opened");
		String url=	PojoReader.getPrconf().getpropertyvalue("inst_url");
		//getDriver().get(url ); 
		 actionengine.enterurl(url); 
		getExtentTest().log(LogStatus.PASS, "entered url as"+ url);
		String instvideos=	PojoReader.getPror().getpropertyvalue("inst_videos");
		// getDriver().findElement(By.xpath(instvideos)).click();
WebElement vid=	 getDriver().findElement(By.xpath(instvideos));
		 actionengine.clickbyActionsenter(vid,"clicking on videos");
			getExtentTest().log(LogStatus.PASS, "clicked on videos");
}}


