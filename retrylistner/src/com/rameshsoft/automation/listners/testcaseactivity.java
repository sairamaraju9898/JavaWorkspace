package com.rameshsoft.automation.listners;

import java.io.IOException;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.utilities.Screenshotutility;

 public class testcaseactivity implements IRetryAnalyzer{
	 int count=0;
	 int maxcount=0;

	@Override
	public boolean retry(ITestResult result) {
	 if (ITestResult.FAILURE==result.getStatus()&& count<=maxcount) {
		 try {
			Thread.sleep(3000);
			System.out.println("count is :" +  count  + "testcasename;" + result.getName());
			count++;
			return true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
		return false;
	}}
 






