package jaaa;

import java.util.Scanner;

public class numcount {
public static void main(String[] args) {
	int a;
	int c=0;
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
  a=	sc.nextInt();
  
  while(a>0) {
	  a=a/10;
	  c++;
  }
  System.out.println("count is:"+ c);
}
}
