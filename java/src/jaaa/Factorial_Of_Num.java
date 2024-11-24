package jaaa;

import java.util.Scanner;

public class Factorial_Of_Num {

	public static void main(String[] args) {
	 System.out.println("Nter number");
	 Scanner s=new Scanner(System.in);
     int i=s.nextInt();
     int n=1;
     int m=1;
     while(n<i)
     {
    	 m=m*(n+1);
        n=n+1;
     }
     System.out.println("factorial is  " + m );
	}

}
