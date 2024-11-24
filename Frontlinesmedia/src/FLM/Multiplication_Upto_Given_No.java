package FLM;

import java.util.Scanner;

public class Multiplication_Upto_Given_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Nter no");
		 Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int m;
	     for(int i=1;i<=n;i++) {
	    	 m=n*i;
	    	 System.out.println(n+" X "+ i +" = " + m );	 
	     }
	}

}
