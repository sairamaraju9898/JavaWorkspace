package First;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class flpkrt  {
		 public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\Selenium d begin\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://www.flipkart.com");
				Thread.sleep(5000);
				try {
					WebElement e=	driver.findElement(By.xpath("//div[@tabindex='-1']/div/button"));
					 e.click();
				}
				catch (Exception e) {
					System.out.println("e is not identified");
				}
				try {
					WebElement e1= driver.findElement(By.xpath("//div[@tabindex='-1']/div/*[@role='button']"));
					 e1.click();
				}
				catch (Exception e) {
					System.out.println("e1 is not identified");
				}
				try {
					WebElement e2= driver.findElement(By.xpath("//div[@tabindex='-1']/div/span"));
					 e2.click();
				}
				catch (Exception e) {
					System.out.println("e1 is not identified");
				}
			 Thread.sleep(3000);
			 driver.findElement(By.xpath(" //input[@title='Search for products, brands and more']")).sendKeys("samsung mobiles");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[@type='submit']")).click();;
			 Thread.sleep(5000);
//			 List<WebElement> mobiles=  driver.findElements(By.xpath("//*[starts-with(text(),'SAMSUNG')]"));
//			 Set<WebElement> setmobs=new HashSet<WebElement>(mobiles);
//			 
//			 List<WebElement> mobilesprcs=driver.findElements(By.xpath("//*[starts-with(text(),'SAMSUNG')]/following::div[contains(text(),'₹')][1]"));
//			 for(WebElement mobile:setmobs) {
//				 String modelname=mobile.getText();
//		    	 System.out.println(modelname);
//		     }
			 WebElement element1= driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']/div"));
			 Actions actions=new Actions(driver);
			 actions.clickAndHold(element1).perform();
			 actions.moveByOffset(50, 0).perform();
			WebElement element2=driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/div"));
			actions.clickAndHold(element2).perform();
			 actions.moveByOffset(-100, 0).perform();
			 Thread.sleep(5000);
			driver.close();
			
			 } 
	
	}
