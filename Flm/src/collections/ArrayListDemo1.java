package collections;

import java.util.ArrayList;
import java.util.List;





public class ArrayListDemo1 {
	//in list insrtion order is there and allows theb duplicate values
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>(); //default constructor with capacity 10
		
		System.out.println(a.size());  // here size will be 0 since its empty it can store 10 values if its completeing(3/2)*cap+1
		
		a.add(23); // add method takes any kind of datatype and returns boolean to say whether the element is added or not either T/F
		
		a.add(56);
	//	a.add("sai");
		
		System.out.println(a.size());
		a.isEmpty();// returns boolean
		
		System.out.println(a.contains("sai")+ " checking for sai value in array ");
		
		// till above line all methods above belongs to collection interface
		
		System.out.println(a);
		
		
		System.out.println(" printing the values in the array object By using for loop");
		for(int i=0;i<a.size();i++) {
		
			System.out.println(a.get(i));
		}
		
		System.out.println(" printing the values in the array object By using for each loop");
		for(int obj:a) {
			// a if u dont specify the generic type as integer while creating object for list it wont accept to take as int since 
			// a is treated as object as we mentioned integer generic type so were able to take the int in for each loop 
			System.out.println(obj);
		}
		
	}

}
