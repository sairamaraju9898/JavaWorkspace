package com.groups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class hello11 {

	@Test(groups = { "rt"})
	public void	job11() {
			System.out.println("job11");
		}
	@Test(groups = { "rt", "e2e"})
	public void hike11() {
		System.out.println("hike11");
}}


