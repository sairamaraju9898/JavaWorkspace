package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ValidateLogin {

	WebDriver driver;
	//in this class we take all the test cases may be 7 for login functionality
	@BeforeMethod
	public void setUp() {
	   driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	//if we dont give priorty it will execute in alphabetical order
	@Test(priority=1)  //1)with both valid usn nad pwd
	public void validateLoginUsingValidCredentials() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("reyaz0806");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://adactinhotelapp.com/SearchHotel.php");
		//if above line doesnot matches test will appear as failed
	}
	
	@Test (priority=2) //1)with both invalid usn nad pwd
	public void validateLoginUsingInValidCredentials() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("reyaz806");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("reya123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://adactinhotelapp.com/");
		
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
		
		Assert.assertTrue( driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details')]")).isDisplayed());
		//if above line doesnot matches test will appear as failed
	}
	
	@Test (priority=2) //1)with both invalid usn nad pwd
	public void validateLoginUsingInValidUsernameAndValidPwd() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("reyaz806");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://adactinhotelapp.com/");
		
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
		
		Assert.assertTrue( driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details')]")).isDisplayed());
		//if above line doesnot matches test will appear as failed
	}
	
	@Test (priority=3) //1)with both invalid usn nad pwd
	public void validateLoginUsingValidPasswordAndWithoutUsername() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("  ");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://adactinhotelapp.com/");
		
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
		
		Assert.assertTrue( driver.findElement(By.xpath("//span[@id='username_span']")).isDisplayed());
		//if above line doesnot matches test will appear as failed
	}
	

	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
