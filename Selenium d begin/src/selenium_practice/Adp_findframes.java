package selenium_practice;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.Value;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal;

public class Adp_findframes {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.adp.com");
	List<WebElement> l=driver.findElements(By.xpath("//*"));
	System.out.println("total no of elements is : " + l.size());
	int framecount=0;
	int n=1;
	for(WebElement w:l) {
	String s=w.getTagName();
	if(s.equalsIgnoreCase("iframe")||s.equalsIgnoreCase("frame")){
	framecount++;
	String ss=w.getAttribute("id");
	String s1=w.getAttribute("class");
	System.out.println("id , class atributes for " + n +"st iframe is " + ss +"   " + s1);
	n++;
	}
	}
	
	System.out.println(" Total Count of frames is " + framecount);

}
}
