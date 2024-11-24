package com.rameshsoft.businescripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Basetest;

public class Insttest extends Basetest{
	 @Test
		public void fbtest(){
			getdriver().get("https://www.rameshsoft.com");
			
		}
}
