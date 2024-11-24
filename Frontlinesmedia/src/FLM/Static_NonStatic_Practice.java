package FLM;
class demo{
	int a=1;
   static int b=5;
	public int  method1() {
		System.out.println("hi");
		int sum=a+b;	
		return sum;
	}
}

public class Static_NonStatic_Practice {
static int num1=25;
static int num2=21;
  static public int addition() {
  int result=num1+num2;
  int x=num2;
 System.out.println("sdfsf "+  main1("nulllll"));
	System.out.println("addition "+ result);
	return result;
}
public static void main(String[] args) {
	 
// int v=demo.a;//we cant acess non static mem/metods through class name but only through obj.
		// int num2  =5;
		// System.out.println("wewec" +num2);
		  
		System.out.println(num2);
	 int l=demo.b;
	 demo obj=new demo();
	 int i=obj.b;
	 int k=obj.a;
	 System.out.println("sdcc " + k);
	 System.out.println("sdcc " + i);
	 int r=obj.method1();
	 System.out.println("r ="+ r);
	 addition();
	Static_NonStatic_Practice.addition();
	
	}
	static  String main1(String a) {
		 return a;
	 }
	
}

