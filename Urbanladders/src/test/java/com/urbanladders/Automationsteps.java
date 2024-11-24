package com.urbanladders;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automationsteps {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	 			System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Urbanladders\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		
		WebElement living = driver.findElement(By.xpath("(//span[@class = 'topnav_itemname'])[3]"));
		living.click();
		 
		try {
		WebElement books = driver.findElement(By.xpath("(//span[text()='Bookshelves'])[1]"));
		books.click();}
		catch (Exception e) {
			e.printStackTrace();
		 
		}
	
		
		WebElement pricElement= driver.findElement(By.xpath("(//li[@data-group='price'])[1]"));
		WebElement dragElement= driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']")); 
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(pricElement).perform();;
		
		actions.dragAndDropBy(dragElement, -238, 0).perform();
		Thread.sleep(3000);
		try {
			WebElement popup= driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
			if(popup.isDisplayed() && popup.isEnabled()) {
			popup.click();
			}
			else {
				System.out.println("popup close button not identified");
			}
			  }
			catch (Exception e) {
				e.printStackTrace();
			}
		
		WebElement exclude = driver.findElement(By.id("filters_availability_In_Stock_Only"));
		exclude.click();
		
		
		List<WebElement> booklistelements = driver.findElements(By.xpath("//div[@class='product-title product-title-sofa-mattresses']/span"));
		for(int i=0;i<=2;i++) {
			System.out.println(booklistelements.get(i).getText());
		}

	}
	
}
