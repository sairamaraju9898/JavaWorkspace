package sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingAssignment2 {

	
//	Assisgnment 2
//
//	Check below links in Adactin home/login page  write scripts for all these in single script / class 
//
//	Forgot Password?
//
//	New User Register Here
//
//	Go to Build 2 
//
//	info@adactin.com
//
//
//	hint : use 
//
//	driver.navigate().back();
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=	new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
//		Forgot Password?
		
		System.out.println("frgt pwd link");
		System.out.println(	driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));
		
		driver.findElement(By.linkText("Forgot Password?")).click();

		
		System.out.println(	driver.getCurrentUrl());
		
		
		System.out.println(driver.getTitle());
		
		
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Forgot Password Form ')]")).isDisplayed());
		
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		
//		New User Register Here
		System.out.println("for new user reg here link");
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'New User Register Here')]")).getAttribute("href"));
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
	System.out.println(	driver.getCurrentUrl());
		
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'New User Registration Form ')]")).isDisplayed());
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		//	Go to Build 2 
		System.out.println("for Go to Build 2 link ");
		
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Go to Build 2 ')]//parent::a")).getAttribute("href"));
		
		driver.findElement(By.xpath("//strong[contains(text(),'Go to Build 2 ')]")).click();
		
         System.out.println(driver.getCurrentUrl());
		
		
		System.out.println(driver.getTitle());
		
		
		
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Existing User Login - Build 2')]")).isDisplayed());
		
		////	info@adactin.com
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		System.out.println("this is for email info@adactin.com ");
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'info@adactin.com')]")).getAttribute("href"));
		
		driver.findElement(By.xpath("//a[contains(text(),'info@adactin.com')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
