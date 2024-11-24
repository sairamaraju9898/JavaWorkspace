package First;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsbyindex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parentwindow=  driver.getWindowHandle();
		System.out.println("parent window handle  "+parentwindow );
		WebElement tbox=  driver.findElement(By.xpath("//input[@class='whTextBox']"));
		tbox.sendKeys("were in now default window");
		driver.findElement(By.xpath("//button[@class='whButtons' and @id ='newTabBtn']")).click();
	    Set<String> windowSet=	driver.getWindowHandles();
	    String secondwindowString=" ";
	    for(String window :windowSet) {
	    	if(!window.equalsIgnoreCase(parentwindow)) {
	    		secondwindowString=window;
	    		driver.switchTo().window(secondwindowString);
	    		//driver.manage().window().maximize();
	    		System.out.println("second window :" +secondwindowString);
	          //  driver.findElement(By.xpath("//input[@class='bcTextBox' and @id='firstName']")).sendKeys("sai rama raju");;
	         //   driver.close();
	    		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
	    		 Alert alert= driver.switchTo().alert();
	    		// alert.sendKeys("popup ");
	    		 alert.accept();
	    	
	    	}
	    	
	    }
	    List<String> list=new ArrayList<String>(windowSet); //here were typecasting set object to list of generic type string bcz no get method is present in set interface
	   String windowindex= list.get(0);
	   driver.switchTo().window(windowindex);
		tbox.clear();
		tbox.sendKeys("afetr 2 window camew ");
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[@id='alertBox' and text()='Click me'  and @onclick='alertFunction()']")).click();;
		Alert alert1=  driver.switchTo().alert();
		//alert1.sendKeys("no yadagiri reddy");
		alert1.accept();
		 driver.switchTo().window(windowindex);
		 tbox.clear();
		 tbox.sendKeys("afetr 3 window camew ");
		
}
}