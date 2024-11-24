package sep26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
	driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		//getting inline error text if we click the login without entering login credentials whcih can be used for validation that means whether the error is really coming if we
      //  click the login buttoin without entering the crdentials		
		
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Enter Username']")).getText());
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("name"));
		
		
		

		System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-size"));
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-family"));
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}
}
