package Realtime;

import java.util.List;
import java.util.Scanner;

public class Common extends VendingMachine {
	Scanner scanner=new Scanner(System.in);

     	public Common(Menu menu) {
            
     	}
public void choose() {
	
	  if(option==menu1.getId()) {

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
			System.out.println("Sorry we dont have "+j+ " no of quantity at present we have only "+ menu2.getQuantity()+ " Quantity are there");
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
}
}
