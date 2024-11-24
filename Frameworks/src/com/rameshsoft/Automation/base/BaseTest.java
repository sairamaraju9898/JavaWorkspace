package com.rameshsoft.Automation.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
 private static WebDriver driver;
 
 @Parameters({"browser"})
 @BeforeSuite
 public void openbrowser(@Optional("chrome") String browser) {
   if(browser.equalsIgnoreCase("firefox")) {
	   System.setProperty("webdriver.gecko.driver", "location.exe");
    driver=new FirefoxDriver();  
    init();
   }
   else if (browser.equalsIgnoreCase("chrome")) {
	   System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Frameworks\\drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   init();
   }
   else if (browser.equalsIgnoreCase("ie")) {
	   System.setProperty("webdriver.ie.driver", "ie .exe location");
	   driver=new InternetExplorerDriver();
	   init();
   }
   else if (browser.equalsIgnoreCase("ie")) {
	   System.setProperty("webdriver.ie.driver", "ie .exe location");
	   driver=new InternetExplorerDriver();
	   init();
   } 
 }
 public void init() {
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 }
 @AfterSuite
 public void closebrowser() {
	 if(driver!=null) {
		 driver.close();
	 }
	 else {
		 System.out.println("driver is pointing to null");
	 }
 }
 public static WebDriver  getdriver() {
	 return driver;
 }
 
}
