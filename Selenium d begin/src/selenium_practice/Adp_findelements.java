package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Adp_findelements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.adp.com");
	List<WebElement> l=driver.findElements(By.xpath("//*")); //1st wat
	List<WebElement> l1=driver.findElements(By.xpath("//*[contains(text(),ADP)]"));  //2nd way 
	
	System.out.println("Total no of elements in Adp webpage is  "+ l.size());
	int elementcount=0;
	for(WebElement e:l1) {
	String s=e.getText();
	if(s.contains("ADP") ||s.contains("adp")) {
		elementcount++;
	}
	}
	System.out.println("Total no of elements containing ADp or adp is " +elementcount);
}
}
