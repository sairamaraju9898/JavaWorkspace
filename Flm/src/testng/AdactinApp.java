

	package testng;

	import org.testng.annotations.Test;

	public class AdactinApp {
		
		//@ test is like cases which will be written above methods its like main method without this annotaion we cant execute the code
		//and also how many test acesw we want we can write in class for ex we wrote 3 here by taking adactin hoyel as ref 
		//here exection always takes in alphabatical order i.e method strating alpphabet u can change order by using priority
		@Test
		public void loginTest()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Launched..");
			System.out.println("Login Successfull...");
			System.out.println("Browser Closed ..");
		}
		
		@Test
		public void registrationTest()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Launched..");
			System.out.println("Registration Successfull...");
			System.out.println("Browser Closed ..");
			
		}
		
		@Test
		public void forgotPasswordTest()
		{
			System.out.println("Browser Started ..");
			System.out.println("App Launched..");
			System.out.println("Forgot Password Successfull...");
			System.out.println("Browser Closed ..");
			
		}
		
		

	}

