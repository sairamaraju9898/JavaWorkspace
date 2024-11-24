package jaaa;

import java.util.Scanner;

public class Sum_Num {
public static void main(String[] args) {
	System.out.println("enter number");
	int sum=0;
	Scanner sc = new Scanner(System.in);
int b=	sc.nextInt();
for(int i=1;i<=b;i++) {
	sum=sum+i;
	
}
System.out.println("sum of num is " +sum);
}
}
