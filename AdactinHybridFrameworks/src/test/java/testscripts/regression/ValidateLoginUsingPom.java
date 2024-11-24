package testscripts.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchHotelPage;

public class ValidateLoginUsingPom extends BaseTest {

	
	@Test
	
	public void validateLogin() {
	
		
		
	LoginPage loginPage=new LoginPage();
	loginPage.userNameTextBox("reyaz0806");
	loginPage.passwordTextBox("reyaz123");
	
	loginPage.loginButton();
	SearchHotelPage searchHotelPage=new SearchHotelPage();
	searchHotelPage.verifyTitle("Adactin.com - Search Hotel");
	searchHotelPage.helloUsernameText("reyaz0806");
	
	}
}
