package sep28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class DropdownTesting5 {

	
	public static void main(String[] args) {
		WebDriver driver=	new ChromeDriver();
		//this is to identify all thje elemts inside the dropdown by using the selct class and getoptions method
		driver.get("https://www.amazon.in/") ;
		
		driver.manage().window().maximize();
		
		WebElement element=  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s=new Select(element);
        List<WebElement> li=	s.getOptions();
        
        System.out.println("Total elements under the dropdown is :"+li.size());
        
        for(int i=0;i<li.size();i++) {
        
        WebElement m=	li.get(i);
        System.out.println("element "+ i + "="+ m.getText());
        }
        
        driver.quit();
		
	}
}
