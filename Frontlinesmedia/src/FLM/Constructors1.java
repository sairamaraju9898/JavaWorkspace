package FLM;
class Empl
{
	int eno;
	String name;
	double basic;
	//default constructor
	Empl()
	{
		System.out.println("default constructor");
		eno=2000;
		name="abc";
		basic=600000;
	}
	 //constructor with args(parametrised)
	Empl(int no,String n,double sal)
	{
	System.out.println("paramereised constructor"); 
	eno=no;
	name=n;
	basic =sal;
}
	 void calc()
	{
		double hra=basic*0.12;
		double da=basic*0.15;
		double ta=basic*0.12;
		double gsal=basic+hra+da+ta;
		System.out.println("employee basic salary =" + basic);
		System.out.println("Hra="+hra+"Da="+da+"Ta="+ta);
		System.out.println("employeees gross salary ="+gsal);
	}
	void print() {
		System.out.println("employees no ="+ eno);	
		System.out.println("employees name ="+ name);
		calc(); //calling nested method means method inside method means nested and here were calling another method in this method
	}
}
public class Constructors1 {
public static void main(String[] args) {
	Empl e=new Empl(100,"RAMA RAJU",50000);//PASSING ARGS TO PARAMETERISED CONSTRUCTOR I.E EMPL(INT... STRING.. DBLE)
	 e.print();
	 Empl f=new Empl();
	 f.print();
}
}


