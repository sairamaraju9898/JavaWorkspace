package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropBY {

	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	
	@Test
	public void dragAndDropByTest() {


	
	Actions actions =new Actions(driver);
//	WebElement bobIn=	driver.findElement(By.xpath("//div[@id='loanamountslider']//span"));
	

	actions.dragAndDropBy(driver.findElement(By.xpath("//div[@id='loanamountslider']//span")), 80, 0).perform();
	
	actions.dragAndDropBy(driver.findElement(By.xpath("//div[@id='loaninterestslider']//span")),150,0).perform();
	
	actions.dragAndDropBy(driver.findElement(By.xpath("//div[@id='loantermslider']//span")), -105, 0).build().perform();
	
	System.out.println(driver.findElement(By.xpath("//h4[text()='Loan EMI']//following-sibling::p//span")).getText());
	Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='Loan EMI']//following-sibling::p//span")).getText(), "92,439");
		
	}
}
