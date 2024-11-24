package testscripts.regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ValidationKeywords;
import utils.UtilKit;

public class ValidateLoginUsingHybrid extends BaseTest {
	@Test(dataProvider = "getTestData")
	public void loginTest(HashMap<String, String> map) {
	ValidationKeywords app=new ValidationKeywords();
	app.startBrowser();
	app.launchApp();
//	app.type("username_textbox", "reyaz0806");
	app.type("username_textbox", map.get("username"));
//	app.type("password_textbox", "reyaz123");
	app.type("password_textbox", map.get("password"));
	app.click("login_button");
//	app.verifyTitle("Adactin.com - Search Hotel");
	app.verifyTitle(map.get("expected title"));
//	
	
	
	}
	@DataProvider
	public Object[][] getTestData()
	{
		Object[][] data=new Object[1][1];
		//always remember here first one refers rows and canother 1 rfeeres colums here we hacve one row one column
		
		data[0][0]=UtilKit.getTestDataFromExcel("TC-101");
		//were passing the testcase name and getting the hashmap object whcih contains 3 sets of data in the form of key value pairs
		//user="....", pwd=,....,  exp title=...
		//th above three key value pairs were stored in data whcih is object array
		//in general the columns refer to how many args we need tpo mention in the passing method i.e validateLoginTest1
		//but  here we need to take take 3 args but we took only one arg i.e testDataMap bcz this holds all three sets of data
		//and by using the hasmp methods were calling key and getting value  in the below lines i.e testDataMap.get("username")
		return data;
		
	}
}
