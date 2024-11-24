package com.Testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
WebDriver driver;
public void openBrowser() {
 System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
public void loginTest() {
	driver.get("https://www.gmail.com");
	WebElement un= driver.findElement(By.id("identifierId"));
	un.clear();
	un.sendKeys("rameshsoft@gmail.com");
	WebElement nxt= driver.findElement(By.id("identifierNext"));
	nxt.click();
}

public void closebrowser() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
	}
public static void main(String[] args) throws InterruptedException {
	practice1 p=new practice1();
    p.openBrowser();
    p.loginTest();
    p.closebrowser();
}
}
