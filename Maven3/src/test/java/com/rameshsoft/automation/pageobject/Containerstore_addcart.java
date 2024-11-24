package com.rameshsoft.automation.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.basetest.Basetest;

public class Containerstore_addcart extends Basetest {

	@FindBy(xpath="//h1[@class='css-1p3gp4w']")
	private static WebElement heading;
	
	@FindBy(xpath="//p[@class='css-uwqzw6']")
	private static WebElement pricElement;
	
	@FindBy(xpath="//div[@class='css-1yfxow9']")
	private static WebElement color1;
	
	@FindBy(xpath="//div[@class='css-1lwyw5f']")
	private static WebElement color2;
	
	@FindBy(xpath="//input[@max='99999']/following::button[contains(@class,'css-1l1167e')]")
	private static WebElement plus;
	
	@FindBy(xpath="//input[@max='99999']")
	private static WebElement quantity;
	
	@FindBy(xpath="//input[@max='99999']/preceding::button[contains(@class,'css-1l1167e')]")
	private static WebElement minus;
	
	@FindBy (xpath="//button[contains(text(),'Add to Cart')]")
	private static WebElement add2cart;
	
	@FindBy(xpath=" //button[text()='Continue Shopping']")
	private static WebElement continueshopping;
	
	@FindBy(xpath=" //button[text()='Checkout Now']")
	private static WebElement checkoutnow;
	
	
	@FindBy(xpath="(//span/preceding::*[starts-with(text(),'Cart')]/parent::*[@id='tcs-icon-cart-5'])[1]")
	private static WebElement cart;
	
	public static void addcart() throws InterruptedException {
		JavascriptExecutor  jsExecutor= (JavascriptExecutor)getdriver(); 
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",heading);
		Thread.sleep(5000);
		try {
		String head=heading.getText();
		if(head.equalsIgnoreCase("SmartStore Tall SmartStore Insert White")){
		color1.click();
		System.out.println("clicked on color1");
		}
		Thread.sleep(3000);
		String count=  quantity.getAttribute("value");
		System.out.println(count);
		int i=   Integer.parseInt(count);
		System.out.println("i value is :"+i);
		if(i<=1) {
		for(int j=1;j<3;j++) {
			plus.click();	
			Thread.sleep(3000);
		}
		add2cart.click();
		Thread.sleep(5000);
		continueshopping.click();
//		 if(checkoutnow.isEnabled())
//			 checkoutnow.click();
//		System.out.println("clicked on continueshopping");
		Thread.sleep(5000);
		if(cart.isEnabled()) {
			cart.click();
			Thread.sleep(3000);
		}
		}
		
		}
		catch (Exception e) {
		e.getMessage();
		}
	}
	
	static {
		PageFactory.initElements(getdriver(), Containerstore_addcart.class);
	}
}
