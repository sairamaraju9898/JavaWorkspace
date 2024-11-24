package com.rameshsoft.automation.bussinesscripts;

import java.io.IOException;
import java.time.DateTimeException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Actionsengine;
import com.rameshsoft.automation.basetest.Basetest;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.pageobject.Gmail_Home_page;
import com.rameshsoft.automation.pageobject.Gmail_Pwd_Page;
import com.rameshsoft.automation.utilities.pojoReader;

public class Gmail_Pom_Test  extends Basetest{
	@Test
	public void gmailloginTest() throws Frameworksexception, IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
		//getdriver().get(pojoReader.getprconf().getpropertyvalue("qa_url"));
		Actionsengine.enterurl(pojoReader.getprconf().getpropertyvalue("qa_url"));//webelement e=driver.get("url of website") 
		Gmail_Home_page.enterusername(pojoReader.getexcelreaderobj().getcelldata("sheetname", "Gmail_Data", 0, 0));//e.sendkeys("enter data")
		Gmail_Home_page.clicknxtbutton();//e.click();
		
		Thread.sleep(3000);
		//from here actions upon pwd page
		Gmail_Pwd_Page.enterpwd(pojoReader.getexcelreaderobj().getcelldata("sheetname", "Gmail_Data", 0, 1));
		Gmail_Pwd_Page.clickpwdnxtbtn();
	
	}	
}
