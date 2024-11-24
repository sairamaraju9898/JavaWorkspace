package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDemo1 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.pepperfry.com/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	public void scrollTest() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
js.executeScript("window.scrollBy(0, 1000);");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']")).click();	
		

	}
}
