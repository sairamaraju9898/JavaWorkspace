package FLM;

public class Fibancci {
public static void main(String[] args) {
	int i=0;
	System.out.println(i);
	int b=1;
	System.out.println(b);
	int sum;
	for(int n=1; n<5;n++) {
		sum=i+b;
		i=b;
		b=sum;
		System.out.println(sum);}}}
