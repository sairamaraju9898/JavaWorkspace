package sep18;

public class SuperDemo {

	
	public static void main(String[] args) {
		
		
		//case 1 creating object for parent using prnt ref
		One objOne=new One();
		objOne.setA(20);
		
		
		//case2  creating child class object with child class ref
		
		Two two=new Two();
		two.setA(10);
		two.showAll();
		
		//case3 
		
		One one=new Two();
		one.setA(20);
		one.greet();
		
		
	
	}
}
