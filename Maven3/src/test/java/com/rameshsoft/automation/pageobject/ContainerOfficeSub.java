package com.rameshsoft.automation.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.basetest.Basetest;

public class ContainerOfficeSub  extends Basetest{
   @FindBy(xpath="//p[@class='css-4yjb34']")
    private static List<WebElement> AllItems;
   
   @FindBy(xpath="//p[@class='css-4yjb34']//preceding::p[@class='css-bpt01s']")
   private static List<WebElement> AllpricesItems;//this is identifying price of element with reference to name of individual element
   
   
   @FindBy(xpath = "//p[@class='css-bpt01s']//following::p[@class='css-4yjb34']")
   private static List<WebElement> AllItemsPrices;  //this is identifying name of element with reference to price of individual element
   
   @FindBy(xpath="//p[@class='css-bpt01s']")
   private static List<WebElement> AllPrices;        
   
   @FindBy(xpath="//p[text()=' results']")
   private static WebElement results1_26_of_26;
   
   @FindBy(xpath="//input[@placeholder='Min']")
   private static WebElement min;
   
   @FindBy(xpath="//input[@placeholder='Max']")
   private static WebElement max;
   
   @FindBy(xpath="//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
   private static List<WebElement> allcheckboxes;
   
   
   public static void allItems() {
	   try {
		   for(WebElement ele : AllItems) {
		   System.out.println("Total no of elements in webpage is :"+ AllItems.size());
			   
			String element= ele.getText();
			
			System.out.println(" element is  :" + element); 
		   }
	   }
	   catch (Exception e) {
		System.out.println(" Elements not found");
	}
   }
   
   
   public static void allPrices() {
	   try {
		   for(WebElement al : AllPrices) {
		   System.out.println("Total no of cost of elements in webpage is :"+ AllPrices.size());
			   
			String element= al.getText();
			
			System.out.println(" element price is  :" + element); 
		   }
	   }
	   catch (Exception e) {
		System.out.println(" price Elements not found");
	}
   }
   
   public static void getCorrespondingItemsPrice() {
	   try {
		   
		   for(int i=0;i<AllItemsPrices.size();i++) {
			  for(int j=0;j<i;j++) {
				  System.out.println( AllItemsPrices.get(i).getText()+ " price is :"+ AllpricesItems.get(j).getText());
				  
			  }
		   }
   }
	   catch (Exception e) {
		
	}
   
}
   static {
		PageFactory.initElements(getdriver(), ContainerOfficeSub.class);
	}
}