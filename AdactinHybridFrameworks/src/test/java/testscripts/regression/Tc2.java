package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;

public class Tc2  extends BaseTest{
	
	@Test(dataProvider="getTestData2")
	public void checkInCheckOutDate(HashMap<String, String> testDataMap)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(testDataMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(testDataMap.get("password"));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), testDataMap.get("expected title"));	
		
		Select selectLocation =new Select(driver.findElement(By.xpath("//select[@id='location']")));
		selectLocation.selectByValue(testDataMap.get("Location"));
		 
		Select selectHotel=new Select(driver.findElement(By.xpath("//select[@id='hotels']")));
		selectHotel.selectByValue(testDataMap.get("hotels"));
		new Select(driver.findElement(By.xpath("//select[@id='room_type']"))).selectByValue(testDataMap.get("room type"));
		new Select(driver.findElement(By.xpath("//select[@id='room_nos']"))).selectByVisibleText(testDataMap.get("no of rows"));

		
		driver.findElement(By.xpath("//input[@id='datepick_in']")).clear();
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys((testDataMap.get("check in date")));
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys((testDataMap.get("check out date")));
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='datepick_in']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='datepick_out']")).isDisplayed());
		
		
		
		 
	}
	
	@DataProvider
	public Object[][] getTestData2()
	{
		Object[][] data=new Object[1][1];
	
		data[0][0]=UtilKit.getTestDataFromExcel("TC-102");
		return data;
}

}
