package com.rameshsoft.automation.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesReader;

public class pojoReader {
	//these metghod is for config 
public static PropertiesReader getprconf() throws IOException {
	PropertiesReader prconf=new PropertiesReader(Filepaths.confFilepath);
	return prconf;
	
}

//from here were creating object for rxcel property reader class
public static ExcelReader getexcelreaderobj() throws IOException, EncryptedDocumentException, InvalidFormatException {
	ExcelReader excelreader=new ExcelReader(Filepaths.excelpath);
	return excelreader;
}
}
