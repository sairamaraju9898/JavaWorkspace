package interfacee;

 

abstract interface interface1 { //abstract and public are only allowed and by default every interface will become interface
int i=53;//by default evrey variable inside interface will become public static final,even without specify

public abstract int add();
public abstract int add(int a ,int b,int c );
public abstract int sub();
public abstract int sub(int a);

static void print() {
	System.out.println("static method in interface1");//we know static methods can"t be override ,it will be method hiding 
}
default public void Scanner() {
	System.out.println("default method in interface1");//which can be override in sub or child classes 
}
public static void main(String[] args) {
	print();
	 System.out.println(i);
}
}
