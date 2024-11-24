package Arrays;

import java.util.Scanner;
//find min length word and print it along with index number
public class sda_5 {
public static void main(String[] args) {
	int index=0;
	String longer=null;
		System.out.println("please enter count of string values u want to enter in 1st array");
		 Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		String[] p=new String[m];
		for(int i=0;i<m;i++) {
			System.out.println("please enter string values one by one by pressing enter button");
			p[i]= s.next();
		}
		
		for(int i=0;i<m;i++) {
		longer=p[0];
		if(longer.length()<p[i].length()) {
			longer	=p[i];
			index=i;
		}
		}
		System.out.println("The longest word = "+longer+ " & it's index = "+index);
}
}
