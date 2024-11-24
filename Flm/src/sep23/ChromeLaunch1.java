package sep23;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch1 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\JAVA Workspace\\jars\\chromedriver-win64\\chromedriver.exe");
		new ChromeDriver();
	}
}
