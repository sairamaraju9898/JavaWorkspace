package com.ram.automation.appln;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ram.nwrn.ramn;

public class basetest {
	//its tightly encapsulated class bcz all variables inside this class are type private variables,so scope is within the class only and we will use getter methods too access outside class,we know
	private static WebDriver driver;
	private static String tcname;
	@Parameters({"browser"})
	@BeforeSuite
	public void openbrowser(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "location of firefox drivers");
			driver=new FirefoxDriver();
			init();
		}
		else if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","H:\\JAVA Workspace\\screenshots\\driversjars\\chromedriver.exe");	
			driver=new ChromeDriver();
			init();
		}
		else if (browser.equalsIgnoreCase("ie")) {
	System.setProperty("webdriver.ie.driver","set location for ie brwsr ");	
			driver=new InternetExplorerDriver();
			init();}
		else if (browser.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver","set location for edge brwsr ");	
			driver=new EdgeDriver();
			init();}
	}
	public void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(49, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void closebrowser() {
		if(driver!=null) {
			driver.close();}
			else {
				System.out.println("driver is pointing to null");
				//actually should throw declaration but we didnt go through concept so we used else
			}
		}
	@BeforeMethod
	public void beforetcexecution(Method method) {
		String tcname=method.getName();
		System.out.println("current test case execution is:"+tcname);
	}
	@AfterMethod
	public void aftertcexecution(ITestResult result) throws IOException {
		long endmillisecs=result.getEndMillis();
		 tcname=result.getName();
		if(result.getStatus()==ITestResult.SUCCESS) {
		System.out.println("tc is passed:"+tcname);}
		else if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("tc is failed:"+tcname);
			 ramn.takescreenshot();
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			System.out.println("tc is skipped:"+tcname);
			 ramn.takescreenshot();	}
		}

		public  static WebDriver getDriver() {
			return driver;
		}
		public  static String gettcname()	{
		return tcname; }}



