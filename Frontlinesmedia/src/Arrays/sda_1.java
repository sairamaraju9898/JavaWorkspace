package Arrays;

import java.util.Scanner;

public class sda_1 {
	
	//sum of integers in an array
		
		public static void main(String[] args) {
			int sum=0;
			System.out.println("please enter count of values u want to enter");
		 Scanner s=new Scanner(System.in);
		int m= s.nextInt();
	    int[] a=new int[m];
	    for (int i=0;i<m;i++) { //for taking input from user
	    	System.out.println("please enter ur value and press enter ");
	        a[i]=s.nextInt();
	    }
	    System.out.print("[ ");
	    for (int i=0;i<m;i++) {
	    	System.out.print(  a[i]+" ");
	    }
	    System.out.print(" ]");
	
	 for(int j=0;j<m;j++) { //for o/p of adding all input val
		 sum=sum+a[j];
	 }
	 System.out.println();
	System.out.println("The sum of all values in your array is =" + sum);
}
}