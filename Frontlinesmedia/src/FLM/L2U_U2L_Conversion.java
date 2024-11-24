package FLM;

import java.util.Scanner;

public class L2U_U2L_Conversion {
public static void main(String[] args) {
	System.out.println("Nter alphabet");
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	int a=c;
	int b;
	char d;
//	char d=(char)b;
	if (a>=65 & a<=90) {
		b=a+32;
		 d=(char)b;
		System.out.println("opposite coversion of ur capital char to small :"+d);
	}
	else {
		b=a-32;
		 d=(char)b;
		System.out.println("opposite coversion of small to capital :"+ d);
	}
	
}
}
