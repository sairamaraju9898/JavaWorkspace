package com.Testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2_by_Anotations {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
	 System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 System.out.println("Before suite");
	}
	@Test
	public void loginTest() {
		driver.get("https://www.gmail.com");
		WebElement un= driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("rameshsoft@gmail.com");
		WebElement nxt= driver.findElement(By.id("identifierNext"));
		nxt.click();
		System.out.println(" login Test");
		}
	@AfterSuite
	public void closebrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		System.out.println("after suite");
		}
	@BeforeMethod
    public void beforemethod() {
	    System.out.println("beforemethod");
        }
	@AfterMethod
	  public void aftermethod() {
		    System.out.println("aftermenthod");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	
}