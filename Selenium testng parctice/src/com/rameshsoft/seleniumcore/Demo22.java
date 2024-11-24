package com.rameshsoft.seleniumcore;

import org.testng.annotations.Test;

public class Demo22 {
	@Test
	public void job22(){
		System.out.println("job22");
	}
	@Test (groups= {"e2e" ,"si"})
	public void hike22(){
		System.out.println("hike22");
	}
}
