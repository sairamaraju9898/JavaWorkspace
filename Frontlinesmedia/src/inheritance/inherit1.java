package inheritance;
public class inherit1 {
static	 public int i=2;
	int p=5;
	public int add(){
	//	i=1;
		int a=8;
		int c=a+i;
		System.out.println("add is "+c);
		return c;
	}
	public int sub() {
		int a=8;
		int c=a-i;
		System.out.println("sub is "+c);
		return c;	 
	}
static public int mul() {
	inherit1 inherit1 =new inherit1();
		int a=100; 
		int c=a*(inherit1.i);
		System.out.println("mul is c "+c);
		return c;	 
	}
}