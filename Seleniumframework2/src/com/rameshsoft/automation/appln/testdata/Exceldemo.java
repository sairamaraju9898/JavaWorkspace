package com.rameshsoft.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//this is just demo practice not included in framework
public class  Exceldemo {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fip=new FileInputStream("H:\\JAVA Workspace\\Seleniumframework2\\src\\com\\rameshsoft\\automation\\appln\\testdata\\Testdata.xls");
	    Workbook workbook=WorkbookFactory.create(fip);
	   // HSSFWorkbook workbook = new HSSFWorkbook(fip);
	   // HSSFSheet sheet=workbook.getSheetAt(0); //acessing through index
	    Sheet sheet=workbook.getSheet("Gmail_Data"); //acressing through sheet name 
	    int rownums= sheet.getLastRowNum();
	    rownums++;
	    System.out.println("Total no of rows :" +rownums);
	    Row  row0= sheet.getRow(0);
	    int cellsinRow0= row0.getLastCellNum();
	    System.out.println("Total no of cells are :"+cellsinRow0);
	    Cell cell00= row0.getCell(0);
	    String cell00value= cell00.getStringCellValue();
	    System.out.println(cell00value);
	    Cell cell01= row0.getCell(1);
	    String cell01value= cell01.getStringCellValue();
	    System.out.println(cell01value);
	    
	    Row  row1= sheet.getRow(1);
	    int row1cellcount= row1.getLastCellNum();
	    System.out.println("Total no of cells are :"+row1cellcount);
	    Cell cell10= row1.getCell(0);
	    String cell10value= cell10.getStringCellValue();
	    System.out.println(cell10value);
	    Cell cell11= row1.getCell(1);
	    cell11.getStringCellValue();
	    System.out.println(cell11);
	   
	}
	}

