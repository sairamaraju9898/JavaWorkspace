package jaaa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jaa {
	ChromeDriver driver;
	  //WebDriver driver   //second approach to launch chrome browser)
		 public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","H:\\JAVA Workspace\\project\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS); }
		public  void logintest() { 
		driver.get("https://www.gmail.com");
	  WebElement  element=  driver.findElement(By.id("identifierId"));
	  element.sendKeys("sairamaraju98@gmail.com");
	 WebElement nxtElement= driver.findElement(By.xpath("//*[text()='Next']" )) ;
	 nxtElement.click();
		}
		
		 public  void closebrowser() throws InterruptedException {
			 Thread.sleep(5000);
			 driver.close();
		 }
		 public static void main(String[] args) throws InterruptedException {
				 jaa demo=new jaa();
				 demo.openbrowser();
				 demo.logintest();
				 demo.closebrowser();
			 }
		 }


