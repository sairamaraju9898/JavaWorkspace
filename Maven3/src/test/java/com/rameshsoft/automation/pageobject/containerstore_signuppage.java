package com.rameshsoft.automation.pageobject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.basetest.Basetest;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.utilities.pojoReader;

public class containerstore_signuppage  extends Basetest{

	@FindBy(xpath="//a/*[@id='tcs-icon-account-3']/parent::a")
	private static WebElement signup;
	
	@FindBy(xpath="//a[starts-with(text(),'Sign up now')]")
	private static WebElement sign_up_now;
	
	@FindBy(xpath="//input[@id='givenName']")
	private static WebElement firstname;
	
	@FindBy(xpath="//input[@id='surname']")
	private static WebElement lastname;
	
	@FindBy(xpath="//input[@id='email']")
	private static WebElement email;
	
	@FindBy(xpath="//input[@id='newPassword']")
	private static WebElement pwd;
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	private static WebElement cfpwd;
	
	@FindBy(xpath="//input[@id='postalCode']")
	private static WebElement zip;
	
	
	
	
	public static void homesign()
	{
		try {
			signup.click();
			System.out.println("clicked uppon signup in home page");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void signinpage_signup()
	{
		try {
		sign_up_now.click();	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createAnAccountPage() throws EncryptedDocumentException, InvalidFormatException, IOException, Frameworksexception, InterruptedException
	{
		try {
 
		List<String> data= pojoReader.getexcelreaderobj().getsheetdata("sheetname", "Signup");
		System.out.println(data);
		System.out.println(data.subList(6, 12));
		System.out.println(data.get(0));
		int index = 6;
		for (int i = 1; i <6 ; i++)
		{
			System.out.println(i);
			//Thread.sleep(1000);
			firstname.clear();
			firstname.sendKeys(data.subList(index, index+6).get(0));
			//Thread.sleep(1000);
			lastname.clear();
			lastname.sendKeys(data.subList(index, index+6).get(1));
		
			//Thread.sleep(1000);
			email.clear();
			email.sendKeys(data.subList(index, index+6).get(2));
			
		//	Thread.sleep(1000);
			pwd.clear();
			pwd.sendKeys(data.subList(index, index+6).get(3));
			
			//Thread.sleep(1000);
			cfpwd.clear();
			cfpwd.sendKeys(data.subList(index, index+6).get(4));
			
			//Thread.sleep(1000);
			zip.clear();
			zip.sendKeys(data.subList(index, index+6).get(5));
			
			//Thread.sleep(1000);
			System.out.println(data.subList(index, index+6).get(0));
			System.out.println(data.subList(index, index+6).get(1));
			System.out.println(data.subList(index, index+6).get(2));
			System.out.println(data.subList(index, index+6).get(3));
			System.out.println(data.subList(index, index+6).get(4));
			System.out.println(data.subList(index, index+6).get(5));
			System.out.println(data.subList(index, index+6).get(0));
			index = index + 6;
			Thread.sleep(1000);
		}
		}
		catch (Exception e) {
	   System.out.println(e.getMessage());
		}
	}
	static {
		PageFactory.initElements(getdriver(), containerstore_signuppage.class);
}
}