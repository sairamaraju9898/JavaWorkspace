package frames;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameWindow {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	
	public void frameWindowDemo() {
		
		
	   String homeWindow=	driver.getWindowHandle();
		//switching to frame by using the id/name 
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']")).click();
		
		//now this link opens in new tab so we need to come out of frame before focussing to new tab
		driver.switchTo().defaultContent();
		
	Set<String>	 allWindowSet= driver.getWindowHandles(); 
Iterator<String> iterator=	allWindowSet.iterator();
	
	while(iterator.hasNext()) {
		driver.switchTo().window(iterator.next());
		
		if(driver.getTitle().equals("Selenium Live Project: FREE Real Time Project for Practice")) {
			break;
		}
	}
	
  WebElement block	=driver.findElement(By.xpath("//p//parent::div[@class='kt-inside-inner-col']"));
  
 List<WebElement>  elements= block.findElements(By.xpath("//a//div//span[@class='kt-blocks-info-box-title']"));
 
 for(WebElement e:elements) {
	 System.out.println(e.getText());
 }
  
  
		
		
		
		
	}
}
