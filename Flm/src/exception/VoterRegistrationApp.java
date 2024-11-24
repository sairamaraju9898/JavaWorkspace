package exception;

import java.util.Scanner;

public class VoterRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to voting Registration website ..");
		System.out.println("Enter below details ");
		System.out.println("Enter your age  : ");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		
		if(age>=18) {
			
			System.out.println("proceex with regtration");
			
		}
		
		else {
			try {
				throw new InvalidAgeException();
			}
			
			catch (InvalidAgeException e) {
			 	e.printStackTrace();
		
				System.out.println(e.getMessage());
				
			}
			
		}
		
		System.out.println("enddddd");
	}
}
