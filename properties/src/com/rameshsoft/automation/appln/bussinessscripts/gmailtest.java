package com.rameshsoft.automation.appln.bussinessscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
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
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.basetest;
import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.listners.testcaseactivity;
import com.rameshsoft.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class gmailtest extends basetest{
	@Test    //(retryAnalyzer = testcaseactivity.class )
public void gmaillogintest() throws IOException, EncryptedDocumentException, InvalidFormatException, FrameworksException {
		String undata="";
		 
	String url=	PojoReader.getPrconf().getpropertyvalue("qa_url"); //this parameter qa_url is coming from config.properties files,which is present in this project individually
	getDriver().get(url); 
		 
	 
	String unid=PojoReader.getPror().getpropertyvalue("un_id"); //these parameters un_id,nxt_id are coming from or.peoperties which is present in objectrepository package
 
	String nxtid=PojoReader.getPror().getpropertyvalue("nxt_id");
 
	 
	//excel reder
	undata=PojoReader.getexcelreaderobj().getcelldata("sheetname", "Gmail_Data", 0, 0);
 
	
	
	System.out.println(undata);
	//undata=PojoReader.getexcelreaderobj().getcelldata("index", "0", 1, 1);   //we will get null pointer exception bcz were calling sheet with index but it is out of limit so we get error
	//List<String> unda=PojoReader.getexcelreaderobj().getsheetdata("sheetname", "Gmail_Data"); 
//	List<String> undaa=PojoReader.getexcelreaderobj().getsheetdata("index", "1"); //this also we will get null value bcz we dont have index 1 , u want u can use 0th index here
	
	
	
	WebElement un=getDriver().findElement(By.id(unid));
un.clear();
 
un.sendKeys(undata);
 
WebElement nxt=getDriver().findElement(By.id(nxtid));
nxt.click();
 
	}
}
