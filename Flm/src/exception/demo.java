package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {

	
	public static void main(String[] args)  {
		
		
		
		try {
			new FileInputStream("H:\\JAVA Workspace\\Flm\\src\\exception\\vh.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no file exists check location again");
		}
		
		
		System.out.println("end");
	}
}
