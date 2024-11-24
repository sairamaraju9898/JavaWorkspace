package com.sbafs.cards.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.sbafs.cards.base.Basetest;

public interface Screenshotutility {
	public static String takescreenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)Basetest.getdriver(); //1st way to implemnt screnshot interface 
		//RemoteWebDriver ts1=new ChromeDriver(); //2nd way directly were calling
		 File file= ts.getScreenshotAs(OutputType.FILE);
		String imagepath= System.getProperty("user.dir")+"\\src\\test\\java\\Screenshots\\"+Basetest.getcname()+ ".jpeg";
		FileUtils.copyFile(file,new File(imagepath));
		return imagepath;
	}

	public static String takescreenshot(String tcName) throws IOException { //method overloading with/without tcname parameterwe taken
		TakesScreenshot ts=(TakesScreenshot)Basetest.getdriver(); //1st way to implemnt screnshot interface 
		//RemoteWebDriver ts1=new ChromeDriver(); //2nd way directly were calling
		 File file= ts.getScreenshotAs(OutputType.FILE);
		String imagepath= System.getProperty("user.dir")+"\\src\\test\\java\\Screenshots\\"+tcName+ ".jpeg";
		FileUtils.copyFile(file,new File(imagepath));
		return imagepath;
	}
}
