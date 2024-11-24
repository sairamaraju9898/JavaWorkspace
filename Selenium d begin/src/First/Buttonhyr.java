package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonhyr {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	driver.findElement(By.xpath("//button[@class='bcButton' and @id='registerbtn']")).click();;
	WebElement element=  driver.findElement(By.xpath("//input[@class='bcCheckBox' and @id='englishchbx']"));
	
	if(!element.isSelected()) {
		element.click();
	}
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ALLURI sits RAMA RAJU");
	
	WebElement element1=   driver.findElement(By.xpath("//a[@id='navigateHome']"));
	if(element1.isDisplayed() && element1.isEnabled()) {
		element1.click();
	}
	driver.getWindowHandles();
	 
}
}
