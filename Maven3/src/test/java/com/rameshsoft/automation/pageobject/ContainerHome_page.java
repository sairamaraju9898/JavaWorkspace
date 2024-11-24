package com.rameshsoft.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.basetest.Basetest;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;

public class ContainerHome_page extends Basetest {
	
	@FindBy(xpath="//a[text()='New & Now']")
	private static WebElement newNow;
	
    @FindBy(xpath="//a[text()='Elfa']")
    private static WebDriver elfa;
    
    @FindBy(xpath="//a[text()='Kitchen']")
    private static WebElement kitchen;
    
    @FindBy(xpath="//a[text()='Closet']")
    private static WebElement closet;
    
	@FindBy(xpath = "//a[text()='Storage']")
	private static WebElement storage;
	      @FindBy(xpath = "//a[text()='Hooks & Racks']/preceding::a[text()='Carts & Accessories']")
	      private static WebElement storage_container;
	    
	
	@FindBy (xpath="//a[text()='Garage & Shelving']")
	private static WebElement garage;
	
	@FindBy(xpath="//a[text()='Office']")
	private static WebElement office;
	      @FindBy(xpath="//a[text()='Office Supplies']/parent::li/following::li/child::a[text()='Desks & Chairs']")
	      private static WebElement desksNchairs;
	
	@FindBy(xpath="//a[text()='Bathroom']")
	private static WebElement bathroom;
	
	@FindBy(xpath="//a[text()='Cleaning']")
	private static WebElement cleaning;
	
	@FindBy(xpath="//a[text()='Travel']")
	private static WebElement travElement;
	
	@FindBy(xpath="Home Decor")
	private static WebElement homedecor;
	
	@FindBy(xpath="//a[text()='Featured']")
	private static WebElement featured;
	
	@FindBy(xpath="//a[text()='Sale']")
	private static WebElement sale;
	
	private static Actions actions=new Actions(getdriver());
	
	public static void Storage_carts() {
		try {
			Assert.assertTrue(storage.isDisplayed() && storage.isEnabled());
			actions.moveToElement(storage).perform();
				Thread .sleep(2000);
			actions.moveToElement(storage_container).perform();	
			storage_container.click();
			
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
	}
	 
	public static void Office_Desks_chairs() {
		try {
			Assert.assertTrue(office.isEnabled() && office.isEnabled());
			actions.moveToElement(office).perform();
			Thread.sleep(2000);
			actions.moveToElement(desksNchairs).perform();
			desksNchairs.click();
		}
		catch (Exception e) {
			
		}
	}
	static {
		PageFactory.initElements(getdriver(), ContainerHome_page.class);
	}
	}

