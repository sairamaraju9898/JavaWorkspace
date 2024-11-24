 package sep23;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch2 {
// by using webdriver manager.exe file 
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		
	}
}
