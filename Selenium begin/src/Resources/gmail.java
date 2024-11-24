package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
  WebElement w=   driver.findElement(By.id("identifierId"));
  
w.clear();
w.sendKeys("sairamaraju98@gmail.com");
//WebElement m= driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
WebElement m=   driver.findElement(By.id("identifierNext"));
m.click();
}
}
