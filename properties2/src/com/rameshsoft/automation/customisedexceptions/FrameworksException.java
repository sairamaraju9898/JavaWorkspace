package com.rameshsoft.automation.customisedexceptions;

public class FrameworksException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public FrameworksException()
{
	super();     //this is a constructor call to call parent class constructor of type default
}
public FrameworksException(String Exceptionmsg) {
	super(Exceptionmsg);    //this is a constructor call to call parent class constructor of type parameterised (string)
}
}
