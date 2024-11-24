package FLM;
public class Static_NonStatic_Constructor {
static int i=0;// This is non static memory will be allocated only once at time of execution so op is 1 2 3 
// int i=0; // This is non static so everytime some memory allocates for object creation and and different  memory for every individual object creation and belongs to individuals so op will be 1 1 1 
Static_NonStatic_Constructor(){
	i=i+1;
	System.out.println(i);
}
	public static void main(String[] args) {
		Static_NonStatic_Constructor p=new Static_NonStatic_Constructor();
		Static_NonStatic_Constructor v=new Static_NonStatic_Constructor();
		Static_NonStatic_Constructor r=new Static_NonStatic_Constructor();
	
}
}
