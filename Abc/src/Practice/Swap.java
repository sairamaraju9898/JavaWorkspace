package Practice;

public class Swap {
public static void main(String[] args) {
	int a=5;
	int b=6;
	System.out.println(" bef swap A is : "+a +" bef swap B is : "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(" After swap A is : "+a +" after swap B is : "+b);
}
}
