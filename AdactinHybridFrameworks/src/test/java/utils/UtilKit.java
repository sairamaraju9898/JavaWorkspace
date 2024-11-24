package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.table.TableStringConverter;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilKit {
static FileInputStream fis1;
	
	public static HashMap<String,Object> getTestDataFromExcel(String testcase)
	//here we want data in the form of key value pair like hashmap key value pairs
	{
		
		try {
			fis1=new FileInputStream("src\\test\\resources\\testdata\\excels\\MasterTestData.xlsx");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		XSSFWorkbook wb=null;
		
		try {
			wb=new XSSFWorkbook(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet  ws=wb.getSheet("regression");
		
		
		ArrayList<Row> testCaseRows=getTestCaseRows(ws,testcase);
		//for that we created the method in order to collectb the rows if we [ass the ws and testcase is the number for suppose 101 if we pass means only the data which is related to this only it will give
		//it will return list of rows
		
	//read overall the below lines first	
		//simply saying till above line were just creating the array lisof tpe row and were adding allrows which are not blank to this array lisy
		//and from this array list obj which contains non blanked rows from which we need to send the test acse number(i.e here T101)
		//so if we pass like that we need to get that particular row data for that
		//we craete again arraylist to add to this array list obj of type rows which is our req test case so we iterate all  the 
		// all rows and rake the zerothth colum bcz in that column only we mention test case number and compare with the passed test case name
		//and adding it the testcaserows array object
		
		
		HashMap<String, Object> testDataMap=new HashMap<String, Object>();
		//here we caredt hashmap to put the data ni the form of key value format
		
		
		for(int i=0;i<testCaseRows.size();i++)
		{
			int noOfCells=testCaseRows.get(i).getLastCellNum();
			
			
			
			for(int j=1;j<noOfCells;j++)
			{
		
				if(testCaseRows.get(1).getCell(j).getCellType()==CellType.STRING) {
				
				testDataMap.put(testCaseRows.get(0).getCell(j).getStringCellValue(), 
								testCaseRows.get(1).getCell(j).getStringCellValue());
				}
				
				else if(testCaseRows.get(1).getCell(j).getCellType()==CellType.NUMERIC) {
					
					testDataMap.put(testCaseRows.get(0).getCell(j).getStringCellValue(), 
								String.valueOf(testCaseRows.get(1).getCell(j).getNumericCellValue()));
					}
					
				else  if(testCaseRows.get(1).getCell(j).getCellType()==CellType.BOOLEAN) {
					
					testDataMap.put(testCaseRows.get(0).getCell(j).getStringCellValue(), 
									testCaseRows.get(1).getCell(j).getBooleanCellValue());
					}
			}
		}
		
		return testDataMap;
		
	}

	private static ArrayList<Row> getTestCaseRows(XSSFSheet ws, String testcase) {
		
		ArrayList<Row> allRows=new ArrayList<Row>();
		//here we created array list which is of type rows (class) type
		
		for(int i=0;i<=ws.getLastRowNum();i++)
			//ws.getlastrwnu gives count of total no of rows
		{
			if(ws.getRow(i)!=null)
				//but we need to add the rows to above created array list i.e allRows only if the row is not blank
			{
				allRows.add(ws.getRow(i));
				//after this allRows of array list type of row is filled with thr rows which are not blank
			}
		}
		
		
		ArrayList<Row> testCaseRows=new ArrayList<Row>();
		//here oour view is like out of all the rows if we want only the specific test case like if we pass test case number we need to store 
		//that required data only in array list 
		//so were creating array list of type rows again
		
		for(int i=0;i<allRows.size();i++)
			//now allRows we have all the rows which are not blank our req is now to get only the req test case number rows 
			//so were knowing the tota rows which we need to iterate all the rows wherever our test case matched that test case rows shoudld
			//be added to the testCaseRows
		{
			

			
			if(allRows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testcase))
				//here we already know T-101 we know in which place it is located so its in o row zero colum and also 1st row and zero colum
				//so here were like checking all rows in zeroth cell and comparing with testcase which we passed 
			{
				testCaseRows.add(allRows.get(i));
			}
			
			
			
			
		}
		
		return testCaseRows;
		
		
		
		
	}
}
