package com.rameshsoft.automation.listners;

import java.io.IOException;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.utilities.Screenshotutility;

 public class testcaseactivity implements IRetryAnalyzer{ //only for failed test cases i.e iretry we taken here but, itestlistner(wehavent taken bcz were taking befmeth,after methds which are annotations of testng) which  performs same task that was performed by the after method and before method 
	 int count=0;
	 int maxcount=0;

	@Override
	public boolean retry(ITestResult result) {
	 if (ITestResult.FAILURE==result.getStatus()&& count<=maxcount) { //here failure,success ,skipped has 1,2,3 values in the same way get staus have 3 value 1,2,3 but they will change basesd upon test case f/p/skip and it returns based upon p/f/skip
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
 






