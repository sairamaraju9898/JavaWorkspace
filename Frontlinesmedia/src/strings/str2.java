package strings;

public class str2 {
public static void main(String[] args) {
	String s1=" ram";//memory is stored in string pool so if same value exists both s1,3 points to same adress
	String s2=new String(" R am");//here if we store values by creating obj in strgs its stored in heap memory so in this diff obj will be craeted and there is no chance of assigning the same adress to 2 objects even if the two objects have same value 
	String s3=new String("ram");
	String s4="ram";
	String s5="123";
	int h=256;
	char[]  c=	  s1.toCharArray();
	System.out.println(c[1]);
	System.out.println(s2.length());
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
		}
}
}
