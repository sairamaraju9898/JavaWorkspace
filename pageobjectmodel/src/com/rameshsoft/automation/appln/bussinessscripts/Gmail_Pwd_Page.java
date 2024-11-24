package com.rameshsoft.automation.appln.bussinessscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.basetest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Pwd_Page  extends basetest{
	
		@FindBy(xpath="//input[@type='password']")  
		private static WebElement password;
		
		@FindBy(xpath="//span[text()='Next']")
		private static WebElement pwdnxt;

		@FindBy(xpath="//span[text()='Forgot password?']")
		private static WebElement frgetpwd;

		@FindBy(xpath="//div[text()='Show password']")
		private static WebElement showpwd;

		 

		public static void enterpassword(String pwddata) {
			try {
				Assert.assertTrue(password.isEnabled()&&password.isEnabled());
				getExtentTest().log(LogStatus.PASS, "pwddata elemnt is didpled and enabled");
				password.clear();
				getExtentTest().log(LogStatus.PASS, "pwddata field is cleared");
				password.sendKeys(pwddata);
				getExtentTest().log(LogStatus.PASS, "data typing action is done on password with test data:"+pwddata);
			}
		catch(Exception exception)		{
			getExtentTest().log(LogStatus.FAIL, "pwddata element is not displayed and enabled:"+pwddata);
		}
			
		}


		public static void clickpwdnxtbutton() {
			try {
				Assert.assertTrue(pwdnxt.isEnabled()&&pwdnxt.isEnabled());
				getExtentTest().log(LogStatus.PASS, "pwdnxt elemnt is didpled and enabled");
				pwdnxt.click();
				getExtentTest().log(LogStatus.PASS, "clicked on pwdnxt element");
				 
			}
		catch(Exception exception)		{
			getExtentTest().log(LogStatus.FAIL, "pwdnxt element is not displayed and enabled:"+pwdnxt);

		}
			
		}
			public static void clickfrgtpwd() {
				
				try {
					Assert.assertTrue(frgetpwd.isEnabled()&&frgetpwd.isEnabled());
					getExtentTest().log(LogStatus.PASS, "frgetpwd elemnt is didpled and enabled");
					frgetpwd.click();
					getExtentTest().log(LogStatus.PASS, "clicked on frgetpwd element");
					 
				}
			catch(Exception exception)		{
				
				getExtentTest().log(LogStatus.FAIL, "frgetpwd element is not displayed and enabled:"+frgetpwd);
			}}


				public static void clickcreateaccount() {
					try {
						Assert.assertTrue(showpwd.isEnabled()&&showpwd.isEnabled());
						getExtentTest().log(LogStatus.PASS, "showpwd elemnt is displayed and enabled");
						showpwd.click();
						getExtentTest().log(LogStatus.PASS, "clicked on showpwd element");
						 
					}
				catch(Exception exception)		{
					getExtentTest().log(LogStatus.FAIL, "showpwd element is not displayed and enabled:"+showpwd);
				}	}
		static 
		{
			PageFactory.initElements(getDriver(), Gmail_Pwd_Page.class);
		}

				}

