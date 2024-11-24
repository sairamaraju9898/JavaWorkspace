package inheritance;

 

public class inherit2 extends inherit1 {
	public int add(){
		int a=16;
		int c=a+i;
		System.out.println("add is "+c);
		return c;
	}
	public int div(){
		int a=8;
		int c=a+i;
		System.out.println("div is "+c);
		return c;
	}
	public void demo(){
		//super.mul();
	 mul();
	}
	public static void main(String[] args) {
		System.out.println(i);
		 
		mul();
	}
	 
}
