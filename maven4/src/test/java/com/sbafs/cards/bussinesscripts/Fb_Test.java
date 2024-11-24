package com.sbafs.cards.bussinesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sbafs.cards.base.Basetest;

public class Fb_Test extends Basetest{
@Test
public void fbTest() {
	getdriver().get("https://www.facebook.com/login/");
WebElement element=	getdriver().findElement(By.xpath("//input[@type='text' and @id='email']"));
//element.sendKeys("sairamaraju");
Actions actions=new Actions(getdriver());
actions.sendKeys(element, "sairamaraju").perform();
WebElement element2=getdriver().findElement(By.xpath("//input[@type='password' and @id='pass']"));
actions.sendKeys(element2,"qwertyuiop").perform();
WebElement element3= getdriver().findElement(By.xpath("//button[@name='login']"));
actions.sendKeys(element3, Keys.ENTER);

}
}
