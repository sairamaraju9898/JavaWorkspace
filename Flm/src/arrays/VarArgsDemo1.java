package arrays;

public class VarArgsDemo1 {

	
	public static void main(String[] args) {
		
		
		Sum sum=new Sum();
		
		sum.addString("sai","rama","raju");
		
		sum.add(10,20,30,40,50);
		
		sum.add(10.25,56.33,84.99);
	}
}
