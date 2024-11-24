package com.rameshsoft.automation.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.rameshsoft.automation.basetest.Basetest;

public class ContainerStorageSub extends Basetest {

	@FindBy(xpath="//p[text()='Under $10 (15)']/parent::span/parent::label//input")
	private static WebElement under10$;

	  @FindBy(xpath="//p[@class='css-4yjb34']")
	  private static List<WebElement> under10$elements;
	  
	  @FindBy(xpath=" //p[@class='css-bpt01s']")
	  private static List<WebElement> under10cost;
	
	@FindBy(xpath="//p[text()='$10 to $25 (23)']/parent::span/parent::label//input")
	private static WebElement btw10to25;
	
	@FindBy(xpath="//p[text()='$25 to $50 (4)']/parent::span/parent::label//input")
	private static WebElement btw125to50;
	
	@FindBy(xpath="//p[text()='$50 to $100 (8)']/parent::span/parent::label//input")
	private static WebElement btw50to100;
	
	@FindBy(xpath="//p[text()='$100 to $500 (7)']/parent::span/parent::label//input")
	private static WebElement btw100to500;
	
	  
	@FindBy(xpath="//input[@type='checkbox']")
	private static List<WebElement>   AllCheckBoxes;
	
	private static JavascriptExecutor  jsExecutor= (JavascriptExecutor)getdriver(); 
	
//	public static void clickallchkbox() throws InterruptedException {
//		JavascriptExecutor  jsExecutor= (JavascriptExecutor)getdriver(); 
//		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",under10$);
//		Thread.sleep(5000);
//
//		 System.out.println("Number of Check boxes : "+ AllCheckBoxes.size());
//		     
//		 for(WebElement cb:AllCheckBoxes) {
//			 Thread.sleep(10000);
//			 getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//			 System.out.println(cb.getAttribute("type")); 
//		     cb.click();
//		     Thread.sleep(5000);
//		 
//		 }
//		 
//	}
	public static void under10elements() throws InterruptedException { 
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",under10$);
		Thread.sleep(3000);
		under10$.click();
		Thread.sleep(3000);
		System.out.println(under10$elements.size());
		try {
			for(WebElement el:under10$elements) {
				System.out.println(el.getText()) ;
				if(el.getText().equalsIgnoreCase("SmartStore Tall Inserts")) {
					el.click();
					
				}
			}
		    }
			catch (Exception e) {
				System.out.println("elements not found");
			}
			
		
	}
	public static void under10webelements() throws InterruptedException {
	    jsExecutor.executeScript("arguments[0].scrollIntoView(true);",under10$);
		Thread.sleep(3000);
		under10$.click();
		Thread.sleep(8000);
		System.out.println(" no of items in the page  :"+under10$elements.size());
		System.out.println(" prices of totalitems in the page  :"+under10cost.size());
		int i=0;
		int j=0;
		try {
			for(i=0;i<under10$elements.size();i++) { //this for name of element
				for(j=i;j<=i;j++) { //this for price ; ***(the thing is we can directly use one for loop instead of 2 loops)
					System.out.println("i value is :"+i);
					System.out.println("j value is :"+j); 
				System.out.println(under10$elements.get(i).getText() +"  price is : "+under10cost.get(j).getText());
				System.out.println("  ");
				
				}
				}
			System.out.println("i valueis :"+i);
			System.out.println("j valueis :"+j);
			}
			catch (Exception e) {
				System.out.println("elements not found");
			}
			
		
	}
//	public static void clickcheckboxunder10$() throws InterruptedException {
//		System.out.println("clicking on carts and then checking boxes");
//		
//		JavascriptExecutor  jsExecutor= (JavascriptExecutor)getdriver(); 
//		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",under10$);
//		Thread.sleep(3000);
//			if(!under10$.isSelected()) {
//				
//					System.out.println("clicking on under 10$ chkbox");
//				under10$.click();
//				Thread.sleep(2000);
//				}
//			else {
//				System.out.println("not displayed");
//			}
//		
//		
//			}
				
	static {
	
		PageFactory.initElements(getdriver(), ContainerStorageSub.class);
	}
}
