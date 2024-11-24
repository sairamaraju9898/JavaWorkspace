package strings;

import java.util.Arrays;

import interfacee.interface2;

public class str1 {
public static void main(String[] args) {//basically in stribgs == compare  two objects adress in order to check the values we have t2 use the method from string i.e :equals or equalsignorecase
	String s1=" ram";//memory is stored in string pool so if same value exists both s1,3 points to same adress
	String s2=new String("R am");//here if we store values by creating obj in strgs its stored in heap memory so in this diff obj will be craeted and there is no chance of assigning the same adress to 2 objects even if the two objects have same value 
	String s3=new String("ram");
	String s4="ram";
	String s5="123";
	int h=2569559;
	System.out.println(s1==s4);
	System.out.println(s2==s3);
	System.out.println(s1.equals(s4));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s3);
	System.out.println(s4);
 
	
	float  k=Float.valueOf(s5); //value of method 
 System.out.println(k);
 System.out.println(h+k);
 System.out.println(h+" " +s5);
 String d=String.valueOf(h);//value of method from string class 
 System.out.println(d);
System.out.println(Arrays.toString(d.split("5")));

}
}
