package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class AdactinApp3 {
	
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched..");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser Closed ..");
	}
	
	@Test(priority =2)
	public void loginTest()
	//in this testcase we intentionally failed to see that if there is any test case that is dependent on this  test case such that it wont execute
	//it will skip i.e change pawd testc case4 doesnot excuet
	{
      Assert.assertTrue(false);
		System.out.println("Login Successfull...");
	
	}
	
	@Test(priority =1)
	public void registrationTest()
	{
		
		System.out.println("Registration Successfull...");
	
		
	}
	
	@Test(priority =3)
	public void forgotPasswordTest()
	{
	
		System.out.println("Forgot Password Successfull...");
	
		
	}
	
	@Test(priority = 4,dependsOnMethods = "loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Change Password Successfull...");
		
	}
	

}
