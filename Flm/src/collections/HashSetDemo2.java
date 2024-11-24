package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		
		
	//	s.add(23);
		
		s.add("sai");
		
		s.add("useless eclipse");
		
		System.out.println(s);
		
		Iterator<String> spd=  s.iterator();
		
		
		String temp=null;
		while(spd.hasNext()) {
		//	System.out.println(spd.next());
			temp=spd.next();
			System.out.println(temp);
		}
	  
	}
}
