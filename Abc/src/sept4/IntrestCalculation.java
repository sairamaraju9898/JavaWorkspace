package sept4;

import java.util.Scanner;

public class IntrestCalculation {
   static int p,t,r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntrestCalculation.natSum1();
		IntrestCalculation i=new IntrestCalculation();
		i.natSum1();
		
		System.out.println("method 2");
		System.out.println("enter p");
		Scanner scanner=new Scanner(System.in);
		
		p=scanner.nextInt();
		System.out.println("enter t");
		
		t=scanner.nextInt();
		
		System.out.println("enter r");
		r=scanner.nextInt();
		i.natSum2(p, t, r);
		
		
		System.out.println(i.natSum3());
		
		System.out.println("method 4");
		System.out.println("enter p");
		p=scanner.nextInt();
		System.out.println("enter t");
		
		t=scanner.nextInt();
		
		System.out.println("enter r");
		r=scanner.nextInt();
		;
		System.out.println(i.natSum4(p, t, r));

	}
	
	
	
	// with return type nad parameters
	public  double natSum4(int  p, int t, int r) {
		// TODO Auto-generated method stub
	
		double intrest=(p*t*r)/100;
		System.out.println("interest value is :"+intrest);
		
		return intrest;
	}




	//no args with return type 
	public static double natSum3() {
		// TODO Auto-generated method stub
		
		System.out.println("method 3");
		System.out.println("enter p");
		Scanner scanner=new Scanner(System.in);
		int p=scanner.nextInt();
		System.out.println("enter t ");
		int t=scanner.nextInt();
		System.out.println("enter r ");
		int r=scanner.nextInt();
		double intrest=(p*t*r)/100;
		

		
		return intrest;
	}





	//with args and no return type
public   void natSum2(int  p, int t, int r) {
		// TODO Auto-generated method stub
	int intrest=(p*t*r)/100;
	System.out.println("interest value is :"+intrest);
	
		
	}
//no arg no return type
	public static void natSum1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
		System.out.println("enter p");
		Scanner scanner=new Scanner(System.in);
		int p=scanner.nextInt();
		System.out.println("enter t ");
		int t=scanner.nextInt();
		System.out.println("enter r ");
		int r=scanner.nextInt();
		int intrest=(p*t*r)/100;
		System.out.println("interest value is :"+intrest);
		
		
	}
	

	
	
	

}
