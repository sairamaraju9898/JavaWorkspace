package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framehyr {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String s=  driver.getWindowHandle();
		System.out.println("parent window handle  "+s );
	    WebElement element=	driver.findElement(By.xpath("//input[@id='name' and @class='frmTextBox'][1]"));
	    element.sendKeys("Alluri sitaRamaRaju*** ");
	    
	WebElement frame1=    driver.findElement(By.xpath("//iframe[@id='frm1']"));
	    driver.switchTo().frame(frame1);
	WebElement we=    driver.findElement(By.xpath("//select[@id='course' ]"));
	Select  ss=new Select(we);
	ss.selectByVisibleText("Java");
	driver.switchTo().defaultContent();
	 element.sendKeys("  he is a fighter*** ");
	 driver.switchTo().frame(2);
	driver.findElement(By.xpath("//label[@class='inp']/following::input[@class='bcTextBox' and @id='lastName' ]")).sendKeys("Alluri");;
	 
	WebElement b= driver.findElement(By.xpath("//input[@class='bcCheckBox' and @id='englishchbx'][1]"));
	 if(!b.isSelected()) {
		 b.click();
	 }
	 driver.switchTo().defaultContent();
	 element.sendKeys("   is Real HERO");
	 driver.switchTo().frame("frm3");
	 WebElement frame3Element = driver.findElement(By.xpath("//select[@id='selectnav1']"));
	 if(frame3Element.isDisplayed()) {
		 System.out.println("Success");
		 frame3Element.click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//select[@id='selectnav1']/option[text()='- Telugu']")).click();
		 
	 }else {
		 System.out.println("Failed");
	 }
	}
}
