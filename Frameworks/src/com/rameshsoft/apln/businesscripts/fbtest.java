package com.rameshsoft.apln.businesscripts;

import org.testng.annotations.Test;

import com.rameshsoft.Automation.base.BaseTest;

public class fbtest extends BaseTest {
     @Test
	public void login(){
		getdriver().get("https://www.facebook.com");
		
	}
}
