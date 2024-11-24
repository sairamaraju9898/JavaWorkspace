package sept17th;

public class InheritDemo1 {

	
	public static void main(String[] args) {
		
		Add add=new Add() ;
		add.setX(9);
		add.setY(10);
		add.sum();
			
		
		Mul mul=new Mul();
		mul.setX(10);
		mul.setY(20);
		mul.mul();
		
		Sub sub=new Sub();
		sub.setX(30);
		sub.setY(20);
		sub.minus();
		
	}
}
