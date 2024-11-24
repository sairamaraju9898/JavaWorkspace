package com.ram.nwrn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ram.automation.appln.basetest;
 

public interface ramn {
	public static String takescreenshot() throws IOException   {
TakesScreenshot tScreenshot=(TakesScreenshot) basetest.getDriver();
File  file=tScreenshot.getScreenshotAs(OutputType.FILE);
String imagepath =System.getProperty("user.dir")+"\\screeenshotsfolder\\"+basetest.gettcname()+".jpeg";
FileUtils.copyFile(file, new File(imagepath));
return imagepath;
	}
}
