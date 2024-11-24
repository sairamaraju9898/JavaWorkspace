package First;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yt_automation {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	Actions a=new Actions(d);
	d.get("https://www.youtube.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement c=  d.findElement(By.xpath("//input[@id='search']")); //1st way
	

a.sendKeys(c, Keys.ENTER).build().perform();
a.sendKeys("aradya song").build().perform();
//c.clear();
//a.click(c).sendKeys("aradya song").build().perform();;    //2nd way
//c.sendKeys("aradya song");
WebElement e =   d.findElement(By.xpath("//button[@id='search-icon-legacy']"));
e.sendKeys(Keys.ENTER);
WebElement j=d.findElement(By.xpath("//a[@title='Aradhya - Lyrical | Kushi | Vijay Deverakonda, Samantha | Hesham Abdul Wahab| Sid Sriram | Chinmayi']"));
//j.click();
a.moveToElement(j).click().perform();

//a.click(j).build().perform();
d.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
 WebElement r=  d.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text']"));
 Thread.sleep(4000);
 if(r.isEnabled()&&r.isDisplayed()) {
	 r.click();
 }

}
}
