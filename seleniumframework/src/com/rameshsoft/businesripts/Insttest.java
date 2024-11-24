package com.rameshsoft.businesripts;

import org.testng.annotations.Test;

import com.rameshsoft.Automation.Basetest.Basetest;

public class Insttest extends Basetest{
	 @Test
		public void insttest(){
			getdriver().get("https://www.rameshsoft.com");
			
		}
	
}
