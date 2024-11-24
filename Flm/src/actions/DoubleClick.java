package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoubleClick {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	public void doubleClickTest() throws InterruptedException {
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys("admin123@gmail.com");
		//driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys("admin123");
		actions.sendKeys(driver.findElement(By.xpath("//input[@id='password_field']")), "admin123").build().perform();
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
		Thread.sleep(3000);
		
		actions.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"))).perform();;
		
		actions.click(driver.findElement(By.xpath("//a[text()='Double Click']"))).perform();
		
        actions.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")));
		
		actions.click(driver.findElement(By.xpath("//a[text()='Double Click']"))).perform();
		
		for(int i=0;i<=4;i++) {
			actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double Click']"))).perform();;
			
			
		}
		
	
	}
}
