package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement;

import base.BaseTest;


//note here keywords are like simply were making the methods for every actions we do here the only thing new is here the finfdlement , by also
//were taking different methods for reamining click,sendkeys,dropdownds, ..etc actions directly we ccreate the methods and call directly req
//methods in out test cases
public class GenericKeywords extends BaseTest {
//in keywords driven framework for test case each and every test step can be a  method so were again writing the 
	// launch browser in test case excel sheet we have given names for every step thse keowords are methods here 
	// will write that keyword as method here and we will call the
	// methods in test cases
	// here even driver.findelement method , by also we will write in the ,click,
	// sendkeys ..etc

	// when we started keywords driven framework were commenting the @before method
	// and copy pastin gthe browser launch method here

	public void startBrowser() {
       //here we no need to pass the broswer as parameter directly while runnin g the code we can change the broswer type in config.properties file 
		String browser = configProp.getProperty("browser");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	
	public void launchApp() {
		 driver.get(configProp.getProperty("url")); //in single line we are writing
		 driver.manage().window().maximize();
	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitWait"))));
			
	}
	
	public void type(String locatorKey, String text) {
		//for sendkeys
		
		
		//here direcctly we wont write driver.findelememnt in realtime inkeyword driven framework
		
		//driver.findElement(By.xpath(locatorsProp.getProperty(locatorKey))).sendKeys(text);
		//in realtim we get webelemet and by. xpath/id/... like thse we call from different methods
		//so based upon that we need to give _xpath/id/name in thehlocators prop file 
		
		getElement(locatorKey).sendKeys(text);
		//here getelement (locatorkey ) returns webelement
	}
	
	public void click(String locatorKey) {
		//for click
		getElement(locatorKey).click();
	}


	public void selectItemFromDropDown(String locatorKey , String  value) {
		new Select(getElement(locatorKey)).selectByVisibleText(value);
		//here also we have 3 way by id, valeue also we can select by using if else conditions as of now directly we took text
		
	}
	public  WebElement getElement(String locatorKey) {
	
		WebElement element=null;
		WebDriverWait myWait=  new WebDriverWait(driver, Duration.ofSeconds(30));
		myWait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		//here in abobe line were saying till the lement is hgetting identified 
		//for by class also we need to create another method
		element=driver.findElement(getLocator(locatorKey));
		//here getLocator(locatorKey) returns By(i.e by.id/name/xpath like this) 
		return element;
	}
	
	public By getLocator(String locatorKey) {
		By by =null;
		
		if(locatorKey.endsWith("_id")) {
			by=By.id(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_name")) {
			by=By.name(locatorsProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_xpath")) {
			by=By.xpath(locatorsProp.getProperty(locatorKey));
		}
		
		else {
			by=By.xpath(locatorsProp.getProperty(locatorKey));
			//if we dont specify anything at locator properties file like _xpath, _name .. etc by default its xpath we have taken here
		}
		return by;
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
}
