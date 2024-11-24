package com.ram.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ram.automation.appln.basetest;

public class gmail extends basetest{
	@Test
public void gmailtest() {
		getDriver().get("https://www.gmail.com"); 
WebElement un=getDriver().findElement(By.id("identifierId"));
un.clear();
un.sendKeys("rameshsoft.9177791456@gmail.com");
WebElement nxt=getDriver().findElement(By.id("identifierNext2"));
nxt.click();
	}
}
