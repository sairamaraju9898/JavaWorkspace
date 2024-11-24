package shadowroot;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShadowRootSalesforceAssignment {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	public void shadowRootTest() {
	WebElement shadow1=	driver.findElement(By.tagName("//hgf-c360nav"));
	SearchContext  root1= shadow1.getShadowRoot();
	root1.findElement(By.cssSelector(""));
	
		
	}
}
