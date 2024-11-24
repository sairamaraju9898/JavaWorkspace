package com.rameshsoft.automation.appln.bussinessscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.basetest;

public class gmailtest extends basetest{
	@Test
public void gmaillogintest() {
		getDriver().get("https://www.gmail.com"); 
WebElement un=getDriver().findElement(By.id("identifierId"));
un.clear();
un.sendKeys("rameshsoft.9177791456@gmail.com");
WebElement nxt=getDriver().findElement(By.id("identifierNext123"));
nxt.click();
	}

}
