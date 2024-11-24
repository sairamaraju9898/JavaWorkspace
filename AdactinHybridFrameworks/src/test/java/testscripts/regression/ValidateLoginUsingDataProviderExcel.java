package testscripts.regression;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;

public class ValidateLoginUsingDataProviderExcel extends BaseTest{
	
	
	
	
	@Test(dataProvider="getTestData")
	public void validateLoginTest1(HashMap<String, String> testDataMap)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(testDataMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(testDataMap.get("password"));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), testDataMap.get("expected title"));
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
