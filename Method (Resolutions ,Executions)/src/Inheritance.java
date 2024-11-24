  class demo1{
 static  int i=25;
  int j=35;
public void demotest() {
	System.out.println("demotest"); }
	public static void demotest2() {
		System.out.println("demotest2"); 	}	}
  class demo2 extends demo1{   
	  int k=56;
	  int i=789;
	  public static void demotest2() {
			System.out.println("demotest22222222"); 	}
	  public void demotest() {
			System.out.println("demotest11111");}
  }
public class Inheritance {
	public static void main(String[] args) {
demo1 d=new demo2();
d.demotest2();
d.demotest();
demo2.demotest2();
//System.out.println(demo2.i);
System.out.println(d.i);
}
}
