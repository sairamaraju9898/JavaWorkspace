package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting2 {
//this is to identify list of links in the page and print their href abd the text of that eleemnt
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	List<WebElement> alinks=	driver.findElements(By.tagName("a"));
	
	
//	for(WebElement element: alinks) {
//		
//		System.out.println(element.getText());
//		System.out.println(element.getAttribute("href"));
//	}
	
	
	System.out.println("No of links ="+alinks.size());
	for(int i =0;i<alinks.size();i++) {
	WebElement element=	alinks.get(i);
	
	System.out.println(element.getText());
	
	System.out.println(element.getAttribute("href"));
	}
	
	}
}
