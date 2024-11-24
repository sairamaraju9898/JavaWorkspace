package jaaa;

import java.util.Scanner;

public class Reverse_Of_Num {

	public static void main(String[] args) {
     System.out.println("Nter no");
	 Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int m=0;
     int v =0;
     
     while(n!=0) {
   // if(n>0) {
        m=n%10;
      v=(v*10)+m;
        n=n/10;
      } 	
     //}
     
   System.out.println(v);
	}

}
