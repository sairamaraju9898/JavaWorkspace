package sept03;

import java.util.Scanner;

public class MethodDemo3 {
public static void main(String[] args) {
	MethodDemo3 methodDemo3=new MethodDemo3();
	
	int y=methodDemo3.mul();
	System.out.println(y);
	
	Calc calc=new Calc();
	System.out.println("enter number");
	Scanner scanner= new Scanner(System.in);
	int n=scanner.nextInt();
	int g=calc.rock(n);
	System.out.println("g is :"+g);
}


//method with return type and no paremeter
public int mul() {
	System.out.println("enter number");
	Scanner scanner= new Scanner(System.in);
	int n=scanner.nextInt();
	int z=n*n;
	return z;
}
}
