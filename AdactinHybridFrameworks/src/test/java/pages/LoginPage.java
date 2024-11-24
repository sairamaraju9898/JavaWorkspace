package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage{

	public LoginPage() {
		super();
	}

	@FindBy(xpath="//input[@name='username']")
	WebElement userNameTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginButton;
	
	public void userNameTextBox(String text) {
		type(userNameTextBox, text);
	}
	
	public void passwordTextBox(String text) {
		type(passwordTextBox, text);
	}
	
	public void loginButton() {
		click(loginButton);
	}
}
