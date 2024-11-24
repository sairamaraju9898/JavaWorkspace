package jaaa;

import java.util.Scanner;

public class Prime_Or_Not {

	public static void main(String[] args) {
		System.out.println(" please Nter +ve number");
		Scanner sc=new Scanner(System.in);
		int  a=sc.nextInt();
		int s=0;
for(int i=2;i<a;i++)	
{
if(a%2==0)	 
 s++;
}
if(s==0)
	System.out.println("The given no is prime number");
else 
	System.out.println("The given no is not prime");
}
}
	
