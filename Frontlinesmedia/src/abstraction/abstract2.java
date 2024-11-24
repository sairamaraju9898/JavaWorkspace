package abstraction;

public abstract class abstract2 extends abstract1 {
	//  int i=50;
	public int sub() {
		int a=8;
		int c=a-i;
		System.out.println("sub is "+c);
		super.add();
		return c;	 
	}
	
	public int add(){
	  
		int a=20;
		int c=a+i;
		System.out.println("add is "+c);
		return c;
		}
	public void demo(){
		System.out.println("demoo ");
	}
	public static void main(String[] args) {
	//	System.out.println(i);
		 
	}
	}

 