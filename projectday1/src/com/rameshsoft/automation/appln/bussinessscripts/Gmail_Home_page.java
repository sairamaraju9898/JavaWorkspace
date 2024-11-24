package com.rameshsoft.automation.appln.bussinessscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.basetest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Home_page extends basetest{
@FindBy(id="identifierId")

private static WebElement username;

@FindBy(id="identifierNext")

private static WebElement nxt;

@FindBy(xpath="//span[text()='Sign in']")
private static WebElement signin;

@FindBy(xpath="//button[text()='Forgot email?']")
private static WebElement frgtgmail;

@FindBy(xpath="//a[text()='Learn more']")
private static WebElement learnmore;

@FindBy(xpath="//a[text()='Create account']")
private static WebElement createaccount;

public static void enterusername(String undata) {
	try {
		Assert.assertTrue(username.isEnabled()&&username.isEnabled());
		getExtentTest().log(LogStatus.PASS, "username elemnt is didpled and enabled");
		username.clear();
		getExtentTest().log(LogStatus.PASS, "username field is cleared");
		username.sendKeys(undata);
		getExtentTest().log(LogStatus.PASS, "data typing action is done on username with test data:"+undata);
	}
catch(Exception exception)		{
	getExtentTest().log(LogStatus.FAIL, "username element is not displayed and enabled:"+undata);
}		
}


public static void clicknxtbutton() {
	try {
		Assert.assertTrue(username.isEnabled()&&username.isEnabled());
		getExtentTest().log(LogStatus.PASS, "username elemnt is didpled and enabled");
		nxt.click();
		getExtentTest().log(LogStatus.PASS, "clicked on next element");
		 
	}
catch(Exception exception)		{
	getExtentTest().log(LogStatus.FAIL, "username element is not displayed and enabled:"+nxt);

}
	
}
	public static void clickfrgtemail() {
		try {
			Assert.assertTrue(frgtgmail.isEnabled()&&frgtgmail.isEnabled());
			getExtentTest().log(LogStatus.PASS, "username elemnt is didpled and enabled");
			frgtgmail.click();
			getExtentTest().log(LogStatus.PASS, "clicked on frgtgmail element");
			 
		}
	catch(Exception exception)		{
		getExtentTest().log(LogStatus.FAIL, "frgtgmail element is not displayed and enabled:"+frgtgmail);
	}}


		public static void clickcreateaccount() {
			try {
				Assert.assertTrue(createaccount.isEnabled()&&createaccount.isEnabled());
				getExtentTest().log(LogStatus.PASS, "createaccount elemnt is displayed and enabled");
				createaccount.click();
				getExtentTest().log(LogStatus.PASS, "clicked on createaccount element");
				 
			}
		catch(Exception exception)		{
			getExtentTest().log(LogStatus.FAIL, "createaccount element is not displayed and enabled:"+createaccount);
		}
			
		}
static 
{
	PageFactory.initElements(getDriver(), Gmail_Home_page.class);
}
}