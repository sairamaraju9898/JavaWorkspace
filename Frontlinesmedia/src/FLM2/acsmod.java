package FLM2;

import FLM.acessModifiers;
 

public class acsmod extends acessModifiers{
	
public static void main(String[] args) {
	acsmod v =new acsmod(); //obj for child class
	acessModifiers h=new acessModifiers();//obj for parent class
	v.print();
	System.out.println("???");
	System.out.println(h.i);
	int g=h.i;  
	v.print();
	v.peter();
}
public void peter() {

	acessModifiers h=new acessModifiers();
	acsmod v =new acsmod(); 
	System.out.println(i);
	System.out.println();
	System.out.println(h.i);//acessing through extends or without extends is accepted bcz i i public for remaijing modifiers not possible except we take extends for protected its executes
	print();
}
}
