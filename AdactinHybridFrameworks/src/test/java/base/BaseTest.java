package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ExtentManager;

public class BaseTest {
	public static WebDriver driver;
	public static FileInputStream fis1;
	public static Properties configProp;
	public static FileInputStream fis2;
	public static Properties locatorsProp;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	
	
	@BeforeTest
	public void fileReadSet()  {
		//here were reading the properties files of both locators and the config(browser type, url ..etc like these)
		//the main reason here we need to read thsese files in before test because if we run the xml file we can have  multiple classes
		//so for all the classes @before test will run once , so were reading these properties files for all the classes once before @test
		try {
			fis1=new FileInputStream("src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		configProp=new Properties();
		try {
			configProp.load(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    try {
			fis2=	new  FileInputStream("src\\test\\resources\\properties\\locators.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    locatorsProp= new Properties();
	    
	    try {
			locatorsProp.load(fis2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    reports=ExtentManager.getReports();
	}
	
	@BeforeMethod
	public void setUp(Method method) {
		
		// first the main reason for taking config prop bcz for every test case we no need to write all the dta simply we can read from there
		//for reading properties we have fileinputsream and properties class to load and read the data
		
	
		//now we will read the config from the config.properties to launch the browser
		test=reports.createTest(method.getName());
		 String browser= configProp.getProperty("browser");
		 
		 if(browser.equals("chrome")) {
		 driver=	 new ChromeDriver();
		 }
		 else if(browser.equals("edge")) {
		 driver=	 new EdgeDriver();
		 }
		 else if(browser.equals("firefox")) {
		 driver=	 new FirefoxDriver();
			 }
			
		//now we nee do open the url read from config properties
//		 String url=configProp.getProperty("url");
//		 driver.get(url);
		 driver.get(configProp.getProperty("url")); //in single line we are writing
		 driver.manage().window().maximize();
	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitWait"))));
			//here ofseconds takes only long values
		 
	}
	
	@AfterMethod
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	
	@AfterTest
	public void flushReports()
	{
		reports.flush();
	}
}
