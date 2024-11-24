package com.rameshsoft.businescripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Basetest;

public class Fptest extends Basetest{
	 @Test
		public void fbtest(){
			getdriver().get("https://www.flipkart.com");
			
		}
}
