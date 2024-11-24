package selenium_practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class switchwindow_Rameshsoft {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Actions actions=new Actions(driver);
	driver.get("https://www.rameshsoft.com");
	String s=driver.getWindowHandle();
	System.out.println("parent window is :" +s);
	driver.findElement(By.xpath("//a[text()='Videos']")).click();
	Set<String> w= driver.getWindowHandles();
	for(String ss :w) {
		if(ss.equalsIgnoreCase(s)) {
			System.out.println("were on parent window");
		}
		else {
			System.out.println("were on else so here we willl switch to second window i.e videos youtube");
			driver.switchTo().window(ss);
		}
	}
	System.out.println("switching operation to 2nd window is completed now we perform req actions on 2nd way");
	WebElement e=driver.findElement(By.xpath("//input[@id='search']"));
	System.out.println("hello");
	e.sendKeys("Arrays in java");
	
	WebElement a=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	System.out.println("hello");
	actions.click(a).perform();
}
}
