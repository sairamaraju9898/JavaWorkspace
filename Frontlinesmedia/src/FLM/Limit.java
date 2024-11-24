package FLM;

import java.io.DataInputStream;
import java.io.IOException;

public class Limit {
	public static void main(String[] args) throws IOException {
		System.out.println("Nter the number");
		DataInputStream dt=new DataInputStream(System.in);
	String s=	dt.readLine();
int i=	Integer.parseInt(s);
if (100<i & i<200) {
	System.out.println("The no is in between 100 and 200");
}
else {
		System.out.println("the no is not between 100 and 200");
	}		
	
}
	
	}


