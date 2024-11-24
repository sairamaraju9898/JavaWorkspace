package Arrays;

import java.util.Scanner;

 
  
public class sda_2 {
	
//avg of all values in array
	
	public static void main(String[] args) {
		int sum =0;
		
		 System.out.println("please nter how many values u want to enter ");
		 Scanner s=new Scanner(System.in);
			int m= s.nextInt();
		
			int[] a=new int[m];
			for(int i=0;i<m;i++) {
				System.out.println("nter values one by one");
				a[i]=s.nextInt();
			}
			for(int i=0;i<m;i++) {
				sum+=a[i];
			}
			int avg=sum/m;
			System.out.println("avg of all values = "+avg);
	}

}

//int[][] a= {{12},{2,3,5},{4,6}};//ignore this line