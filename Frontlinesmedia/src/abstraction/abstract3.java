package abstraction;

import inheritance.inherit1;
 

public class abstract3 extends abstract2 {
// static int i=1000;
	public int mul() {
		inherit1 inherit1 =new inherit1();
			int a=100; 
			int c=a*(inherit1.i);
			System.out.println("mul is "+c);
			return c;	 
}
	public int add(){
	 
		int a=30;
		int c=a+i;
		System.out.println("add is "+c);
		return c;
		}
}
