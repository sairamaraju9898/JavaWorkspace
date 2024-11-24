package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {

	
	public static void main(String[] args) throws FileNotFoundException {
		int x=10;
		int y=0;
		
		
		//even if u dont use throws handling it wont execute further if theres an exception at particular point we should usw try catch to excecute
		//remaining code without disturbance. 
	
		try {
		new FileInputStream("H:\\JAVA Workspace\\Flm\\src\\exception\\vh.txt");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("please check path file isnot present");
		}
		
		System.out.println("end");
		
		
		
	}
}
