package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchHotelPage;
import utils.UtilKit;

public class ValidateLoginUsingPomDataProviderExcel extends BaseTest {

	
	@Test(dataProvider = "getTestData")
	
	public void validateLogin( HashMap<String, String> testData) {
	
		
		
	LoginPage loginPage=new LoginPage();
	//loginPage.userNameTextBox("reyaz0806");
	loginPage.userNameTextBox(testData.get("username"));
//	loginPage.passwordTextBox("reyaz123");
	loginPage.passwordTextBox(testData.get("password"));
	
	loginPage.loginButton();
	
	SearchHotelPage searchHotelPage=new SearchHotelPage();
	
	//searchHotelPage.verifyTitle("Adactin.com - Search Hotel");
	searchHotelPage.verifyTitle(testData.get("expected title"));
	
	searchHotelPage.helloUsernameText(testData.get("username"));
	
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
