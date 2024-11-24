package sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestingAssignment4 {

	
	public static void main(String[] args) throws InterruptedException {
//		Assisgnment 4
//
//		In https://www.facebook.com/
//
//		click on "Create new account"
//
//		In Sign up Modal / Pop 
//
//		select your date of birth
		
	WebDriver driver=	new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(3000);
	
	new Select(driver.findElement(By.id("day"))).selectByVisibleText("19");
	Thread.sleep(3000);
	new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jun");
	Thread.sleep(3000);
	new Select(driver.findElement(By.id("year"))).selectByValue("1998");
	Thread.sleep(3000);
	driver.quit();
	
	
	
	}
}
