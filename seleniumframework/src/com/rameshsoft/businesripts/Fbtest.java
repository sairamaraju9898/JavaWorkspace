package com.rameshsoft.businesripts;

import org.testng.annotations.Test;

import com.rameshsoft.Automation.Basetest.Basetest;

public class Fbtest extends Basetest {
	 @Test
		public void fbtest(){
			getdriver().get("https://www.facebook.com");
			
		}
}
