package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.compress.utils.Iterators;



public class HashsetDemo3 {

	
	public static void main(String[] args) {
		
		
		Set s=new HashSet();
		
		s.add("sai");
		
		s.add("rama");
		s.add("raju");
		s.add(1);
		s.add(true);
		
		System.out.println(s);
		
	Iterator iterators=s.iterator();
	
	while(iterators.hasNext()) {
		//iterators.next();
		System.out.println(iterators.next());
	}
	
		
	}
}
