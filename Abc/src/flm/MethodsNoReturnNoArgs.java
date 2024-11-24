package flm;

import java.util.Scanner;




public class MethodsNoReturnNoArgs {  //sum of n no's is the example
public static void main(String[] args) {
	MethodsNoReturnNoArgs.sumOfNaturalNumbers();
	System.out.println("Enter number");
	Scanner scanner =new Scanner(System.in);
	int n=scanner.nextInt();
	MethodsNoReturnNoArgs.withParameter(n);
	
	 //non static method object creation
	MethodsNoReturnNoArgs l=new MethodsNoReturnNoArgs();
	l.sumOfNaturalNumbers2();
	l.withParameter2(n);
	
	
}


public static  void sumOfNaturalNumbers() {
	System.out.println("Enter number");
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	n=(n*(n+1))/2;
	System.out.println(n);
	
}

public static void withParameter(int n) {
	n=(n*(n+1))/2;
	System.out.println(n);
}

public  void sumOfNaturalNumbers2() {
	System.out.println("Enter number");
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	n=(n*(n+1))/2;
	System.out.println(n);
}

public static void withParameter2(int n) {
	n=(n*(n+1))/2;
	System.out.println(n);
}
}
