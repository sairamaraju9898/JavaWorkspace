package arrays;

import java.util.Arrays;

public class Sum {

	public Sum() {
		System.out.println("sum class constructor");
	}
	
	public void addString(String ...   strings ) {
	System.out.println("Given  values are "+ strings[0] + strings[1]+ strings[2]);
	
	System.out.println(Arrays.toString(strings));
	}
	
	public void add(int ...  k) {
		int res=0;
		
		for(int i=0;i<k.length;i++) {
			res=res+k[i];
		}
		System.out.println(res);
	}
	
	public void add(double ...  k) {
		double res=0;
		
		for(int i=0;i<k.length;i++) {
			res=res+k[i];
		}
		
		System.out.println(res);
	}
	
}
