package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonLinksTesting4 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']//parent::div[@class='navFooterLinkCol navAccessibility']"));
		
	    List<WebElement> allLinks=	block.findElements(By.tagName("a")); 
	    
	    System.out.println(allLinks.size());
	    
	    for(int i=0; i<allLinks.size();i++) {
	    	
	    WebElement element=	allLinks.get(i);
	    
	   // element.getText();
	    
	    System.out.println(element.getAttribute("href"));
	    element.click();
	    Thread.sleep(3000);
	    
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.navigate().back();
	    System.out.println("---------------");
	    
	    block=driver.findElement(By.xpath("//div[text()='Make Money with Us']//parent::div[@class='navFooterLinkCol navAccessibility']"));
	    
	    allLinks=  block.findElements(By.tagName("a"));
	    
	    Thread.sleep(3000);
	    }
		
	    driver.quit();
	}
}
