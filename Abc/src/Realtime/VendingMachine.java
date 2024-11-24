package Realtime;

import java.util.HashMap;
import java.util.Scanner;
import Realtime.Menu;

public class VendingMachine  {
	 int j;
	 Double billamount=0.0;
	 int option;
		Menu menu1;
		Menu menu2;
		Menu menu3;
		Menu menu4;
		Menu menu5;
		public static void main(String[] args) {
			VendingMachine mVendingmachine=new VendingMachine();
			mVendingmachine.mainn();
			System.out.println("Total bill: "+ mVendingmachine.billamount);
		}
	public  void mainn() {
		HashMap<Integer, Menu> v=new HashMap<Integer,Menu >();
		 menu1=new Menu("coffee",1,100,25);
		 menu2=new Menu("Tea", 2,80, 30);
		 menu3=new Menu("Boost", 3, 150, 15);
		 menu4=new Menu("Horlicks", 3, 130, 10);
		 menu5=new Menu("Maltova", 4, 130, 10);
		
		v.put(menu1.getId(), menu1);
		v.put(menu2.getId(), menu2);
		v.put(menu3.getId(), menu3);
		v.put(menu4.getId(), menu4);
		v.put(menu5.getId(), menu5);
			
		Scanner scanner=new Scanner(System.in);
		System.out.println("please select 1/2/3/4 to get details for ur selected menu");
	     option=scanner.nextInt();
		if(option==menu1.getId())
		{
			System.out.println("yOu have choosen coffee price/single is : "+menu1.getCost());
			while( menu1.getQuantity()>0) {
				System.out.println("Do u wannna proceed further press yes or else no");
			String s=	scanner.next();
			if(s.equalsIgnoreCase("yes"))
			{
			System.out.println("Enter How Many quantity u want");
			
			 j  = scanner.nextInt();
			if(j<=menu1.getQuantity()) {
				
				System.out.println("U have choosen :"+ j +" quantity of "+ menu1.getName());
			//i=menu1.getQuantity()-j;
			menu1.setquantity(menu1.getQuantity()-j );
			billamount=billamount+j*menu1.getCost();
			System.out.println("Total cofee remained in machine is :"+ menu1.getQuantity());
			System.out.println("u wanna CheckedOut press chk / Add other items in menu ado / Add coffeeAdd again aga");
			String choice= scanner.next();
			switch (choice) { 
			case "chk": System.out.println("u are gonna go to check outs page and pay bill");
			break;
			
			case "ado" :System.out.println(" u are gonna traverse to the main menu and there u can select ur items ");
			mainn();
			break;
			
			case "aga" :System.out.println(" u wann add again were gonna traverse u again back to main menu");
			continue;
			}
			break;
			}
			else {
				System.out.println("Sorry we dont have "+j+ " no of quantity at present we have only "+ menu1.getQuantity() + " Quantity are there");
			}
			
			}
			
			else {
				System.out.println("wanna go to menu press menu or press no");
				String sd=  scanner.next();
				if(sd.contains("menu")) {
					mainn();
				}
			
				else if(sd.equalsIgnoreCase("no")) {
					
					System.out.println("were breaking u out thank u for choosing our vending machine plase visit again!");
					break;
				}
				}			
				break;
			}
			}
		
		else if(option==menu2.getId()) {

			System.out.println("yOu have choosen coffee price/single is : "+menu2.getCost());
			while( menu2.getQuantity()>0) {
				System.out.println("Do u wannna proceed further press yes or else no");
			String s=	scanner.next();
			if(s.equalsIgnoreCase("yes"))
			{
			System.out.println("Enter How Many quantity u want");
			
			 j  = scanner.nextInt();
			if(j<=menu2.getQuantity()) {
				
				System.out.println("U have choosen :"+ j +" quantity of "+ menu1.getName());
			//i=menu1.getQuantity()-j;
			menu2.setquantity(menu2.getQuantity()-j );
			
			System.out.println("Total Tea remained in machine is :"+ menu2.getQuantity());
			billamount=billamount+j*menu2.getCost();
			System.out.println("u wanna CheckedOut press chk / Add other items in menu ado / Add coffeeAdd again aga");
			String choice= scanner.next();
			switch (choice) { 
			case "chk": System.out.println("u are gonna go to check outs page and pay bill");
			
			break;	
			case "ado" :System.out.println(" u are gonna traverse to the main menu and there u can select ur items ");
			mainn();
		    
			case "aga" :System.out.println(" u wann add again were gonna traverse u again back to main menu");
			continue;
			}
			break;
			}
			else {
				System.out.println("Sorry we dont have "+j+ " no of quantity at present we have only "+ menu1.getQuantity() + " Quantity are there");
			}
			}
			
			else {
				System.out.println("wanna go to menu press menu or press no");
				String sd=  scanner.next();
				if(sd.contains("menu")) {
					mainn();
				}
			
				else if(sd.equalsIgnoreCase("no")) {
					
					System.out.println("were breaking u out thank u for choosing our vending machine plase visit again!");
				
				}
				}				
				}
			
	}
		else if(option==menu3.getId()) {
			System.out.println("yOu have choosen Boost price is : "+menu3.getCost());
			System.out.println("click ok to proceed to payments page: ");	
	}
		else if(option==menu4.getId()) {
			System.out.println("yOu have choosen Horlicks price is : "+menu4.getCost());
			System.out.println("click ok to proceed to payments page: ");	
	}
		else if(option==menu5.getId()) {
			System.out.println("yOu have choosen Maltova price is : "+menu5.getCost());
			System.out.println("click ok to proceed to payments page: ");	
	}
		
	}
}
