package com.grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class hello3 {
	@Test(groups = { "rt"})
	public void	job3() {
			System.out.println("job3");
		}
	@Test(groups = { "st", "e2e"})
	public void hike3() {
		System.out.println("hike3");
}
}