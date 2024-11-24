package jaaa;

public class Tester {
	public static void main(String[] args) { 
		Base obj = new Derived();
		obj.method(25);
		}
		}

		class Base{

		public void method(int a) { 
		System.out.println("Base Method");
		}
		}

		class Derived extends Base {

		public void method () { 
		System.out.println("Derived Method");
		}
		}
