package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rameshsoft.automation.base.basetest;

 

public interface Screenshotutility {

public static String  takessreenshot() throws IOException {
	 
TakesScreenshot tScreenshot=(TakesScreenshot) basetest.getDriver();
File  file=tScreenshot.getScreenshotAs(OutputType.FILE);
String imagepath =System.getProperty("user.dir")+"\\screeenshots\\"+basetest.gettcname()+".jpeg";
FileUtils.copyFile(file, new File(imagepath));
		return imagepath;
	
}
public static String  takessreenshot(String tcname) throws IOException {
	 
TakesScreenshot tScreenshot=(TakesScreenshot) basetest.getDriver();
File  file=tScreenshot.getScreenshotAs(OutputType.FILE);
String imagepath =System.getProperty("user.dir")+"\\screeenshots\\"+tcname+".jpeg";
FileUtils.copyFile(file, new File(imagepath));
		return imagepath;
}}
