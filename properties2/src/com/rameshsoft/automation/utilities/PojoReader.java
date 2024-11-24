package com.rameshsoft.automation.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.automation.supporters.Excelreader;
import com.rameshsoft.automation.supporters.PropertiesReader;

public class PojoReader {
	public static PropertiesReader getPrconf() throws IOException
	{
		PropertiesReader prconf=new PropertiesReader(Filepaths.confFilepath);
		return prconf;
		
	}
	public static PropertiesReader getPror() throws IOException
	{
		PropertiesReader pror=new PropertiesReader(Filepaths.orFilepath );
		return pror;		
}
	public static Excelreader getexcelreaderobj() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 Excelreader excelreader=new  Excelreader(Filepaths.excelpath);
		 return excelreader;
	}
}
