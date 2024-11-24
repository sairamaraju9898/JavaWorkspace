package shadowroot;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShadowRootDemo1 {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	public void shadowRootTest() {
	WebElement shadow=	driver.findElement(By.xpath("//div[@id='shadow_host']"));
	SearchContext s=	shadow.getShadowRoot();// were getting root and from here we need to use css only to locate elements inside the shadow dom/root
	s.findElement(By.cssSelector("input[type='text']")).sendKeys("seleniium");
	}
}
