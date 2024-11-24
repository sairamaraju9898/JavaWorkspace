package ram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RamaRaju {
	WebDriver driver;
	@Test //(dependsOnMethods = {"hike"},alwaysRun = true,description = "test",invocationCount = 5)
	public void logintest() throws InterruptedException {
		driver.get("https://www.gmail.com");
		WebElement un=driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("sairamaraju98@gmail.com");
		WebElement nxt=driver.findElement(By.xpath("//*[text()='Next']" ));
		nxt.click();
		//Thread.sleep(10000);
		//driver.close();
	 System.out.println("@Test:logintest()");}
	 @Test //(enabled=false)
	private void Job() {
	 System.out.println("@Test: Job()");
	 }
 @Test //(dependsOnMethods = {"logintest"})
 private void hike() {
	 System.out.println("@Test:hike()"); }
	@AfterSuite
	public void closebrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		System.out.println("After suite");
	}
	@BeforeMethod
	public void beforemethod() {  ///here method name and annotations may/maynot be same its indeependent
		System.out.println("bm"); }
		@AfterMethod
		public  void aftermethod() {
		System.out.println("am");
		}
		@BeforeTest 
			public void beforetest() {
				System.out.println("bt");
			}
		@AfterTest
		public void aftertest() {
			System.out.println("at");
		}
		@BeforeClass
		public void BeforeClass() {
			System.out.println("bc");
		}
		 @Test //(priority = 0)
		public void uselesseclipse() {
		System.out.println("@test :useless eclipse"); }
		@AfterClass 
		public void afterclass() {
			System.out.println("ac");}
			@BeforeSuite
			public void openbrowser() {
System.setProperty("webdriver.chrome.driver","H:\\JAVA Workspace\\project\\drivers\\chromedriver.exe" );
driver=new ChromeDriver(); 
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
System.out.println("bs");
	}
}


