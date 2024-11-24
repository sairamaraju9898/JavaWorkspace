package jaaa;
class Employee {

public static void display() { // line 2
	System.out.print(" Employee ");
}
}
public class Trainee  extends Employee { 
	public static void display() { // line 5 
		System.out.print(" Trainee ");
	System.out.print("trainee");
	}
	public static void main(String[] args) {

	Employee employee = new Trainee();

	employee.display(); // line 9
	}
	}


