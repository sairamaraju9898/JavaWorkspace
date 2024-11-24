package interfacee;

public interface interface3 extends  interface2 {
	  abstract int div();
	  public static void main(String[] args) {
		System.out.println(i);//here its not possible bcz ambigoius problem it means interface3 extends interfaces1,2 and both are having i so here we get ambgs error so we have to acess with specific interface name(1/2) 
		System.out.println(interface2.i );
		System.out.println(interface1.i );
	  }
}
