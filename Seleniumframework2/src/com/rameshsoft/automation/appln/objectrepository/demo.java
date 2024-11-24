package com.rameshsoft.automation.appln.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class demo {
		public static  void main(String [] args) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.gmail.com");
		//WebElement w=	driver.findElement(By.id("identifierId"));
			//w.sendKeys("sairamaraju98@gmail.com");
				JavascriptExecutor script= (JavascriptExecutor)driver;
	//	script.executeScript("arguments[0].value='sairamaraju98@gmail.com'", w);
				script.executeScript("return document.getElementsByName('identifier')[0].value='sairamaraju98@gmail.com'");
				
	            WebElement element=(WebElement)script.executeScript("return document.getElementById('identifierNext').click()");
		//element.click();
			
		}
		}

