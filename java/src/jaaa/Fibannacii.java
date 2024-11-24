package jaaa;

public class Fibannacii {
public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b); 
	for(int i=0;i<=5;i++) {
		int sum=a+b;
		a=b;
		b=sum;
    System.out.println(sum);		
	}
}
}
