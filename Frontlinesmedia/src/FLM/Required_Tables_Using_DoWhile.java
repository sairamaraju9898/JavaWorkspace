package FLM;

import java.util.Scanner;

public class Required_Tables_Using_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int i,c;
		     do {
		    	 System.out.println("Nter which table u want");
		    	 Scanner s=new Scanner(System.in);
		    	  int n=s.nextInt();
		    	  System.out.println("Nter how many multiples u want");
		    	  int j=s.nextInt();
		    	  i=1;
		    	    do { 
		    	    System.out.println(n +" X " + i + " = " + n*i);	
		    	    i++;
		    	    }
		    	    while(i<=j);
		    	    System.out.println("want to continue 1/0");
		    	    c=s.nextInt();
		     }while(c==1);	    
		       
		    	    	
	}

}
