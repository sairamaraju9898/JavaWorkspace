package Practice;

public class Palindrome {
public static void main(String[] args) {
	int n=365;
	int temp=0; //5,
	int d=0;
	while(n>0) {
		
		temp=n%10;
        d=d*10+temp;
        n=n/10;
		
	}
	System.out.println(d);
}
}