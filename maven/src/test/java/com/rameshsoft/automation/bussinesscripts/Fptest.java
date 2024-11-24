package com.rameshsoft.automation.bussinesscripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Actionsengine;
import com.rameshsoft.automation.basetest.Basetest;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.utilities.pojoReader;

public class Fptest extends Basetest {
@Test
public void fptest() throws Frameworksexception, IOException, InterruptedException {
String url=	pojoReader.getprconf().getpropertyvalue("fp_url");
Actionsengine.enterurl(url, "passing url");
Thread.sleep(5000);
//getdriver().findElement(By.xpath("//table/body/div[2]/div/div/button")).click();
//WebElement element=  getdriver().findElement(By.xpath("//div[@class='JFPqaw']"));
/*
 * Set<String> names= getdriver().getWindowHandles();
 * System.out.println("size is : "+names.size()); List<String> elements=new
 * ArrayList<String>(names); String window= elements.get(1); String
 * winString=elements.get(0); System.out.println(window);
 * System.out.println(winString); getdriver().switchTo().window(window);
 */
 WebElement e=	getdriver().findElement(By.xpath("/html/body/div[2]/div/div/button"));
 e.click();
 
}
}
