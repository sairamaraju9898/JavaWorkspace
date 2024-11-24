package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertAssignment {

		WebDriver driver;
		@BeforeMethod
		public void setUp() {
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("	https://demo.guru99.com/V4/");
			
			
		}
		@AfterMethod 
		public void teardown() throws InterruptedException
		{
			Thread.sleep(3000);
			
			driver.quit();
		}
		
		@Test
		public void alertTest() throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr589366");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("yjahunA");
			driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			
			driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
			
			driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
			
			driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
			
			driver.switchTo().alert().accept();
			
			if(driver.switchTo().alert().getText().equals("Customer does not exist!!")) {
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			}
		}
		
}
