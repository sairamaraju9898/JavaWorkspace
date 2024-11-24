package com.rameshsoft.utilitiess;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.rameshsoft.Automation.Basetest.Basetest;

public interface screenshotutility {
public static String takesrenshot() throws IOException {
	TakesScreenshot ts=(TakesScreenshot)Basetest.getdriver(); //1st way to implemnt screnshot interface 
	//RemoteWebDriver ts1=new ChromeDriver(); //2nd way directly were calling
	 File file= ts.getScreenshotAs(OutputType.FILE);
	String imagepath= System.getProperty("user.dir")+"\\Screenshots\\"+Basetest.getcname()+ ".jpeg";
	FileUtils.copyFile(file,new File(imagepath));
	return imagepath;
}

public static String takesrenshot(String tcName) throws IOException { //method overloading with/without tcname parameterwe taken
	TakesScreenshot ts=(TakesScreenshot)Basetest.getdriver(); //1st way to implemnt screnshot interface 
	//RemoteWebDriver ts1=new ChromeDriver(); //2nd way directly were calling
	 File file= ts.getScreenshotAs(OutputType.FILE);
	String imagepath= System.getProperty("user.dir")+"\\Screenshots\\"+tcName+ ".jpeg";
	FileUtils.copyFile(file,new File(imagepath));
	return imagepath;
}
}
