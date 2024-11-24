package com.rameshsoft.automation.utilities;

public interface Driverpaths {
	String edgekey="webdriver.edge.driver";
	String edgevalue="location of edge driver browser .exe";
	String iekey="webdriver.ie.driver";
	String ievalue="location of ie driver browser .exe";
	String firefoxkey="webdriver.gecko.driver";
	String firefoxvalue="location of firefox driver browser .exe";
	String chromekey="webdriver.chrome.driver";
	String chromevalue=System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe";
}
