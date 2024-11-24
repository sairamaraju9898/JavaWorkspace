package com.testng.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
@Test (dataProvider ="loginnnn")
public void dataprvdr(String un, String pwd) {
	System.out.println(un + "  ***  "+pwd);
	
}
@DataProvider
public Object[][] loginnn(){
	Object[][] obj= new Object[2][2];
	obj[0][0]="java";
	obj[0][1]="selenium";
	obj[1][0]="python";
	obj[1][1]="selenium";
	
	return obj;
}
}
