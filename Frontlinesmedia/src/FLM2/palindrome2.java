package FLM2;

import java.util.Scanner;
//reverese of a num
public class palindrome2 {
	public static void main(String[] args) {
		 System.out.println("Nter no");
		 Scanner s=new Scanner(System.in);
	     long n=s.nextLong();
	     long m=0;
	     long k=0;
	     long temp=n;
	     for(int i=1;n!=0;i++) {
	    	 m=n%10;
	    	 if(i==1) {
	          k=k*10+m;
	          n=n/10;
	    	 }
	    	 else {
	    	 k=k*10+m;
	    	 n=n/10;
	    	 }
	         } 
	    
	     System.out.println("reverse of num =" +k);
	     if(temp==k)
	    	 System.out.println("the given no is palindrome num");
	     else 
	    	 System.out.println("the given no is not palindrome num");
	}
}
