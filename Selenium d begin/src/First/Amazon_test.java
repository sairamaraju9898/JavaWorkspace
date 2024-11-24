package First;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Amazon_test {
public static void main(String[] args) throws Exception {
	System .setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	String s=  driver.getWindowHandle();
	System.out.println("parent window handle  "+s );
WebElement e=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
Actions a=new Actions(driver);
	a.click(e).perform();
//	a.sendKeys(e, Keys.ENTER);
	a.sendKeys(e,"iphone 14 pro").perform();
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//	driver.findElement(By.xpath("//a[@href='/sspa/click?ie=UTF8&spc=MTo4MTAxMzE0MDUxNzU3NTg0OjE2OTEyNDA1ODc6c3BfYXRmOjIwMDc3MjY5MjE0NDk4OjowOjo&url=%2FApple-iPhone-Pro-128GB-Gold%2Fdp%2FB0BDJBGBF3%2Fref%3Dsr_1_1_sspa%3Fcrid%3D11HI5QRE3RG83%26keywords%3Dapple%2B14%2Bpro%26qid%3D1691240587%26sprefix%3Dapple%2B14%2Bpro%252Caps%252C344%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1']/span[@class='a-size-medium a-color-base a-text-normal']")).click();
	
driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
//	driver.findElement(By.xpath("//*[@href='/sspa/click?ie=UTF8&spc=MTo2Njc2MzkyMTUxNzMxMzYxOjE2OTEyNDQzMzk6c3BfYXRmOjIwMDc3MjY5MjE0NDk4OjowOjo&url=%2FApple-iPhone-Pro-128GB-Gold%2Fdp%2FB0BDJBGBF3%2Fref%3Dsr_1_1_sspa%3Fcrid%3D121BTHSQVZ6SW%26keywords%3Dapple%2B14%2Bpro%26qid%3D1691244338%26sprefix%3Dapple%2B14%2Bpro%252Caps%252C444%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1']/span[@class='a-size-medium a-color-base a-text-normal']")).click();;
Set<String> strings=  driver.getWindowHandles();
 //System.out.println("parent window handle  "+strings);
 for(String string :strings) {
	 System.out.println("hi +" +string);
	 if(!string.equals(s)) {
			driver.switchTo().window(string);
			// WebDriverWait wait = new WebDriverWait(driver,15);
			
			boolean isColorEnabled = driver.findElement(By.xpath("//img[@alt='Silver']")).isEnabled();
			if(isColorEnabled) {
				driver.findElement(By.xpath("//img[@alt='Silver']")).click();
				boolean isSizeEnabled = driver.findElement(By.xpath("//p[text()='1 TB']")).isEnabled();
				if(isSizeEnabled) {
					driver.findElement(By.xpath("//p[text()='1 TB']")).click();
			
				}else {
					throw new Exception("Given size 1TB is not enabled to proceed");
				}
			}else {
				throw new Exception("Given color is not enabled to proceed");
			}
			driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).click();
			driver.findElement(By.xpath("//span[text()=' Choose phone to exchange ']/preceding-sibling::input")).click();
			Thread.sleep(2000);
			System.out.println("child window "+string);
		//	boolean isPopUpDisPlayed = driver.findElement(By.xpath("//div[@class='a-popover-wrapper']//select[@name='buyBackDropDown1']")).isDisplayed();
			boolean isPopUpDisPlayed =driver.findElement(By.xpath("//div[@class='a-popover-wrapper']")).isDisplayed();
			if(isPopUpDisPlayed) {
				WebElement brandDropDownElement = driver.findElement(By.xpath("//select[@name='buyBackDropDown1']"));
				brandDropDownElement.click();
				Select selectBrand = new Select(brandDropDownElement);
				selectBrand.selectByVisibleText("iQOO");
				WebElement modelDropDownElement = driver.findElement(By.xpath("//select[@name='buyBackDropDown2']"));
				modelDropDownElement.click();
				Select selectModel = new Select(modelDropDownElement);
				selectModel.selectByVisibleText("Z3");
				driver.findElement(By.xpath("//input[@id='physicalBody_noDamage']")).click();
				driver.findElement(By.xpath("//input[@id='buyBackIMEITextInput']")).sendKeys("863999053734215");
				driver.findElement(By.xpath("//input[@name='buyBackApplyButton']")).click();
			}
			
			else {
				System.out.println("pop up not identified");
			}
			
//			driver.findElement(By.xpath(" //span[@class='a-button a-button-thumbnail a-button-toggle a-button-unavailable']")).click();
			//WebElement z= driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']"));
//		z.click();
		System.out.println("child window "+string);
	 }
 }
 

}
}

