package exception;

import java.util.Scanner;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class Quotient {

	
	public static void main(String[] args) {
		
		System.out.println("Enter dividend");
		Scanner sc=new Scanner(System.in);
	    int dividend=	sc.nextInt();
	    
	    
	    System.out.println("Enter divisor");
	   int divisor= sc.nextInt();
	   
	   try {
		   int z=dividend/divisor;  
		   System.out.println("Quotient is "+z);
	   }
	
	   
	   //catch block executes only when there is exception in try block if not it wont execute 
	   // in general we ude exception cooncept to not to stop flow of code if there is  failure in code or error it wont exceute further 
	   //so in order to exceure  reaming code as usual we use this exceptions
	   //if we dont have try catch if we give divisor as 0 e get exception/error so here it wont go futher it means syso("end of program") control wont go there and terminated at error point .
	   catch (Exception e) {
		   
		   
		   System.out.println(e.getMessage());
		   e.printStackTrace();
		System.out.println("please eneter non zero Value forValue divisor and try again");
		
	}
	   
	   
	   System.out.println("end of program");
	}
}
