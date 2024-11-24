package sep11;

public class Bank {

	
	private int balance=7800;
	
	
	public void getBalance(int pin) {
		if(pin==123) {
			System.out.println("Balance is : "+ balance);
		}
	}
}
