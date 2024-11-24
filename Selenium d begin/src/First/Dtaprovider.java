package First;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dtaprovider {
	
@Test(dataProvider = "dta")
public void Dtaprovider(String name, int id) {
	System.out.println(" emp name iS :"+name +" id is :"+id);
	
}
  
@DataProvider
public Object[][] dta(){
	Object[][] objects=new Object[3][2];
	objects[0][0]="sai";
	objects[0][1]=2;
	objects[1][0]="Ramaraju";
	objects[1][1]=25;
	objects[2][0]="saiRamaRaju";
	objects[2][1]=23;
	
	
	
	
	
	return objects;
}
}
