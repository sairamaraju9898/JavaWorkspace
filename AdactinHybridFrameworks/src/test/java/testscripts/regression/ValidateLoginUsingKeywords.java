package testscripts.regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ValidationKeywords;
import utils.UtilKit;

public class ValidateLoginUsingKeywords extends BaseTest {

	
	@Test
	public void loginTest() {
	ValidationKeywords app=new ValidationKeywords();
	app.startBrowser();
	app.launchApp();
	app.type("username_textbox", "reyaz0806");

	app.type("password_textbox", "reyaz123");

	app.click("login_button");
	app.verifyTitle("Adactin.com - Search Hotel");

	}
}
