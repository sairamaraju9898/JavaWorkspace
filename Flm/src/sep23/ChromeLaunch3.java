package sep23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch3 {
   public static void main(String[] args) throws InterruptedException {
	   
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	System.out.println("Title is : "+driver.getTitle());
	
	System.out.println("url is  :"+driver.getCurrentUrl());
	
	//System.out.println("page source is :"+driver.getPageSource());
	
	System.out.println("window handle is :"+driver.getWindowHandle());
	
	
	WebElement element=driver.findElement(By.xpath("//img[contains(@src,'google-play')]"));
	element.click();
	Thread.sleep(3000);
	System.out.println("window handles are :"+driver.getWindowHandles());
	
	
	driver.switchTo().window("");
	driver.close();
	Thread.sleep(3000);
	driver.quit();
	
}
}
