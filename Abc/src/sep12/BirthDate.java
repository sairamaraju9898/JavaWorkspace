package sep12;

import java.util.Scanner;

public class BirthDate {

	
	int dt, mon,yr;
	
	
	public void setBirthDate() {
		System.out.println("enter date");
		Scanner scanner=new Scanner(System.in);
		dt=scanner.nextInt();
		System.out.println("enter mon");
		mon=scanner.nextInt();
		System.out.println("enter yr");
		yr=scanner.nextInt();
		
	}
	
	
	public void getBirthDate() {
		System.out.println("DOB :"+dt +"/"+mon +"/"+yr);
	}
}
