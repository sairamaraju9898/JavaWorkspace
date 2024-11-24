package excels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//to read the excel file we can use either filereader/fileinputstram
		FileInputStream fileInputStream=new FileInputStream("H:\\JAVA Workspace\\Worksheet.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
		
	    XSSFSheet sheet=	workbook.getSheet("sheet1");
	    XSSFRow row0=  sheet.getRow(0);
	    
	   
	    System.out.println("total no of rows "+ sheet.getLastRowNum());// withblanks it will count
	    
	    // if u want without balnk then use
	    System.out.println("no of rows without blanks :"+ sheet.getPhysicalNumberOfRows());
	    
	    ;
	    System.out.println(row0.getCell(0));
		

	}

}
