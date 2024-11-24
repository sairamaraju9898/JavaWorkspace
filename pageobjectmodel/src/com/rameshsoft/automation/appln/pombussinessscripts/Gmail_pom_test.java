package com.rameshsoft.automation.appln.pombussinessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.rameshsoft.automation.appln.bussinessscripts.Datetime;
import com.rameshsoft.automation.appln.bussinessscripts.Gmail_Home_page;
import com.rameshsoft.automation.appln.bussinessscripts.Gmail_Pwd_Page;
import com.rameshsoft.automation.base.actionengine;
import com.rameshsoft.automation.base.basetest;
import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.utilities.PojoReader;


 
public class Gmail_pom_test extends basetest {
	@Test
	public void gmaillogintest() throws FrameworksException, IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
   actionengine.enterurl(PojoReader.getPrconf().getpropertyvalue("qa_url"));
   
Gmail_Home_page.enterusername(PojoReader.getexcelreaderobj().getcelldata("sheetname", "Gmail_Data", 0, 0));

Gmail_Home_page.clicknxtbutton();  

Thread.sleep(2000);

//Gmail_Pwd_Page.enterpassword(PojoReader.getexcelreaderobj().getcelldata("sheetname", "Gmail_Data", 0, 0));
//Gmail_Pwd_Page.clickpwdnxtbutton();

System.out.println("Yesterday's date Is :"+Datetime.getpastdate());
	}
}