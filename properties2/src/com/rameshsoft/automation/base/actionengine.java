package com.rameshsoft.automation.base;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

 abstract public class actionengine extends basetest { //were making this class as read only class by making class as abstract and the methods as static type
	public static void clickbywe(WebElement element,String elementdescription) {
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is displayed &enabled");
			element.click();
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is clicked");	
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementdescription+"element  is not  clicked");
		}}
	public static void clickbyjs(WebElement element,String elementdescription) { //clickk 
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is displayed &enabled");
			element.click();
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is clicked");	
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementdescription+"element  is not  clicked");
		}}
	public static void clickbyActions(WebElement element,String elementdescription) {// click by actions
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is displayed &enabled");
			Actions actions=new  Actions(getDriver());
			actions.click(element).build().perform();
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is clicked");	
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementdescription+"element  is not  clicked");
		}}
	public static void clickbyActionsenter(WebElement element,String elementdescription) { //click by enter
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is displayed &enabled");
			Actions actions=new  Actions(getDriver());
			actions.sendKeys(element,Keys.ENTER).build().perform();
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is clicked");	
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementdescription+"element  is not  clicked");
		}}
	 
	public static void doubleclickbyActions(WebElement element,String elementdescription) { //double click
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is displayed &enabled");
			Actions actions=new  Actions(getDriver());
			actions.doubleClick(element).build().perform();
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is clicked");	
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementdescription+"element  is not double clicked");
		}}
	public static void Dta(WebElement element,String testdata,String elementdescription) { //data typing action
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is displayed &enabled");
			 element.clear();
				getExtentTest().log(LogStatus.PASS, "clear action is done on element:"+elementdescription);
				element.sendKeys(testdata);
			getExtentTest().log(LogStatus.PASS,"data typing action is done on element:"+elementdescription+"test data:"+testdata);	
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementdescription+"Data typing action is not done");		
		}}
	public static void DtaJs(WebElement element,String testdata,String elementdescription) { //data typing  by java script editor
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementdescription+"element is displayed &enabled");
			 element.clear();
				getExtentTest().log(LogStatus.PASS, "clear action is done on element:"+elementdescription);
				element.sendKeys(testdata);
			getExtentTest().log(LogStatus.PASS,"data typing action is done on element:"+elementdescription+"test data:"+testdata);	
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementdescription+"Data typing action is not done");		
		}}
public static void handledropactions(WebElement element,String how,String howvalue) {
	
try {
	Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
	Select select=new Select(element);
	
	if(how.equalsIgnoreCase("value")) {
		select.selectByValue(howvalue);
		getExtentTest().log(LogStatus.PASS,"selected element from dropdown using:"+howvalue);
	}
	else if(how.equalsIgnoreCase("text")) {
		select.selectByVisibleText(howvalue);
		getExtentTest().log(LogStatus.PASS,"selected element from dropdown using:"+howvalue);
	}
	else if(how.equalsIgnoreCase("index")) {
		select.selectByVisibleText(howvalue);
		getExtentTest().log(LogStatus.PASS,"selected element from dropdown using:"+howvalue);
	}}
	catch (Exception exception) {
		getExtentTest().log(LogStatus.FAIL,"not selected from drop down:"+howvalue);		
	}}
public static String handlemultiplewindows() { //window handle if we have two windows
	String secwindow="";
try {
	Set<String> windows=getDriver().getWindowHandles();
	String curwindow=getDriver().getWindowHandle();
	for(String str:windows)
	{
	if(str.equalsIgnoreCase(curwindow))	{
		getExtentTest().log(LogStatus.INFO,"selenium is already is focussing");		
	}
	else {
		getDriver().switchTo().window(str);
		getExtentTest().log(LogStatus.FAIL,"switched to window:"+str);	
		secwindow=getDriver().getWindowHandle();
	}
	}}
catch (Exception exception) { 
	getExtentTest().log(LogStatus.FAIL,"not able to switch");	
}
return secwindow;
}
public static String handlemultiplewindows(int index) { //window handle by index
	String secwindow="";
try {
	Set<String> windows=getDriver().getWindowHandles();
	 List<String> listwindow=new ArrayList<String>(windows);
	 String windowindex=listwindow.get(index);
		getDriver().switchTo().window(windowindex);
		getExtentTest().log(LogStatus.PASS,"switched to window:"+index);	}
		
catch (Exception exception) { 
	getExtentTest().log(LogStatus.FAIL,"not able to switch");	
}
return secwindow;
}
 
 }
 
 
 
 
	
	
	
	
	
	
	
	