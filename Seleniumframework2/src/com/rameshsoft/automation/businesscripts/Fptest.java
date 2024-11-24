package com.rameshsoft.automation.businesscripts;



import java.io.IOException;

import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Actionsengine;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.utilities.pojoReader;

public class Fptest extends Actionsengine{
	@Test 
	public void fptest() throws Frameworksexception, IOException {
	String url=	pojoReader.getprconf().getpropertyvalue("fp_url");
	Actionsengine.enterurl(url, "passing url");
	}
}
