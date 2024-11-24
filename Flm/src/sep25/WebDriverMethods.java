package sep25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver		=new ChromeDriver();
    
    driver.get("http://adactinhotelapp.com/");
    
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    
    driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();;
    
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    driver.navigate().back();
    System.out.println(driver.getTitle());
    driver.navigate().forward();
    
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    
    driver.navigate().to("https://www.facebook.com/");
    
    
	}
}
