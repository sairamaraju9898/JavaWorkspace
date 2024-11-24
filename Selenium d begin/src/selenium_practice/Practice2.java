package selenium_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice2 {
public static void main(String[] args) {
	ArrayList<Integer> i =new ArrayList<>();
	i.add(20); 
	i.add(30);
	System.out.println(i);
	Practice2 p=new Practice2();
	System.out.println("hiiiii " + p.ear());;
	System.out.println("helloo " +p.nose());
}
	     Map<Double, String> ear() {
		 Map<Double, String> s= new HashMap<>();
		 s.put(56.959, "sai");
		 s.put(23.0, "ram");
		 s.put(211.000000, "aju");
		 System.out.println(s);
	     return s;
	 }
	     List<Integer> nose() {
	    	 ArrayList<Integer> i =new ArrayList<>();
	    		i.add(20000); 
	    		i.add(3000);
	    		System.out.println(i);
	    		return i;
	     }
	 }

