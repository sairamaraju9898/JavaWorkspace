package Practice;

public class Factorial {
	public static void main(String[] args) {
		int n=4;
		int mul=1;
		int i=1;
		
		while((i+1)<=n) {
			mul=mul*(i+1);
			i++;
		}
		System.out.println(mul);
		
	}
}
