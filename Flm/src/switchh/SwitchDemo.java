package switchh;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		
	WebDriver driver;
	
	Scanner scanner=new Scanner(System.in);	
	
	System.out.println("enter which browser you want to launch");
    String browser=  scanner.next();
    
    switch (browser) {
	case "chrome": 	driver=new ChromeDriver();
		
		break;
		
	case "msd": driver=new EdgeDriver();
	driver.manage().window().maximize();
	break;

	default: System.out.println("entred value is not matched wth existing options");
		break;
	}
    
	}

}
