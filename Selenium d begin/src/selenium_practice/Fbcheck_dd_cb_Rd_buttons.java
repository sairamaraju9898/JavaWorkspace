package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbcheck_dd_cb_Rd_buttons {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	List<WebElement> l=driver.findElements(By.xpath("//*"));
	System.out.println("Total no of elements is :"+l.size());
	int ddcount=0;
	int checkboxcount=0;
	int rdcount=0;
	int textboxcount=0;
	for(WebElement w:l) {
	String s1=	w.getTagName();
	if(s1.equalsIgnoreCase("select")) {
		ddcount++;
	}
	String s2=w.getAttribute("type");
	if(s2!=null) {
		if(s2.equalsIgnoreCase("radio")) {
		rdcount++;
	    }
		else if(s2.equalsIgnoreCase("checkbox")) {
			checkboxcount++;
		}
		else if(s2.equalsIgnoreCase("text")) {
			textboxcount++;
		}
		
	}
    }
	System.out.println("Total dropdown count is "+ ddcount);
	System.out.println("Total checkbox count is "+ checkboxcount);
	System.out.println("Total radiobutton count is "+ rdcount);
	System.out.println("Total textbox count is "+ textboxcount);

}
}
