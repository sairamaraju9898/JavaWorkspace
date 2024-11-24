package sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTesting1 {
// for dropdown must and should have the select tagname and in internal elements inside this will have option as tagname and value as mandatory attribute 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//by using conventional way i.e using sendkeys method to selecr from dropdown
		
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		Thread.sleep(3000);
		
		// in manual way we enter the data in keyboard no need to check for case sensitive here
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());

		driver.quit();
		
		
	}
}
