package com.rameshsoft.automation.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.customisedexceptions.FrameworksException;
import com.rameshsoft.automation.utilities.Driverpaths;
import com.rameshsoft.automation.utilities.Screenshotutility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import lombok.Builder;
import lombok.Getter;

public class basetest {
	//its tightly encapsulated class bcz all variables inside this class are type private variables,so scope is within the class only and we will use getter methods too access outside class,we know
	  private static WebDriver driver;
	 	private static String  tcname;
	 	private static ExtentReports extentreports;
	  	private static ExtentTest extenttest;
	@Parameters({"browser"})
	@BeforeSuite
	public void openbrowser(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("Driverpaths.firefoxkey", "Driverpaths.firefoxvalue");
			driver=new FirefoxDriver();
			init();
		}
		else if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty(Driverpaths.chromekey,Driverpaths.chromevalue);	
			driver=new ChromeDriver();
			init();
		}
		else if (browser.equalsIgnoreCase("ie")) {
	System.setProperty("Driverpaths.iekey","Driverpaths.ievalue");	
			driver=new InternetExplorerDriver();
			init();}
		else if (browser.equalsIgnoreCase("edge")) {
	System.setProperty("Driverpaths.edgekey","Driverpaths.edgevalue");	
			driver=new EdgeDriver();
			init();}
	}
	public void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(49, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void closebrowser() throws FrameworksException {
		if(driver!=null) {
			driver.quit();}
			else {
				FrameworksException exception=new FrameworksException("driver is pointing to null");
				System.out.println("driver is pointing to null");
				//actually should throw declaration but we didnt go through concept so we used syso
				throw exception;
			}
		}
	@BeforeMethod    //here we are doing the task of these after,before methods that is information about whether test cases failed or pas/skipped will be taken care by listners,without these @before method,after method  the code or the methods are prsent inside thse annotations are just methods which will execute iff if we call but were not calling them and also we can skip the code simply which is present inside these annotations i.e am,bm.
	public void beforetcexecution(Method method) {
		String tcname=method.getName();
		System.out.println("current test case execution is:"+tcname);
  extenttest=  extentreports.startTest(tcname);
  extenttest.log(LogStatus.INFO,"current test execution is:" +tcname);
	}
	@AfterMethod       /// here also before method and after method we dont use them in this insted use litners
	public void aftertcexecution(ITestResult result) throws IOException {
		long endmillisecs=result.getEndMillis();
		 tcname=result.getName();
		if(result.getStatus()==ITestResult.SUCCESS) {
		System.out.println("tc is passed:"+tcname);}
		else if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("tc is failed:"+tcname);
			Screenshotutility. takessreenshot();
		extenttest.log(LogStatus.FAIL, "Tc is failed"+tcname);	
		extenttest.log(LogStatus.FAIL, "Tc is failed" ,  result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			System.out.println("tc is skipped:"+tcname);
			Screenshotutility. takessreenshot();
			extenttest.log(LogStatus.SKIP, "Tc is skipped"+tcname);	
			extenttest.log(LogStatus.SKIP, "Tc is skipped" ,  result.getThrowable());	
		}
		extentreports.endTest(extenttest);
		extentreports.flush();
		}
	@BeforeTest
	public void initTeports() {
  extentreports=new ExtentReports(System.getProperty("user.dir")+"\\Reports\\reports.html");
Map<String, String> mapinfo=new  HashMap<String, String>();
mapinfo.put("username", "rameshsoft");
mapinfo.put("applicaton", "java selnium");
mapinfo.put("testcases", "regressionsuite");
extentreports.addSystemInfo(mapinfo);
	
	}
	@AfterTest
	public void generateReports() throws FrameworksException {
	if(extentreports!=null) {
		extentreports.close();}
	else {
		FrameworksException exception=new FrameworksException("extension reports r pointing to null");
		throw exception;
	}
		
	}

		  public  static WebDriver getDriver() {
			return driver;}
			public  static String gettcname() {
				return tcname;	}
				public  static ExtentTest getExtentTest() {
					return extenttest;
					} 
					
				}
		

