package com.rameshsoft.automation.appln.bussinessscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.basetest;
import com.relevantcodes.extentreports.LogStatus;

public class opencart_homepage  extends basetest{
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private static WebElement  laptopsnotebooks;
	
	@FindBy(xpath=" //a[text()=\"Macs (0)\"]")
	private static WebElement  mac;
	
	@FindBy(xpath=" //a[text()=\"Windows (0)\"]")
	private static WebElement  windows;
	
	@FindBy(xpath=" //a[text()=\"Show All Laptops & Notebooks\"]")
	private static WebElement  showall;
	
	public static  void mousehoveronlaptopandnotebooks() {
		try {
			Assert.assertTrue(laptopsnotebooks.isDisplayed()&&laptopsnotebooks.isEnabled());
			getExtentTest().log(LogStatus.PASS,"laptopsnotebooks is disp and enabled");
			Actions actions=new Actions(getDriver());
			actions.moveToElement(laptopsnotebooks).build().perform();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS,"mouse hover is performed on laptops and notebooks");
			
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL,"laptopsnotebooks is not disp and enabled");
		}
	}
	public static void verifyheaderslaptopsnnotebooks() {
	 try {
			Assert.assertTrue( mac.isDisplayed()&& mac.isEnabled());
			getExtentTest().log(LogStatus.PASS,"mac is disp and enabled");
			Assert.assertTrue( windows.isDisplayed()&& windows.isEnabled());
			getExtentTest().log(LogStatus.PASS,"windows is disp and enabled");
			Assert.assertTrue( showall.isDisplayed()&& showall.isEnabled());
			getExtentTest().log(LogStatus.PASS,"showall is disp and enabled");	
	 }
	 catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL,"laptopsnotebooks is not disp and enabled");
		}
	}
	
	
	static 
	{
		PageFactory.initElements(getDriver(), opencart_homepage.class);
	}

}
