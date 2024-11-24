package com.rameshsoft.automation.appln.bussinessscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Linksdemo { // demo example for using javascriptexecutor
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\properties4\\drivers\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(49, TimeUnit.SECONDS);
		//driver.get("https://www.gmail.com");
		driver.executeScript("window.location='https://www.gmail.com'");//to launch browser using jse
	WebElement username=driver.findElement(By.id("identifierId"));
	driver.executeScript("arguments[0].value='rameshsoft9177791456';",  username); //datatyping using jse
	//	WebElement next=driver.findElement(By.id("identifierNext"));
	//	driver.executeScript("arguments[0].click();",next); //using click on jse
		driver.executeScript("document.getElementById('identifierNext').click();"); //here were identifying next element and click oprtion directly in singl step by using jse
		
		//driver.executeScript("location.reload()");// to reload page by jse
		String domainame=driver.executeScript("return document.domain;").toString();// to get domain name actually im not sure what this domain name is
		System.out.println("Domain name is:"+domainame);
		String url=driver.executeScript("return document.URL;").toString();
		System.out.println("current url is:"+url);
		String title=driver.executeScript("return document.title;").toString();
		System.out.println("Title is:"+title);
	}

}
