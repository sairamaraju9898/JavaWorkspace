package com.rameshsoft.businesripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.Automation.Basetest.Basetest;

public class Gmailtest extends Basetest{
	@Test
	public void gmailtest() {
		getdriver().get("https://www.gmail.com");
	    WebElement un=	getdriver().findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("rameshsoft.9177791456@gmail.com");
	    WebElement nxt=getdriver().findElement(By.id("identifierNext456")); //intentionally giving wrong to take screenshot
	    nxt.click();
	}
}
