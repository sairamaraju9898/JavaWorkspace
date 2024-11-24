package com.rameshsoft.seleniumadv;

import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void job3(){
		System.out.println("job3");
	}
	@Test (groups= {"e2e" ,"si"})
	public void hike3(){
		System.out.println("hike3");
	}
}
