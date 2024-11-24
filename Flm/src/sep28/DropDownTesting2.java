package sep28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownTesting2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=	new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
//    WebElement element=	driver.findElement(By.id("searchDropdownBox"));
//    Select s=new Select(element);
//    select by index
//    //by using select class and selectnyindex method but index mechanism is nor  preferred in realtime bcz elements change everytime so go with select bytext method 
//    s.selectByIndex(10);
	//(select by value)
//	new Select(driver.findElement(By.id("searchDropdownBox"))).selectByValue("");;
	//(select by text)
	new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");;
	
    Thread.sleep(3000);
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());

	driver.quit();
	
    
    
	}
}
