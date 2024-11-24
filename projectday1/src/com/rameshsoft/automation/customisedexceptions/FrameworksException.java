package com.rameshsoft.automation.customisedexceptions;

public class FrameworksException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public FrameworksException() //default constructor
{
	super();     //this is a constructor call to call parent class constructor of type default
}
public FrameworksException(String Exceptionmsg) { //parameterised condstructor
	super(Exceptionmsg);    //this is a constructor call to call parent class constructor of type parameterised (string)
}
}
