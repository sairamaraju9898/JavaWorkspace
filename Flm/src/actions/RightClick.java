package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class RightClick {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
 @Test
 public void rightClickTest() throws InterruptedException {
	 
	 Actions actions =new Actions(driver);
	 
	 actions.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
//	 .pause(2000)
//	 .keyDown(Keys.ARROW_DOWN)
//	 .pause(2000)
//	 .keyDown(Keys.ARROW_DOWN)
//	 .pause(2000)
//	 .keyDown(Keys.ARROW_DOWN)
//	 .pause(2000)
//	 .keyDown(Keys.ENTER)
//	.perform();
	 
	WebElement element= driver.findElement(By.xpath("//span[text()='Cut']//ancestor::ul"));
    List<WebElement> elements=	element.findElements(By.tagName("li"));
    
    for(WebElement e:elements) {
    	
    	if(e.getText().equals("Copy")) {
    	
    	Assert.assertTrue(true);
    	e.click();
    	
    	Thread.sleep(2000);
    	}
    }
	 
	 
	 
//	 
 }

}
