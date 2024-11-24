package com.rameshsoft.men;


class Demo // demo 1stclass
{
	public int practHrs = 9; 
	public String result = "job";
 
	public void hello()
	{
	 
		
		System.out.println(practHrs+"time"+result);
	}
	
	}
 class demo_1   
{
	 int hyd = 200;
	String  biryani = "NICE"; 
 
	static Demo test = new Demo();
	static demo_1 a = new demo_1();
 
	
	static public int total()
	{
	
		 
		 
		
		
		
		int h1b  = test.practHrs+a.hyd; 
		System.out.println(h1b);
		
		
		return h1b;
		}
	
}
public class Encapsulation {
	 
	static Demo test = new Demo();
	static demo_1 a = new demo_1();
	 
	public static void main(String[] args) 
	{
		
	
		
	test.hello();
 // int hydresp =a.hyd;
  
  System.out.println(a.hyd );
  
  //String resp = a.biryani;
  
  System.out.println( a.biryani);
  
			
	}

}





















