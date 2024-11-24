package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BasePage{
	
	public SearchHotelPage() {
		super();
	}
	
	@FindBy(xpath="//input[@name='username_show']")
	WebElement helloUserNameText;
	
	public void helloUsernameText(String username) {
		verifyTextPresentAsValue(helloUserNameText,  "Hello "+ username+"!");
	}

}
