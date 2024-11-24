package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.angelfire.com/super/badwebs/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	
	@Test
	public void framestest() {
		
		//switch to frame by using the webelememt as parameter
		
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("//a[@href='monkeyspaw.htm']")).click();
		
		
		
		
	}
}
