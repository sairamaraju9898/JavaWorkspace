package inheritance;

 

public class inherit3 {
public static void main(String[] args) {
	inherit2 in=new inherit2();
	in.add();
	in.div();
	System.out.println();
	
	inherit1 inherit1 =new inherit2();
	inherit2 inherit2 =new inherit2();
	int g=inherit1.i;
	inherit2.add();
	int  c=inherit2.i;
	inherit2.sub();
	inherit2.mul();
	inherit1.mul();
}
}
