package filesandfolders;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	
	public static void main(String[] args) throws IOException {
	File flSrc=	new File(System.getProperty("user.dir")+"\\adactin.txt");
	System.out.println(flSrc.createNewFile());
	//here were creating the text file which in realtime we wont use mostly we just created text file for tetsres we dont deal with text file
	
	//for using file utils
	}
}
