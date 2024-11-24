package com.rameshsoft.automation.appln.bussinessscripts;

import org.testng.Assert;

public class AssertionsDemo {
	/*public static void main(String[] args) { //verify validations here once condition fails remaining stmts executes with no problem
		int num1=25,num2=65;
		if(num1==num2) {
			System.out.println("if");
		}
		else {
			System.out.println("else");
		}
		System.out.println("ns");
	}

} */
public static void main(String[] args) { //hard assertions here once if the condition fails remaining are  not going to be executed
	int num1=25,num2=65;
	 System.out.println("1");
	 Assert.assertEquals(num1, num2);
	 System.out.println("2");
	 System.out.println("3");
	 System.out.println("4"); }}