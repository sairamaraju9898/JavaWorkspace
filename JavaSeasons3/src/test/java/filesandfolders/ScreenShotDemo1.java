package filesandfolders;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		//here we need to create folder and in this folder we need to take screenshot and place the sc in that folder 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//step1 cretae folder
		
		File flSrc=	new File(System.getProperty("user.dir")+"\\screenshot");
		flSrc.mkdir();
		
		
		//s tep 2 taking screenshot
    File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    // putting in the location with 
    
    FileUtils.copyFile(file, new File(flSrc+"\\amazon.png"));	
    
    //in reatime the above method is not used because if u run the same code with same name of the  screenshot th old sreenshot will be replaced with 
    //new screenshot wiith same name amazon
    //to avoid this we  need to use date time stamp for this.
    
    
	}

}
