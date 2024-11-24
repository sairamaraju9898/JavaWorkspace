package filesandfolders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderDemo {

	
	public static void main(String[] args) throws IOException {
FileInputStream fis1=new FileInputStream("Properties\\config.properties");
		
		Properties configProp=new Properties();
		
		configProp.load(fis1);
		
		System.out.println(configProp.getProperty("browser"));
	}
}
