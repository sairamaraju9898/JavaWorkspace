package arrays;

import java.util.Scanner;

import com.google.common.annotations.J2ktIncompatible;

public class OnedArray {

	
	public static void main(String[] args) {
		
		//in this program were just reading input array values from customer by using for loop and printing them by using for loop
		//here length of the arrasy aslo the customers choice
		
		int i;
		
		Scanner scanner =new Scanner(System.in);
		
		//int [] a= {1,23,45,44};
		
		
		System.out.println("enter how many numbers you want tostore or length");
	    i=	scanner.nextInt();
	    int[] a=new int[i];
	    
	    System.out.println(a);
	    
	    for(int k=0; k<a.length;k++) {
	    	System.out.println("please enter number");
	    	a[k]=	scanner.nextInt();
	    	
	    }
	    
	    for(int j=0;j<a.length;j++) {
	    	System.out.println(a[j]);
	    }
	    
	    
	}
}
