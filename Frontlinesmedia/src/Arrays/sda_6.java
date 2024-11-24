package Arrays;

import java.util.Scanner;

import interfacee.interface2;

//reverse the array and printing
public class sda_6 {
	public static void main(String[] args) {
	
			System.out.println("please enter count of string values u want to enter in 1st array");
			 Scanner s=new Scanner(System.in);
			int m=s.nextInt();
			String[] p=new String[m];
			for(int i=0;i<m;i++) {
				System.out.println("please enter string values one by one by pressing enter button");
				p[i]= s.next();
			}
			String k[]=new String[m];
		 int  l=0;
			for(int i=m-1;i>=0;i--) {
			k[l] = p[i];
			l++;
	 
			}
			System.out.print("reverse of an array  =");
			System.out.print("[ ");
			for(int j=0;j<m;j++) {
				System.out.print( k[j]+ " ");
			}
			System.out.print(" ]");
			for(int i=0;i<m;i++) {
			System.out.println("p before assigning to k " + p[i]);
			}
			for(int i=0;i<m;i++) {
				p[i]=k[i];
			}
			for(int i=0;i<m;i++) {
				System.out.println("p  after assigning to k " + p[i]);
				}
}
}