package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.utilities.Screenshotutility;

public class Testcaseactivity implements ITestListener{

	@Override
	public void onFinish(ITestContext arg) {
		System.out.println("Suite execution is finished");
	}
	@Override
	public void onStart(ITestContext arg) {
		System.out.println("Suite execution is started");
}
	@Override
	public void onTestFailure(ITestResult arg) {
		System.out.println("Test case is failed "+arg.getName());
		try {
			Screenshotutility.takesrenshot(arg.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	@Override
	public void onTestSkipped(ITestResult arg) {
		System.out.println("Test case is skipped "+arg.getName());
		try {
			Screenshotutility.takesrenshot(arg.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestStart(ITestResult arg) {
		System.out.println("Test case is started "+arg.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult arg) {
		System.out.println("Test case is passed "+arg.getName());
	}



}
	
