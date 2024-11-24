 package com.rameshsoft.automation.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.basetest.Basetest;

public class Gmail_Home_page extends Basetest {
@FindBy(id="identifierId")
private static WebElement username;

@FindBy(id="identifierNext")
private static WebElement nxt;

@FindBy(xpath="//span[text()='signin']") //for signin element
private static WebElement signIN;

@FindBy(xpath="//span[text()='Use your Google Account']")
private static WebElement continuetogmail;

@FindBy(xpath="//button[text()='Forgot email?']")
private static WebElement forgotmail;

@FindBy(xpath="//a[text()='Learn more']")
private static WebElement learnmore;

@FindBy(xpath="Create account")
private static WebElement createaccount;

public static void enterusername(String undata) {
	try {
		Assert.assertTrue(username.isDisplayed() && username.isEnabled());
		username.clear();
		username.sendKeys(undata);
	}
	catch (Exception e) {
		 e.printStackTrace();
	}
}
 
public static void clicknxtbutton() {
	try {
		Assert.assertTrue(nxt.isDisplayed() && nxt.isEnabled());
	    nxt.click();
	}
	catch (Exception e) {
		 e.printStackTrace();
	}
}

public static void clickfrgtemail() {
	try {
		Assert.assertTrue(forgotmail.isDisplayed() && forgotmail.isEnabled());
		forgotmail.click();
	}
	catch (Exception e) {
		 e.printStackTrace();
	}
}
public static void clickcreateaccount() {
	try {
		Assert.assertTrue(createaccount.isDisplayed() && createaccount.isEnabled());
		createaccount.click();
	}
	catch (Exception e) {
		 e.printStackTrace();
}
}
static {
	PageFactory.initElements(getdriver(), Gmail_Home_page.class);
}
}