package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		
	}
	
	@Test
	public void dragAndDropTest() {
		
	Actions actions =new Actions(driver);
	driver.switchTo().frame(0);
	actions.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),
			            driver.findElement(By.xpath("//div[@id='droppable']")))
	                    .build().perform();
	
	
	
	}
	
	
	
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
