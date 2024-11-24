package collections;

import java.util.*;

public class list1 {
	int m=20;
	
public static void main(String[] args) {

  list1 l=new list1();
	List<Double>  list=new ArrayList();
	Collection  c =new ArrayList();
	
	list.add(1.32);
	list.add(11.0);
	list.add(11100.0);
	System.out.println(list.get(0)+list.get(1)+list.get(2));//addition of above values
//	System.out.println(list);
	List<String>  list2=new ArrayList();
	list2.add("1");
	list2.add("2");
	list2.add("3");
	//System.out.println(list2);
	List  list3=new ArrayList<>();
	list3.add("11");
	list3.add("22");
	list3.add("33");
	list3.add(list);
	list3.addAll(list2);
	//System.out.println(list3);
	//System.out.println(list3.get(0));
}
}
