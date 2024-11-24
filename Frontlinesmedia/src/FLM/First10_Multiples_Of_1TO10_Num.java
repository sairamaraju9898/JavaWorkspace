package FLM;

import java.util.Scanner;

public class First10_Multiples_Of_1TO10_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(" please Enter  upto how many Tables u want ");
		 Scanner s=new Scanner(System.in);
	    // int n=s.nextInt();
		 System.out.println(" please Enter from  upto how many multiples u want ");
		 int m=s.nextInt();
		 System.out.println(" please Enter the count of tables u want ");
		 int num=s.nextInt();
		 int[] r= new int[num];
		 for(int p=0;p<r.length ;p++) {
			 System.out.println("continue press 1 or press any other key to stop");
			 int y= s.nextInt();
			  if (y==1) {
				 System.out.println("Please specify those tables u want");
				 r[p]=s.nextInt();
			 }
			  else 
				 break;
		// for(int i=1;i<=m;i++) {
		 
			 System.out.println("hi ");
			 for(int j=1;j<=m;j++) { // m means upto how many multiples u want 
 //System.out.println("Please specify those tables u want");//here this 25 & 26 lines must be not here bcz
// r[p]=s.nextInt();- continuation- if u write here r[0] values evrrytime and performs mul from 1 to 10 for diff values we specify
				 System.out.println(r[p] +" X " + j + " = " + r[p]*j); 
		 }
		 }
		 }
	     
	}


