package sep18;

public class Two extends One {

	int a;
	
	public void putA(int a) {
		this.a=a;
	}
	
	
	public void showAll() {
    System.out.println(" a is : " +a);
    System.out.println(" to give prioty to parent claass methods or varaibles use super as like this "+ super.a);

	}
	
	public void greet() {
		System.out.println("  two   ");
	}
}
