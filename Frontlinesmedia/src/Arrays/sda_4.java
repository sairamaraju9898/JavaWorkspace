package Arrays;

import java.util.Scanner;

public class sda_4 {
//find max num from array and print it along with index
	public static void main(String[] args) {
		int large=0,j=0;
		 System.out.println("please nter how many values u want to enter ");
		 Scanner s=new Scanner(System.in);
			int m= s.nextInt();
			int[] a=new int[m];
			for(int i=0;i<m;i++) {
				System.out.println("nter values one by one");
				a[i]=s.nextInt();	}
				for(int i=1;i<m;i++) {	
				 large=	a[0];
				 j=0;
					if(large<a[i]) {
					large=	a[i];
					j=i;
					}
				}
	System.out.println("The largest number in array = "+large +" and its index = "+ j);
	}
}
