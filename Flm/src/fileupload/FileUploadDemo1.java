package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadDemo1 {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://imgur.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod 
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
	public void fileUploadTest() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='New post']")).click();
		driver.findElement(By.xpath("//label[@class='PopUpActions-filePicker']")).click();
		//here the above element is not interactable we use javascript
	//JavascriptExecutor jsExecutor=	(JavascriptExecutor)driver;
		//driver.findElement(By.xpath("//label[text()='Choose Photo/Video']/child::img")).click();
//type casting driver object to javascriptexecutor type
	//jsExecutor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//label[text()='Choose Photo/Video']/child::img")));
	
		
		Thread.sleep(3000);
		String filePath="C:\\Users\\Lenovo\\Pictures\\dog.jpg";
		
    StringSelection selection=new StringSelection(filePath);
    //package java.awt
		
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		Clipboard  clipboard=toolkit.getSystemClipboard();
		
		clipboard.setContents(selection, null);
		//upto here it stores the or copy the img / file to clipboard and then we need to paste this by using Robot clss
		
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
Thread.sleep(3000);
		
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(5000);
		}

}
