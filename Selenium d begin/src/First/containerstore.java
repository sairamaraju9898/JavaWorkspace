package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class containerstore {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://www.containerstore.com/welcome.htm");
	Actions actions=new Actions(driver);
	WebElement element=  driver.findElement(By.xpath("//a[text()='Storage']"));
	actions.moveToElement(element).perform();
	WebElement element1=driver.findElement(By.xpath("//a[text()='Baby & Kids']"));
	actions.click(element1).perform();
	Thread.sleep(3000);
	WebElement element2=  driver.findElement(By.xpath("//p[text()='TOY STORAGE']"));
	if(element2.isDisplayed() && element2.isEnabled()) {
		actions.click(element2).perform();;	
	}
	else {
		System.out.println("Toy storage not identified");
	}
	Thread.sleep(3000);
	WebElement element3= driver.findElement(By.xpath("//input[@placeholder='Min']"));
	String string= element3.getAttribute("class");
	System.out.println("Attribute is :" +string);
	if(element3.isDisplayed() && element3.isEnabled()) {
		element3.sendKeys("20");
	}
	else {
		System.out.println("Min not identified");
	}
	WebElement element4= driver.findElement(By.xpath("//input[@placeholder='Max']"));
	actions.sendKeys(element4, "30").perform();
//	WebElement element5= driver.findElement(By.xpath("//p[text()='$10 to $25 (36)']/parent::span/preceding-sibling::span/input"));
//	if(!element5.isSelected()) {
//		Thread.sleep(5000);
//		element5.click();
//	}
	WebElement element6= driver.findElement(By.xpath("//button[text()='GO']"));
	actions.sendKeys(element6, Keys.ENTER).perform();
	Thread.sleep(5000);
	WebElement element7= driver.findElement(By.xpath("//p[text()='Wooden Stacking Bin']"));
	//actions.sendKeys(element6, Keys.ENTER).perform();
	element7.click();
	WebElement element8= driver.findElement(By.xpath("//input[@value='1']/parent::div/parent::div/following-sibling::div"));
	//actions.sendKeys(element6, Keys.ENTER).perform();
	element8.click();
	Thread.sleep(3000);
	element8.click();
	
	Thread.sleep(3000);
	element8.click();
	Thread.sleep(3000);
	WebElement element9= driver.findElement(By.xpath("//button[text()='Add to Cart']"));
	actions.sendKeys(element9, Keys.ENTER).build().perform();
	Thread.sleep(3000);
	WebElement element10= driver.findElement(By.xpath("//div[@class='MuiBox-root css-1drntb5']/following-sibling::div/button"));
	actions.sendKeys(element10, Keys.ENTER).build().perform();
	Thread.sleep(5000);
    WebElement element11=	driver.findElement(By.xpath("//div[text()='Dimensions: 12\" x 14\" x 11\" h']/following::div[@class='css-5n80fc']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-1jg6iyb']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4 css-pbcwlj'][1]/button[@tabindex='0']"));
    actions.sendKeys(element11, Keys.ENTER).build().perform();
    Thread.sleep(5000);
    actions.sendKeys(element11, Keys.ENTER).build().perform();
    Thread.sleep(3000);
    WebElement element12= driver.findElement(By.xpath("//img[@alt='delete']"));
	actions.sendKeys(element12, Keys.ENTER).build().perform();
	Thread.sleep(3000);
    driver.close();
}
}
