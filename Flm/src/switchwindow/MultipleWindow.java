package switchwindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindow {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
 @Test
 public void multipleWindowsTest() throws InterruptedException {
	 
	String mainWindow= driver.getWindowHandle();
	driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
	 
	Set<String> windowSet= driver.getWindowHandles();
	
//here we cant use norm for loop bcaz we dont have get method in set so we use for each or iterator
Iterator<String> iterator=	windowSet.iterator();
while(iterator.hasNext()) {
	driver.switchTo().window( iterator.next());
	if(driver.getTitle().equals("Not Found"))
	{
		break;
	}
}
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	
	Thread.sleep(3000);
	
	driver.switchTo().window(mainWindow);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
	
	
	windowSet=driver.getWindowHandles();
	
     iterator=	windowSet.iterator();
     
     while(iterator.hasNext()) {
    	 driver.switchTo().window(iterator.next());
    	 
    	 if(driver.getTitle().equals("TestFlight - Apple")) {
    		break; 
    	 }
     }
     
 	
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		windowSet=driver.getWindowHandles();
		
		 iterator=windowSet.iterator();
		
		while(iterator.hasNext())
		{
			driver.switchTo().window(iterator.next());
			
			if(driver.getTitle().equals("Legal - Apple Media Services - Apple"))
			{
				break;
			}
			
			
		}
		
		driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
		
		Thread.sleep(3000);
		
	}
}
 

