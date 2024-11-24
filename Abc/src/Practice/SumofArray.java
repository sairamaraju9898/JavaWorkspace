package Practice;

import java.util.Scanner;

public class SumofArray {
	int  u=0;
	public void name() {
		int[] arr= {0,1,2,3,4,5,6}; 
		
		sumofanArray(arr);
		
	}
	public void sumofanArray(int[] arr)
{
	for(int d:arr) {
		u=u+d;
	}
}
		public static void main(String[] args) {

SumofArray l=new SumofArray();
l.name();
			System.out.println(l.u);	
	}

	
}

