package com.rameshsoft.automation.basetest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.utilities.Driverpaths;
import com.rameshsoft.automation.utilities.Screenshotutility;

public class Basetest {
	private static WebDriver driver;
	private static String tcname;
	private static ExtentReports extentReports;
	@Parameters({"browser"})
	@BeforeSuite
	public void openbrowser(@Optional("chrome") String browser) {
	  if(browser.equalsIgnoreCase("firefox")) {
		   System.setProperty("webdriver.gecko.driver", "location.exe");
	   driver=new FirefoxDriver();  
	   init();
	  }
	  else if (browser.equalsIgnoreCase("chrome")) {
		   System.setProperty(Driverpaths.chromekey,Driverpaths.chromevalue);
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
	 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  }
	  @AfterSuite
	  public void closebrowser() throws Frameworksexception  {
	 	 if(driver!=null) {
	 	
	 		 driver.close();
	 	 }
	 	 else {
	 		Frameworksexception exception=new Frameworksexception("driver is pointing to null...");
	 		throw exception;
	 	//	 System.out.println("driver is pointing to null");
	 	 }
	  }
	  @BeforeMethod
	  public void beforemethodexecution(Method method) {
		 tcname=method.getName();
		 System.out.println("current test case execution is :" +tcname);
	  }
	  @AfterMethod
	  public void aftertestexecution(ITestResult result) throws IOException {
		 long endmillisec= result.getEndMillis();
		 long startmillisec=result.getStartMillis();
		 tcname= result.getName();
		 if(result.getStatus()==ITestResult.SUCCESS) {
			 System.out.println("Testcase passes : "+tcname);
			
		 }
		 else if(result.getStatus()==ITestResult.FAILURE) {
			 System.out.println("Testcase failed : "+tcname);
			 Screenshotutility.takesrenshot(); //1st way calling screenshot utility without parameter
			 //Screenshotutility.takesrenshot(tcname); //2nd way calling screenshot utility without parameter
		 }
		 else if(result.getStatus()==ITestResult.SKIP) {
			 System.out.println("Testcase skipped : "+tcname);
			 Screenshotutility.takesrenshot(); //1st way calling screenshot utility without parameter
			// Screenshotutility.takesrenshot(tcname); //2nd way calling screenshot utility without parameter
		 }
	  }
	  public void initReports(){
		  String pathString=System.getProperty("user.dir")+"/Reports/report.html";
		  extentReports  =new ExtentReports();
	  }
	  public static WebDriver  getdriver() {
			 return driver;
		 }
	  public static String  getcname() {
			 return tcname;
		 }
}
