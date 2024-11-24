package Practice;

public class Fizzbuzz {
public static void main(String[] args) {
	for(int i=1;i<=100;i++) {
		
		if(i%3==0 &&  i%5==0) {
			System.out.print(" FizzBuzz "+ " ");
			continue;
		}
		if(i%3==0) {
			
			System.out.print(" fizz" +" ");
			continue;
		}

		if(i%5==0) {
			System.out.print(" Buzz" +" ");
			continue;
		}
		
	
		System.out.print(i+" ");
	}
}
}
