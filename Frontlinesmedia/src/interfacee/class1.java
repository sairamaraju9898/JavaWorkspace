package interfacee;


public abstract class class1 implements interface1{

	 
	public int add() {
		// TODO Auto-generated method stub
System.out.println("class 1 add with 0 parameter");
System.out.println( );//interface variable even class can acess interface members here if class implements interface
		return 0;
	}
	public abstract int sub(int a, int b);
    public abstract  int div() ;
	public int sub() {
		// TODO Auto-generated method stub
		System.out.println("class 1 sub with 0 parameter");

		return 0;
	}

	 
	public int sub(int a) {
		// TODO Auto-generated method stub
		System.out.println("class 1 sub with 1 parameter");

		return 0;
	}
	public static  int demo() {
		
		return 0;
	}
	@Override
	   public void Scanner() {//remember when overr scope must be increased highest one is public next protected ,default,privt
		System.out.println("default method in interface1");//default method overrided from inheritance1 
}
public static void main(String[] args) {
	// System.out.println(i);
	 System.out.println(interface2.i); 
	
}
}
