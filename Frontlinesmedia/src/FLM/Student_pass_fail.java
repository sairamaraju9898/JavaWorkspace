package FLM;

import java.util.Scanner;

public class Student_pass_fail {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter student number");
int stuno=	sc.nextInt();
System.out.println("enter student name");
String stuname=sc.next();
System.out.println("enter student marks of 3 subjects s1,s2,s3");
 int s1=sc.nextInt();
 int s2=sc.nextInt();
 int s3=sc.nextInt();
 double totalmarks=s1+s2+s3;
 double avg=(s1+s2+s3)/3;
 if (s1>=35 & s2>=35 & s3>=35)
{
   if (avg>=95)
	 System.out.println("The grade of the student is O" );
   else if(avg>=85 && avg<=94)
	 System.out.println("The grade of the student is a+ " );
   else if (avg>=75 && avg<=84)
	 System.out.println("The grade of the student is a " );
   else if (avg>=65 && avg<=74)
	 System.out.println("The grade of the student is b+ " );
   else if (avg>=55 && avg<=64)
     System.out.println("The grade of the student is b " );
   else if (avg>=40 && avg<=54)
 	 System.out.println("The grade of the student is c " );
   else 
	 System.out.println("The grade is d");
}
 else 
System.out.println("The student is failed");	 
}
}
