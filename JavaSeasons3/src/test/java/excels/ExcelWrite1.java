package excels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fileInputStream=new FileInputStream("H:\\JAVA Workspace\\Worksheet.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fileInputStream);
		
		XSSFSheet ws=  wb.getSheet("sheet1");
		//case1 overriding the data existing
		
		ws.getRow(0).getCell(1).setCellValue("xyz");
		
		//case2 existing row withn new cell
		
		ws.getRow(2).createCell(2).setCellValue("jack");
		
		//case 3 creating row and cell
		ws.createRow(3).createCell(0).setCellValue(235);		
		FileOutputStream fp=new FileOutputStream("H:\\\\JAVA Workspace\\\\Worksheet.xlsx");
		
		wb.write(fp);
		wb.close();
	}
}
