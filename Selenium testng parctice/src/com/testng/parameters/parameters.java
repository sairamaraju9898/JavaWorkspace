package com.testng.parameters;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class parameters {
	@Parameters({"result"})
@Test
public void login( String value) {
	System.out.println("login()" + value);
}
}