package sep18;


public class InheritOverrideDemo {

	
	
	public static void main(String[] args) {
		
		//case 1
		P p=new P();
		p.greet("sai");
	
	
	
	//case 2
	
	C c=new C();
	c.greet("sai ");
 
	
	
	
	//case 3 creating parent calss object with child class refrence this is not possible 
	
//	C c2=new P();
	
	
	//case 4  creating child calss  object with parent class refrence  here method overriding takes place 
	// if webhave variable in both the claases if we try to call that variavle it prints from ref variable i.e A but method from B 
	//this is bcz method overriding
	
	P cp=new C();
	System.out.println(cp.x);
	cp.greet("sai");
	}
	
	//case4 if we try to override static method its method hiding the above object in above case will print P's method this is hiding
}
