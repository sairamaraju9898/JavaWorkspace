package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
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

import com.rameshsoft.automation.customisedexceptions.Frameworksexception;

public class ExcelReader {
		private String filepath;
		private FileInputStream fileInputStream;
		private Workbook workbook;
		private  Sheet sheet;
		private Row row;
		private Cell cell;
		private String value;
		public ExcelReader (String filepath) throws IOException, EncryptedDocumentException, InvalidFormatException {
			this.filepath=filepath;
			fileInputStream=new FileInputStream(filepath);
			workbook=WorkbookFactory.create(fileInputStream);
		}
		public Sheet getsheetobj(String how , String value) throws Frameworksexception {
			if(workbook!=null) {
				if(how.equalsIgnoreCase("sheetname")) {
					sheet=workbook.getSheet(value);
				}
				else if(how.equalsIgnoreCase("index")) {
					int index=Integer.parseInt(value);
					sheet=workbook.getSheetAt(index);
				}
			}
				else {
					//System.out.println("workbook is pointing to null");
					Frameworksexception exception=new Frameworksexception("workbook is pointing to null...");
			 		throw exception;
				}
			
			return sheet;
		}
		public String getcelldata(String how,String value,int rownum,int cellnum) throws Frameworksexception {
			sheet=getsheetobj(how, value);
			if(sheet!=null) {
				row=sheet.getRow(rownum);
				if(row!=null) {
					cell=row.getCell(cellnum);
					if(cell!=null) {
						if(cell.getCellType()==cell.CELL_TYPE_STRING) { //here i'm not sure about this line check notes
						value=cell.getStringCellValue();
						}
						else if (cell.getCellType()==Cell.CELL_TYPE_BOOLEAN) {
							value=cell.getBooleanCellValue()+" ";
						}
						else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
							value=cell.getNumericCellValue()+" ";}
					
				}
					else {
						//System.out.println("cell is pointing to null");
						Frameworksexception exception=new Frameworksexception("cell is pointing to null...");
				 		throw exception;
						
					}
			}
				else {
					//System.out.println("row is pointing to null");
					Frameworksexception exception=new Frameworksexception("row is pointing to null...");
			 		throw exception;
				}	
		}
			else {
				//System.out.println("sheet is pointing to null");
				Frameworksexception exception=new Frameworksexception("sheet is pointing to null...");
		 		throw exception;
			}
		return value;
		}
		public List<String> getrowdata(String how,String value,int rownum) throws Frameworksexception{
			List<String> rowdata=new ArrayList<String>();
			sheet=getsheetobj(how, value);
			for(int i=0;i<row.getLastCellNum();i++) {
				cell=row.getCell(i);
				if(cell.getCellType()==cell.CELL_TYPE_STRING) {
					value=cell.getStringCellValue();
					rowdata.add(value);
				}
				else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN) {
					value=cell.getBooleanCellValue()+" ";
					rowdata.add(value);
				}
				else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
					value=cell.getNumericCellValue()+" ";
					rowdata.add(value);
					}
			}
			return rowdata;
		}
		public List<String> getsheetdata(String how,String value) throws Frameworksexception{
			List<String> sheetdata=new ArrayList<String>();
			sheet=getsheetobj(how, value);
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
					cell=row.getCell(j);
					if(cell.getCellType()==cell.CELL_TYPE_STRING) {
						value=cell.getStringCellValue();
						sheetdata.add(value);
					}
					else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN) {
						value=cell.getBooleanCellValue()+" ";
						sheetdata.add(value);
					}
					else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
						value=cell.getNumericCellValue()+" ";
						sheetdata.add(value);
						}
				}
			}
			return sheetdata;
		}
		}

