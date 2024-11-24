package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HyrFram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String s=  driver.getWindowHandle();
		System.out.println("parent window handle  "+s );
	    WebElement element=	driver.findElement(By.xpath("//input[@id='name' and @class='frmTextBox'][1]"));
	    element.sendKeys("ijwecbniwexniwxn");
	WebElement frame1=    driver.findElement(By.xpath("//iframe[@id='frm1']"));
	    driver.switchTo().frame(frame1);
	WebElement we=    driver.findElement(By.xpath("//select[@id='course' ]"));
	Select  ss=new Select(we);
	ss.selectByVisibleText("Java");
	driver.switchTo().defaultContent();
	element.clear();
	element.sendKeys("chavali anipistundi ");
	driver.switchTo().frame("frm2");
	driver.findElement(By.xpath("//input[@id='femalerb' and  @name='gender'][1]")).click();
	driver.findElement(By.xpath("//input[@class='bcCheckBox' and @id='englishchbx']")).click();
	driver.findElement(By.xpath("//input[@class='bcCheckBox' and @id='hindichbx']")).click();
	System.out.println("clicked");
	
	
	}
	}
