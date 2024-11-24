package com.grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class hello1 {
	@Test(groups = { "st"})
	public void	job1() {
			System.out.println("job1");
		}
	@Test(groups = { "rt", "e2e"})
	public void hike1() {
		System.out.println("hike1");
}}