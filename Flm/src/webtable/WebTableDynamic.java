package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableDynamic {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	
	@Test
	public void webTableTest() {
	WebElement table=	driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']//tbody"));
List<WebElement> allRows=	table.findElements(By.tagName("tr"));

for(WebElement row: allRows) {
	
	List<WebElement> allColums=row.findElements(By.tagName("td"));
	
	
	for(WebElement col:allColums) {
		System.out.print(col.getText()+ "\t");
		
		
	}
	
	System.out.println();
	
	
}



	}
	
}
