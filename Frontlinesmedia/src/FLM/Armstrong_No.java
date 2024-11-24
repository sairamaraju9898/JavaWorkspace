package FLM;

import java.util.Scanner;

public class Armstrong_No {

	public static void main(String[] args) {
		 System.out.println("Nter no");
		 Scanner s=new Scanner(System.in);
	     long n=s.nextLong();
	     long m=0;
	     long v=0;
	     long temp=n;
	     while(n!=0) {
	    	 m=n%10;
	    	 v=v+m*m*m;
	    	 n=n/10;
	     }
	     System.out.println("The cubes of ur num is "+ v);
	     if(temp==v) 
	    	 System.out.println("The no is armstrong");
	     else 
			System.out.println("The no is not armstrong");
		
	}

}
