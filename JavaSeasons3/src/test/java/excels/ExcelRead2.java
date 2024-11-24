package excels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	
	public static void main(String[] args) throws IOException {
		//here i want to read all rhe data from the sheet
		//steps -1 focus on sheet
		//2 then get the all rows
		// then from each rows get all cells 
		
		
FileInputStream fileInputStream=new FileInputStream("H:\\JAVA Workspace\\Worksheet.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
		
	    XSSFSheet sheet=	workbook.getSheet("sheet1");
	    XSSFRow row=null;
	    XSSFCell cell=null;
	    
	    for(int i=0; i<=sheet.getLastRowNum(); i++) { // here indexgertlastrownum starts from 0 thats why we took <=
	    	
	      row=  	sheet.getRow(i);
	      
	      if(row==null) {
	    	  continue;
	      }
	    	for(int j=0; j<row.getLastCellNum();j++) {
	    		 cell=row.getCell(j);
	    		System.out.print(row.getCell(j)+"\t");
	    		 
	    		 if(cell.getCellType()==CellType.STRING) {
	    			 System.out.print("cell type is string "+row.getCell(j)+"\t");
	    		 }
	    		 
	    		 else if(cell.getCellType()==CellType.NUMERIC) { //its double return
	    			 System.out.print("cell type is numeric  "+row.getCell(j)+"\t");
	    		 }
	    		 else if(cell.getCellType()==CellType.BOOLEAN) {
	    			 System.out.print("cell type is boolean "+row.getCell(j)+"\t");
	    		 }
	    		 else if(cell.getCellType()==CellType.BLANK) {
	    			 System.out.print("cell type is BLANK "+row.getCell(j)+"\t");
	    		 }
	    		 
	    		 else {
	    			 System.out.print(row.getCell(j)+"\t");
				}
				}
	    	System.out.println();
	    	}
	    	
	    }
	}
