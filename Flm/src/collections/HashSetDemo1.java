package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
public static void main(String[] args) {
	Set s=new HashSet();
	
	System.out.println(s.size());
	
	s.add(23);
	
	s.add(25);
	
	s.add(27);
	
	s.add("sai");
	
	System.out.println(s.size());
	
	System.out.println(s.add(27));
	
	for(Object temp: s) {
		//there is no indexing concept i.e get method as like in set to reteive the values so were using for each loo[p to iterate and print values 
		System.out.println(temp);
	}
	
s.add(23);
	
	s.add(25);
	
	s.add(27);
	
	//if we try to add duplicate nothing will happen no error but it doenyt add and returns boolean false  
	System.out.println(s.add("sai"));
	
	
	System.out.println(s.size());
	
	
	
	
}
}
