package testscripts.regression;





import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

@Test
public class ValidateLogin extends BaseTest {
	//make sure this calss should extend base test bcz our beforemethod and after methods are there inside basetest
	//so were using hierchal inhertitance whatever it is common we will keep in seperate class and all required classes extends and
	//use it 
//	@Test
//	public void validateLoginTest() {
//	driver.findElement(By.xpath("//input[@id='username']"));
//	driver.findElement(By.xpath("//input[@id='password']"));
//	driver.findElement(By.xpath("//input[@id='login']")).click();
//	Assert.assertEquals(driver.getTitle(),"Adactin.com - Search Hotel");
//	
	//so here above test case is positive scenario like valid credtails in the same way need to write code for other scenarios
	//if we write like that the duplicate code will beincreasing and suppose if the element attributes changes 
	//we need to identify all the test cases and modify everywhere which makes hard bcz in realtime we have 100's of test cases
	//so we need to write one test case and pass multple sets of data by using dataproviders concepts
	//the above code were commneting and we will write in that way
	
	
	//Here we need to set data provider(name and create 3 args bcz 3 colums ) to this test method 
	@Test(dataProvider ="getTestData")
	public void validateLoginTest(String username,String password,String expTitle) {
		
		//here in above line we took string type bcaz in general login credentials will be in string type only max no need to take object type
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='login']")).click();
	Assert.assertEquals(driver.getTitle(),expTitle);
	
	}
	
	
	@DataProvider
	public Object[][] getTestData(){
		Object[][] data=new Object[4][3];
		//here we took object bcz the data can be of any type so obj is parent of all classes so it can hold any type of data 
		//here 4 means rows and 3 means colums
		//here assume 4 test sets of data we need to passs and each set contains 3 values i.e usn,pwd and expected result in assertion
		
	//	int[] i= {1,2,3};
	  //  int arr[][] = {{1, 2, 3}, {4, 5, 6}};
	//	the above two lines i wrote to recall how to initialise single and double dimsion arrays in single line
		
		//now initialising above 2 dimesional aray
		data[0][0]="reyaz0806";
		data[0][1]="reyaz123";
		data[0][2]="Adactin.com - Search Hotel";
		
		data[1][0]="reyaz0806";
		data[1][1]="reyaz456";
		data[1][2]="Adactin.com - Hotel Reservation System";
		
		data[2][0]="reyaz1212";
		data[2][1]="reyaz123";
		data[2][2]="Adactin.com - Hotel Reservation System";
		
		data[3][0]="reyaz1212";
		data[3][1]="reyaz456";
		data[3][2]="Adactin.com - Hotel Reservation System";
		
		return data;
	}
	
	}

