package FLM;

import java.util.Scanner;

public class Positive_Negative_Num {

	public static void main(String[] args) {
	System.out.println("enter character");
	Scanner sc=new Scanner(System.in);
	char c= sc.next().charAt(0);
	char ch = 'R';
 int a=c;
 int b=ch;
 System.out.println("ascii value of " + c + " is " + a);
 System.out.println("ascii value of " + ch + " is " + b);
 //if(a==b){
	if(c=='R') {
		System.out.println("its R ");
		
	}
	
	
	else {
		System.out.println("not r");
	}
	}

}
