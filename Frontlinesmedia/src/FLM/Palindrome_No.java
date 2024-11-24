package FLM;

import java.util.Scanner;

public class Palindrome_No {
public static void main(String[] args) {
	 System.out.println("Nter no");
	 Scanner s=new Scanner(System.in);
     long n=s.nextLong();
     long m=0;
     long v=0;
     long temp=n;
   //  while(n!=0) {
     for(int i=1;n!=0;i++) {
       m=n%10; 
       v=(v*10)+m;
       n/=10; //  (n=n/10)
     }
     System.out.println("Reverse of UR NUM is  =" +v);
     if(temp==v)
    	 System.out.println("The number is palindrome");
     else {
		System.out.println("The num is not palindrome");
	}
}
}
