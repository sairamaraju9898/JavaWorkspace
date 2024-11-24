package Encapsulation;

public class encapsulation2 extends encapsulation1 {
	@Override
	public void encap() {
		System.out.println("not an encapsulation "  );
	}
	 
public static void main(String[] args) {
	encapsulation2 e=new encapsulation2();
   e.setI(25);
   e.setK(65);
   e.setG(95);
   System.out.println(e.getI());
   System.out.println(e.getK());
   System.out.println(e.getG()); 
}
}
