package Constructor_calls;
class Base {
	int a;
  Base(int x) {
		 a=x;
		 System.out.println("base class constructor");
		 
	}
void print() {
	System.out.println("base class print ,a = "+a);
}
}
class derived extends Base{
	int b;
	 derived(int x,int y) {
		super(x);
		 System.out.println("derived class constructor");
		 b=y;
	}
	 void print() {
		 System.out.println("derived class print(), b= "+b);
	 }
}
public class overriding {
public static void main(String[] args) {
	derived derived=new derived(70, 195);
	derived.print();
}
}
