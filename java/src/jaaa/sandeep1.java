package jaaa;

public class sandeep1 {
	public static void main(String[] args) {
		
	
	String value1 = "Hello";

	String value2 = new String("Hello");
	System.out.print(value1 == value2);

	System.out.print(" ");

	String value3 = value2.intern(); 
			System.out.println(value1 == value3);
}
}