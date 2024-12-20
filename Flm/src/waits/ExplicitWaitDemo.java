package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	
	@Test
	public void explicitWaitTest() {
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		//here were inspecting load element and we will use webdriverwait which is like checking whether req condition is met here we re checking whether
		//spinner element is gettung invisib;e/disable
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@id='spinner']")))); //spinner element
		try {
			Assert.assertEquals(driver.findElement(By.xpath("//div[@class='screen']")).getText(),"5");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	}

