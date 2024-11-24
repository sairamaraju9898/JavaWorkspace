package com.rameshsoft.businescripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Basetest;

public class Fbtest extends Basetest{
	 @Test
		public void fbtest(){
			getdriver().get("https://www.facebook.com");
			
		}
}
