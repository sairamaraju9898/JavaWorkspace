package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.rameshsoft.automation.customisedexceptions.FrameworksException;

public class Excelreader {
private String filepath;
private FileInputStream fileInputStream;
private Workbook workbook;
private Sheet sheet;
private Row row;
private Cell cell;
private String value ;
//constructor
public  Excelreader(String filepath) throws EncryptedDocumentException, InvalidFormatException, IOException
{
this.filepath=filepath;
fileInputStream =new FileInputStream(filepath);
 workbook= WorkbookFactory.create(fileInputStream);
}
public Sheet getsheetobj(String how, String value  ) throws FrameworksException {
	if(workbook!=null) {
		if(how.equalsIgnoreCase("sheetname")) {
			sheet=workbook.getSheet(value);
		}
		else if (how.equalsIgnoreCase("index")) {
			int index=Integer.parseInt(value);
			sheet=workbook.getSheetAt(index);
		}
		else {
			//throw exception
			FrameworksException exception=new FrameworksException("workbook is pointing to null");
			System.out.println("workbook is pointing to nul...");
			throw exception;
			}
	}
	return sheet;
}
public String getcelldata( String how,String value,int rownum,int cellnum ) throws FrameworksException
{
sheet=	getsheetobj(how, value);
if(sheet!=null) {
	row=sheet.getRow(rownum);
	if(row!=null) {
		cell =row.getCell(cellnum);
		if(cell!=null) {
			if(cell.getCellType()==cell.CELL_TYPE_STRING) {
				value=cell.getStringCellValue();
			System.out.println(value);	 
			}
			else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN) {
				value=cell.getBooleanCellValue()+"";
				System.out.println(value);	 
			}
			else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
				value=cell.getNumericCellValue()+"";
				System.out.println(value);	
				}
		}
		else {
			//throw exception
			System.out.println("cell is pointing to nul...");
		}
	}
	else {
		//throw exception
		System.out.println("row is pointing to nul...");
}
}
else {
	//throw exception
	System.out.println("sheet is pointing to nul...");
}
return value;
}
public List<String> getrowdata(String how,String value,int rownum) throws FrameworksException{
List<String> rowdata=new ArrayList<String>();
sheet=getsheetobj(how, value);
row=sheet.getRow(rownum);
for(int i=0;i<row.getLastCellNum();i++) {
	cell=row.getCell(i);
	if(cell.getCellType()==cell.CELL_TYPE_STRING) {
		value=cell.getStringCellValue();
		rowdata.add(value);
		System.out.println(rowdata);
	}
	else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN) {
		value=cell.getBooleanCellValue()+"";
		rowdata.add(value);
		System.out.println(rowdata);
	}
	else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
		value=cell.getNumericCellValue()+"";
		rowdata.add(value);
		System.out.println(rowdata);
}
}
return rowdata;
}
public List<String> getsheetdata(String how,String value) throws FrameworksException{
List<String> sheetdata=new ArrayList<String>();
sheet=getsheetobj(how, value);	
for(int i=0;i<=sheet.getLastRowNum();i++) {
	row=sheet.getRow(i);
	for(int j=0;j<row.getLastCellNum();j++) {
		cell=row.getCell(j);
		if(cell.getCellType()==cell.CELL_TYPE_STRING) {
			value=cell.getStringCellValue();
			sheetdata.add(value);
			System.out.println(sheetdata);
		}
		else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN) {
			value=cell.getBooleanCellValue()+"";
			sheetdata.add(value);
			System.out.println(sheetdata);
		}
		else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
			value=cell.getNumericCellValue()+"";
			sheetdata.add(value);
}
}
}		
return sheetdata;	
}} 


