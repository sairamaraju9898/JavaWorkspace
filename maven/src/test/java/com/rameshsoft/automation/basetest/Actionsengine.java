package com.rameshsoft.automation.basetest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

abstract public class Actionsengine extends Basetest {
	public static void enterurl(String url, String elementdescription) {
		try {
			 getdriver().get(url);	
	
		}
		catch (Exception e) {
			
			System.out.println("url  ot found");
		}
	 
	}
	
public static void clickbywe(WebElement element,String elementStringdesription) { //clicking action
	try {
		Assert.assertTrue(element.isDisplayed() && element.isEnabled());
		element.click();
	}
	catch (Exception e) {
		 e.printStackTrace();
		 System.out.println("clicking action not performed");
	}
}

public static  void clickbyactions(WebElement element,String elemntdesription) {
	try {
		Assert.assertTrue(element.isDisplayed() && element.isEnabled());
		Actions actions=new Actions(getdriver());
		actions.click(element).build().perform();
	}
	catch (Exception e) {
	//here we need to do extenterports logging but its not working sowere manually writing
		System.out.println("clicking action not performed");
	}
}

public static void clickbyjs(WebElement element ,String elementdescription) {
try {
	Assert.assertTrue(element.isDisplayed() && element.isEnabled());
	element.click();
}
catch (Exception e) {
System.out.println("click action not performed");
}	
}
public static void clickbyactionsEnter(WebElement element,String elementdesription) {
	try {
		Assert.assertTrue(element.isDisplayed() && element.isEnabled());
		Actions actions=new Actions(getdriver());
		actions.sendKeys(element, Keys.ENTER).perform();
	}
	catch (Exception e) {
		 System.out.println("clicking not performed");
	}
}

// Here data typing actions
public static void Dta(WebElement element,String testdata, String elementdesription) {
	try {
		Assert.assertTrue(element.isDisplayed() && element.isEnabled());
		element.clear();
		element.sendKeys(testdata);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("daata typing not performed");
	}
}
public static void Dtabyactions(WebElement element,String testdata, String elementdesription) {
	try {
		Assert.assertTrue(element.isDisplayed() && element.isEnabled());
		Actions actions=new Actions(getdriver());
		actions.sendKeys(element,testdata).perform();
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("data typing action is not performed");
	}
}

public static void Dtabyjs(WebElement element,String testdata, String elementdesription) {
	try {
		Assert .assertTrue(element .isEnabled() && element.isEnabled());
		
	}
	catch (Exception e) {
		System.out.println("data typing not performed");
	}
}
public static void handledropdown(WebElement element, String how, String howvalue) {
	try {
		Assert.assertTrue(element.isDisplayed() && element.isEnabled());
		Select select =new Select(element);
		if(how.equalsIgnoreCase("value")) {
			select.selectByValue(howvalue);
		}
		else if(how.equalsIgnoreCase("text")) {
			select.selectByVisibleText(howvalue);
		}
		else if(how.equalsIgnoreCase("index")) {
       int value=Integer.parseInt(howvalue);
       select.selectByIndex(value);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("not selcted dropdown");
	}
}

}

