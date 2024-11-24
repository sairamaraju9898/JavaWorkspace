package FLM;

import java.util.Scanner;

public class Div_by_5_7 {
	public static void main(String[] args) {
		System.out.println("Nter number");
		Scanner sc=new Scanner(System.in);
	int num=	sc.nextInt();
	if(num%5==0 & num%7==0) {
		System.out.println("given no is div by 5 and 7");
		
	}
	else {
		System.out.println(" num is not 5 or 7");
	}
	}

}
