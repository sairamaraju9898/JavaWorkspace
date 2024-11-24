package FLM;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Nter no");
		 Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int m=1;
	     for(int i=1;i<=10;i++) {
	    	 m=n*i;
	    	 System.out.println(n+" X "+ i +" = " + m );
	     }
	}

}
