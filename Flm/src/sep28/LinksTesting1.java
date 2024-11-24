package sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver  driver=	new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	System.out.println(	driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));
	
	driver.findElement(By.linkText("Forgot Password?")).click();

	
	System.out.println(	driver.getCurrentUrl());
	
	
	System.out.println(driver.getTitle());
	
	
	System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Forgot Password Form ')]")).isDisplayed());
	
	Thread.sleep(3000);
	
	driver.close();
	
	
	}
}
