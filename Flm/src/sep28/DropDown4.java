package sep28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DropDown4 {
	
	// here till now we have seeen how to select particular element inside the dropdown nowe we will see how to get the list of all the elements inside
	//the dropdown and count of them  this is first approach asn like links testing in links package amazon links testg4 we dentified the
	//block and then under this we identified the lis of elements  same her we identified the dropdown and under thus we identified
	//the elements 

	public static void main(String[] args) {
		
		
	WebDriver driver=	new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement element=  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
   List<WebElement>	li= element.findElements(By.tagName("option"));
   
   System.out.println("Total no of elements inside the dropdown is : "+ li.size());
   
   for(WebElement e:li) {
	   System.out.println(e.getText());
   }
	
   driver.quit();
	
	}
}
