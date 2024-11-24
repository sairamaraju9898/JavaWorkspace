package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider = "logindata")
	public void login(String un,String pwd,String unpwd) {
		System.out.println(un+"***"+pwd);
	}


	@DataProvider
	public  Object[][] logindata()
	{
	Object[][] obj=new Object[3][3];
	obj[0][0]="java";
	obj[0][1]="selenium";
	obj[0][2]="job";
	obj[1][0]="hike";
	obj[1][1]="hikee";
	obj[1][2]="hi";
	obj[1][0]="hike";
	obj[2][0]="h";
	obj[2][1]="e";
	obj[2][2]="ik";
	return obj;
	}}

