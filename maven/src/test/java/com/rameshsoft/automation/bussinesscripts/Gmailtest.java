package com.rameshsoft.automation.bussinesscripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Actionsengine;
import com.rameshsoft.automation.basetest.Basetest;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.utilities.pojoReader;

public class Gmailtest  extends Basetest{
	@Test
	public void gmailtest() throws  IOException, EncryptedDocumentException, InvalidFormatException ,Frameworksexception, Exception{
		String undata="";
		String url= pojoReader.getprconf().getpropertyvalue("qa_url"); //for conf were calling prooerties reader object which menas pojoreader class has method getprconf method whixch is is creating obj for this propertiesreader class
		Actionsengine.enterurl(url, "opening url");   
	 
		String unid=pojoReader.getpror().getpropertyvalue("un_id");
	    WebElement un=	getdriver().findElement(By.id(unid));
		un.clear();
		//un.sendKeys("rameshsoft.9177791456@gmail.com");
		undata=pojoReader.getexcelreaderobj().getcelldata("sheetname","Gmail_Data", 0, 0); //consider this insteas of above sendkeys  here were hardcoding sendkeys bcz we have some issue with excel files log4j so were hardcoding it
		//un.sendKeys(undata);
		Actionsengine.Dta(un, undata, "data typing action is done");
		String nxtid=pojoReader.getpror().getpropertyvalue("nxt_id");
	    WebElement nxt=getdriver().findElement(By.id(nxtid)); //intentionally giving wrong to take screenshot
	    nxt.click();
	    Actionsengine.clickbyactions(nxt, "clicking action is done");
		

	   
}
}
