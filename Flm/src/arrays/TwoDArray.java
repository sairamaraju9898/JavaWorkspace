package arrays;

import java.util.Scanner;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class TwoDArray {

	public static void main(String[] args) {
		
		//in 2d array if u use lenth for the array it will give length of row 
		int p,k;
		
     Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter length of row");
		p=scanner.nextInt();
		
		System.out.println("enter length of column for each row");
		k=scanner.nextInt();
		
		
		int [][]  a=new int[p][k];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		
		
		
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 System.out.println("nter numbers");
				 
				 a[i][j]=scanner.nextInt();
			 }
		 }
		 System.out.println("please check ur numbers u have entered");
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++) {
				
				 System.out.print(a[i][j]+ "   ");
				
			 }
			 System.out.println();
		 }
	}

}
