package jaaa;

import java.util.Scanner;

public class Sai1 {
public static void main(String[] args) {
	int a[]= {1,5,15,6,21,28};  
	int size=a.length;
	System.out.println(" total values in array variable a is "+ size);
	System.out.println("enter b value");
	Scanner sc=new Scanner(System.in);
int b=	sc.nextInt();
 System.out.println( "entered no is" + b);
 
for(int i=0; i<size; i++) {
if(b>0) {
System.out.println(b + " is positive num " );
	 
     if (a[i]>b) {
	    System.out.println(a[i] +" is greater than" + b);}


     else if(a[i]==b) { 
		System.out.println( a[i] + " is equal to " +b);}



     else {
		System.out.println( a[i] + " is less than " + b);}	
          
        } 
 else {
	 System.out.println(a[i] + " is greter than "  + b + " and " + b + " is -ve num"  );
      }
}
}
}