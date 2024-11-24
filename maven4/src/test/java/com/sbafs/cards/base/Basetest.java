package com.sbafs.cards.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sbafs.cards.utilities.Driverpaths;
import com.sbafs.cards.utilities.Screenshotutility;


public class Basetest {
    private static WebDriver driver;
    private static String tcName;
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(Driverpaths.chromekey  , Driverpaths.chromevalue);
            driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("Driverpaths.firefox"  , "Driverpaths.firefoxvalue" ); //driverpaths.firefox=webdriver.firefox.driver
            driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("safaridriver")) {
			System.setProperty("webdriver.safari.driver"  , "specify path for the safaridriver" );
            driver = new SafariDriver();
		}
		else if (browser.equalsIgnoreCase("iedriverr")) {
			System.setProperty("webdriver.internetexplorer.driver"  , "specify path for the iedriver" );
            driver = new InternetExplorerDriver();
		}
		
	} 
	public void init() {
	 	 driver.manage().window().maximize();
	 	 driver.manage().deleteAllCookies();
	 	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	
	public void closeBrowser() {
		
		if(driver!=null) {
		driver.close();
		}
		else {
			System.out.println("driver is pointing to null");
			
		}
	}
	
	
	@BeforeMethod
	public void beforeMethodExecution(Method method) {
	tcName=	method.getName();
	System.out.println("current test case exceution is " +tcName );
	}
	
	@AfterMethod
	public void afterMethodExecution(ITestResult result) throws IOException {
	double sec=	result.getEndMillis();
	tcName= result.getName();
	 if(result.getStatus()==ITestResult.SUCCESS) {
		 System.out.println("Testcase passes : "+tcName);
		
	 }
	 else if(result.getStatus()==ITestResult.FAILURE) {
		 System.out.println("Testcase failed : "+tcName);
		 Screenshotutility.takescreenshot(); //1st way calling screenshot utility without parameter
		 //Screenshotutility.takesrenshot(tcname); //2nd way calling screenshot utility without parameter
	 }
	 else if(result.getStatus()==ITestResult.SKIP) {
		 System.out.println("Testcase skipped : "+tcName);
		 Screenshotutility.takescreenshot(); //1st way calling screenshot utility without parameter
		// Screenshotutility.takesrenshot(tcname); //2nd way calling screenshot utility without parameter
	 }
  }
		
	
	 public static WebDriver getdriver() {
		 return driver;
	 }
     public static String getcname() {
		 return tcName;
	 }
	
}
