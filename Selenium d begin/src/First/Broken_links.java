package First;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	String handle=  driver.getWindowHandle();
	System.out.println("parent window handle  "+handle );
    List<WebElement> links=    driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    for(WebElement link :links) {
    String s=  	link.getAttribute("href");
    URL url =new URL(s);
   URLConnection urlConnection=url.openConnection();
   HttpURLConnection  HttpURLConnection =(HttpURLConnection)urlConnection;
   HttpURLConnection.setConnectTimeout(5000);
   HttpURLConnection.connect();
   if(HttpURLConnection.getResponseCode()==200) {
	   System.out.println(s + "    This is valid :  "+HttpURLConnection.getResponseCode()+ " : "+HttpURLConnection.getResponseMessage());
	   HttpURLConnection.disconnect();
   }
   else {
	   System.err.println(s + " : " +HttpURLConnection.getResponseCode()  +" : " + HttpURLConnection.getResponseMessage());
	   HttpURLConnection.disconnect();
   }

    }
    driver.quit();
}
}
