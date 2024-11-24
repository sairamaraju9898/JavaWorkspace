package FLM;

import java.util.Scanner;

public class Loop_Factorial_Num {
public static void main(String[] args) {
	System.out.println("Nter num to get factorial");
	Scanner sc=new Scanner(System.in);
int n=	sc.nextInt();
int i = n;
while(n>1)
{
i=i*(n-1);
n--;
}
System.out.println("factorial is " + i );
}
	
}
