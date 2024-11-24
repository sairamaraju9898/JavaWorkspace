package selenium_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice3 {
	
	public List<Integer>  hello(){  //method retrurning interface tyepe
		List<Integer> list=new ArrayList<>();
		list.add(50);
		list.add(65);
		list.add(525);
		System.out.println(list);
		return list;
	}
	public void hello(Set<String> s) {
		s.add("ram");
		s.add("sai");
		s.add("raju");
		for(Object o:s) {
			System.out.println(o);
		}
	}
public static void main(String[] args) {
	Practice3 p=new Practice3();
	p.hello();
	p.hello(new HashSet<>());
	
}
}
