package FLM;

import java.util.Scanner;

public class Multiplication_Of_Req_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("Nter upto how many multiples u want");
		     int n=s.nextInt();
		  for(int i=1; ;i++) {
		     System.out.println("Please nter 1 to continue or other key to stop");
		      int o=s.nextInt();
		      if(o==1) {
		    	 System.out.println("please nter table which table u want");
				 int m=s.nextInt();
		     for(int j=1;j<=n;j++) {
		    	 System.out.println(m + "  X " + j + " = " + m*j);
		     }	
		     }
		      else 
			     break;
		     }
		     }
	}


