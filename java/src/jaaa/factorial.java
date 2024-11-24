package jaaa;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in );
	System.out.println("enter number");
	int i;
	int n;
 
	n=scanner.nextInt();
	i=n;
	long a=1;
	//for(int i=1; i<=n; i++) {
		//a=a*i;
		
	//for(int i=n; i>0;i--)	{
	//a=a*i;
	while(n>1) {
		a=a*n;
		n--;
	}
	System.out.println("factorial of "+ i +" is " +  a );
}
}
