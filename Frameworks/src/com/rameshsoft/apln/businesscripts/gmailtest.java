package com.rameshsoft.apln.businesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.Automation.base.BaseTest;

public class gmailtest extends BaseTest{
	@Test
	public void logintest() {
		getdriver().get("https://www.gmail.com");
	    WebElement un=	getdriver().findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("rameshsoft.9177791456@gmail.com");
	    WebElement nxt=getdriver().findElement(By.id("identifierNext"));
	    nxt.click();
	}
}
