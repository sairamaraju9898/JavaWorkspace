package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_open {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium begin\\chromedriver\\chromedriver.exe");
//	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	  driver.get("https://www.youtube.com/");
	WebElement e=  driver.findElement(By.xpath("//input[@id='search']"));
	e.clear();
	e.sendKeys("bro trailer");
	WebElement p=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	p.click();
WebElement b=	driver.findElement(By.xpath("//a[@id='video-title']/yt-formatted-string[@aria-label='BRO Trailer | Pawan Kalyan | Sai Tej | Trivikram | Samuthirakani | ThamanS | July 28th Release by Zee Studios 3 days ago 2 minutes, 16 seconds 31,637,574 views']"));
b.click();

	
	  
	  
	  
	
}
}
