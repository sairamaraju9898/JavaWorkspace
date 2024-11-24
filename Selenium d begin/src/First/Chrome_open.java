package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_open {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium begin\\chromedriver\\chromedriver.exe");
//		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		  driver.get("https://www.youtube.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement e=  driver.findElement(By.xpath("//input[@id='search']"));
		e.clear();
		e.sendKeys("bro trailer");
		WebElement p=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		p.click();
	WebElement b=	driver.findElement(By.xpath("//a[@id='video-title'][@class='yt-simple-endpoint style-scope ytd-video-renderer'][@title='BRO Trailer | Pawan Kalyan | Sai Tej | Trivikram | Samuthirakani | ThamanS | July 28th Release']"));
	b.click();
}
}
