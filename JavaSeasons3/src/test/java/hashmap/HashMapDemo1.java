package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	
	public static void main(String[] args) {
		
		
	Map<String, String> map=	new HashMap<String, String>();
	map.put("manager", "Biswa");
	map.put("supervisor", "vpkdlp");
	map.put("tester", "sai rama raju");
	map.put("developer", "Reyaz");
	map.put("lead", "kishore");
	
	
	System.out.println(map.entrySet());
	
	System.out.println(map.keySet());
	
	System.out.println(map.values());
	
	
	Set<Entry<String, String>> entrySet=	map.entrySet();
	
	for(Entry<String, String> entry:entrySet) {
		System.out.println(entry.getKey()+"-----"+ entry.getValue());
	}
	}
}
