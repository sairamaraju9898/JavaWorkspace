package appiumtests;




//
//
//public class CalculatorTest {
//
//	
//	static AndroidDriver<MobileElement> driver;
//	public static void main(String[] args)  {
//		// TODO Auto-generated method stub
//		try {
//			openCalculator();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			e.getCause();
//			e.getMessage();
//		}
//
//	}
//  public static void openCalculator() throws Exception {
//	  AndroidOptions  cap=new AndroidOptions ();
//	cap.setCapability("deviceName", "IQOO Z3");
//	cap.setCapability("udid", "1371539202000UP");
//	cap.setCapability("platformName", "Android");
//	cap.setCapability("platformVersion", "13");
//	cap.setCapability("appPackage", "com.vivo.calculator");
//	cap.setCapability("appActivity", "com.vivo.calculator.Calculator");
//	
//	URL url =new URL("http://127.0.0.1:4723/wd/hub");
//	driver =new AndroidDriver<MobileElement>(url,cap);
//	System.out.println("Application started");
//
//}
//}



import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CalculatorTest {

 //   static AndroidDriver<MobileElement> driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cause: " + e.getCause());
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void openCalculator() throws Exception {
        // Set up Appium options
//        AndroidOptions options = new AndroidOptions();
//        options.setCapability("deviceName", "IQOO Z3");
//        options.setCapability("udid", "1371539202000UP");
//        options.setCapability("platformName", "Android");
//        options.setCapability("platformVersion", "13");
//        options.setCapability("appPackage", "com.vivo.calculator");
//        options.setCapability("appActivity", "com.vivo.calculator.Calculator");
//        
//        // Initialize the driver with Appium server URL and options
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        driver = new AndroidDriver<MobileElement>(url, options);
//        System.out.println("Application started");

    }
}

