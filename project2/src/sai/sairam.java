package sai;

import java.awt.JobAttributes;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sairam { 
	 @BeforeSuite
	public void job() {
		 System.out.println("bs");
		
	}
@Test
public void hike() {
	System.out.println("test");
}
@AfterSuite
public void java() {
	System.out.println("as");
}
}
