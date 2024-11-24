package com.rameshsoft.automation.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.basetest.Basetest;

public class Gmail_Pwd_Page extends Basetest {
	
@FindBy(xpath="//input[@name='Passwd']")
private static WebElement passwordElement;

@FindBy(xpath="//div[@id='passwordNext']")
private static WebElement pwdnxt;

@FindBy(xpath="//span[text()='Forgot password?']")
private static WebElement fgtpwd;

@FindBy(xpath="//div[text()='Show password']")
private static WebElement showpwd;


public static void enterpwd(String pwdData) {
	try {
		Assert.assertTrue(passwordElement.isDisplayed() && passwordElement.isEnabled());
		passwordElement.clear();
		passwordElement.sendKeys(pwdData);
        }
	catch (Exception e) {
	
		e.printStackTrace();
	    }
  }
public static void clickpwdnxtbtn() {
	try {
		Assert.assertTrue(pwdnxt.isDisplayed() && pwdnxt.isEnabled());
		pwdnxt.click();
        }
	catch (Exception e) {
		e.printStackTrace();
	    }
  }

public static void clickfrgtpwd() {
	try {
		Assert.assertTrue(fgtpwd.isDisplayed() && fgtpwd.isEnabled());
		fgtpwd.click();
        }
	catch (Exception e) {
		e.printStackTrace();
	    }
}

public static void clickshowpwd() {
	try {
		Assert.assertTrue(showpwd.isDisplayed() && showpwd.isEnabled());
		showpwd.click();
        }
	catch (Exception e) {
		e.printStackTrace();
	    }
}
static {
	PageFactory.initElements(getdriver(), Gmail_Pwd_Page.class);
}
}