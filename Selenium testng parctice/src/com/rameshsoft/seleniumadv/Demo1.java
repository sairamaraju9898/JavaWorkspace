package com.rameshsoft.seleniumadv;

import org.testng.annotations.Test;

public class Demo1 {
 // ** important here we can take @test annotation at class/method level here were tasking in method level
	
	@Test (groups= {"e2e"})
	public void job1(){
		System.out.println("job1");
	}
	@Test (groups= {"e2e" ,"si"})
	public void hike1(){
		System.out.println("hike1");
	}
}
