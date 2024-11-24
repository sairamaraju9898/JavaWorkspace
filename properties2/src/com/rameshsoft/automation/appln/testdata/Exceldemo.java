package com.rameshsoft.automation.appln.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldemo { //this is just example doesnt consider as project piece
    public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
	// 1st approach for specifying location of xl file by using file
//	FileInputStream fip=new FileInputStream(new File("H:\\JAVA Workspace\\properties\\src\\com\\rameshsoft\\automation\\appln\\testdata\\Testdata.xls"));
//2 approach is by using string here we will specify location of file in the form of string ,before we specified it as file
FileInputStream fip=new FileInputStream( System.getProperty("user.dir")+"\\src\\com\\rameshsoft\\automation\\appln\\testdata\\Testdata.xls");
//creting workbook for xl file
Workbook workbook=	  WorkbookFactory.create(fip);
	//1st approach were caling the sheet with the help of index value
//Sheet sheet=workbook.getSheetAt(0);
// 2 aproach were calling with string i.e were calling sheet with the sheetname i.e string
Sheet sheet=workbook.getSheet("Gmail_Data");
 int rownums=    sheet.getLastRowNum();
System.out.println("totl no of rows r:"+ rownums++);
 Row row0=    sheet.getRow(0);
int cellinrow0= row0.getLastCellNum();
System.out.println("total no of cells r:"+ cellinrow0);
  Cell   cell00=row0.getCell(0);
 String  celloovalueString= cell00.getStringCellValue();
 System.out.println(celloovalueString);
 Cell cell01=row0.getCell(1);
 String cell01value= cell01.getStringCellValue();
 System.out.println(cell01value);
 Row row1=sheet.getRow(1);
     int row1cellcount=   row1.getLastCellNum();
     System.out.println(row1cellcount);
Cell cell10=      row1.getCell(0) ;  
String   cell10value=   cell10.getStringCellValue();
System.out.println(cell10value);
 Cell cell11value  =  row1.getCell(1);
 System.out.println(cell11value);
        
        
}}  