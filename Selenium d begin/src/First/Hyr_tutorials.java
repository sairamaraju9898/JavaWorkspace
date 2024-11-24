package First;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hyr_tutorials {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	String s=  driver.getWindowHandle();
	System.out.println("parent window handle  "+s );
WebElement e=	driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
Actions a=new Actions(driver);
	a.moveToElement(e).perform();
//	WebElement we=	driver.findElement(By.xpath("//a[text()='Selenium Practice']/following::ul/li//a[text()='Frames Practice']"));//frames
	WebElement we=  driver.findElement(By.xpath("//a[text()='Window Handles']"));//windows
	a.moveToElement(we).perform();
	a.click(we).perform();////span[text()='Close'];
Set<String> set= 	driver.getWindowHandles();
System.out.println("No of wondows are " +set.size());
WebElement popup=driver.findElement(By.xpath("//div[@id='card']"));
	driver.switchTo().alert().dismiss();
	
}
}
