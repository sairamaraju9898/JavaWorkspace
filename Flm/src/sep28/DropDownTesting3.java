package sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTesting3 {
	
	public static void main(String[] args) throws InterruptedException {
		//selecting dropdown element without using the select class i.e directly find the element that needs to be selected from dropdown by using
		//findelement method
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//select//following::option[contains(text(),'Books')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
	
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());

		driver.quit();
	}

}
