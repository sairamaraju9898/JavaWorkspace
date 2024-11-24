package sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingAssignment3 {
  public static void main(String[] args) {
	//Assisgnment 3

//Check below links in https://www.amazon.in/
//
//Sell on Amazon
//Sell under Amazon Accelerator
//Protect and Build Your Brand
//Amazon Global Selling
//Supply to Amazon
//Become an Affiliate
//Fulfilment by Amazon
//Advertise Your Products
//Amazon Pay on Merchants
//
//hint : use 
//
//driver.navigate().back();
	  
	WebDriver driver=  new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	
	//sell on amazon
	
	System.out.println("seell on amamzon lnik");
	
	System.out.println(	driver.findElement(By.linkText("Sell on Amazon")).getAttribute("href"));

	
	driver.findElement(By.linkText("Sell on Amazon")).click();;
	
	System.out.println(	driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'How to sell on Amazon.in?')]")).isDisplayed());
	
	
driver.navigate().back();
	
	//Protect and Build Your Brand
	
	System.out.println("Protect and Build Your Brand");
	
	System.out.println(	driver.findElement(By.linkText("Protect and Build Your Brand")).getAttribute("href"));
	
	driver.findElement(By.linkText("Protect and Build Your Brand")).click();
	

	System.out.println(	driver.getCurrentUrl());
	
	
	System.out.println(driver.getTitle());
	
	
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Together, we')]")).isDisplayed());
	
	driver.quit();
	
	
	

}
}
