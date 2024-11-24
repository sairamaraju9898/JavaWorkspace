package com.rameshsoft.automation.appln.pombussinessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rameshsoft.automation.appln.bussinessscripts.opencart_homepage;
import com.rameshsoft.automation.base.actionengine;
import com.rameshsoft.automation.base.basetest;
import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.utilities.PojoReader;

public class opencarttest extends basetest{
	@Test
	public void verifyshowalllaptopsnotebooksheaders() throws FrameworksException, IOException, InterruptedException {
		actionengine.enterurl(PojoReader.getPrconf().getpropertyvalue("yourstore"));
		Thread.sleep(2000);
		opencart_homepage.mousehoveronlaptopandnotebooks();
		opencart_homepage.verifyheaderslaptopsnnotebooks();
	}
	

}
