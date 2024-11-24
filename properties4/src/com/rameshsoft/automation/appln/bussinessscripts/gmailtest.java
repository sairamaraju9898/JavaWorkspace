package com.rameshsoft.automation.appln.bussinessscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.actionengine;
import com.rameshsoft.automation.base.basetest;
import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.listners.testcaseactivity;
import com.rameshsoft.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

 

public class gmailtest extends basetest{
	@Test    //(retryAnalyzer = testcaseactivity.class )
public void gmaillogintest() throws IOException, EncryptedDocumentException, InvalidFormatException, FrameworksException {
		String undata="";
		getExtentTest().log(LogStatus.PASS, "Browser is opened");
	String url=	PojoReader.getPrconf().getpropertyvalue("qa_url"); //this parameter qa_url is coming from config.properties files,which is present in this project individually
	// getDriver().get(url); //1st approach direct  calling without actionengine class 
	
	 actionengine.enterurl(url); //2nd approach calling  through  actionengine class of enterurl method
	 
	getExtentTest().log(LogStatus.PASS, "entered url as:"+url);
	String unid=PojoReader.getPror().getpropertyvalue("un_id"); //these parameters un_id,nxt_id are coming from or.peoperties which is present in objectrepository package
	getExtentTest().log(LogStatus.INFO, "username is:"+ unid);
	String nxtid=PojoReader.getPror().getpropertyvalue("nxt_id");
getExtentTest().log(LogStatus.INFO, "Next id is:"+ nxtid);

//Map u=PojoReader.getPror().getkeyvalues();  //here were getting both key and values from the or.properties bcz herre propr is a method for the or.property files
//System.out.println("keyset:" +  u);

	//excel reader 	
	undata=PojoReader.getexcelreaderobj().getcelldata("sheetname", "Gmail_Data", 0, 0);
	getExtentTest().log(LogStatus.INFO, "test data  is:"+ undata);
	System.out.println("exceldata:"+undata);
	//undata=PojoReader.getexcelreaderobj().getcelldata("index", "0", 1, 1);   //we will get null pointer exception bcz were calling sheet with index but it is out of limit so we get error
	//List<String> unda=PojoReader.getexcelreaderobj().getsheetdata("sheetname", "Gmail_Data"); 
//	List<String> undaa=PojoReader.getexcelreaderobj().getsheetdata("index", "1"); //this also we will get null value bcz we dont have index 1 , u want u can use 0th index here
	
 
	
	WebElement un=getDriver().findElement(By.id(unid));
//un.clear();
//getExtentTest().log(LogStatus.PASS, "username  field is cleared");
//un.sendKeys("sairamaraju98@gmail.com");
	 actionengine.Dta(un,undata,"performing data Typing action"); //performing datatyping actiion by calling methods of action engine (Dta imethod contains datatyping action on 
	getExtentTest().log(LogStatus.PASS, "username  field is cleared");
getExtentTest().log(LogStatus.PASS, "data typing action is done on username with test data:");
WebElement nxt=getDriver().findElement(By.id(nxtid));
//nxt.click();
 actionengine.clickbywe(nxt, "clickingclickbywe");
getExtentTest().log(LogStatus.PASS, "clicked on next button");
	}
}
