package com.rameshsoft.automation.supporters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Textreader_demo {
//this class for crestingbone text file by using code thats it but not for framework even if u want u can create on ur own text file
	//but lets crweate by usuing this methods
	public static void main(String[] args) throws IOException {
		
		File file=new File("H:\\JAVA Workspace\\Seleniumframework2\\src\\com\\rameshsoft\\automation\\supporters\\demo.txt");
		boolean status=file.createNewFile();
		if(status) {
			System.out.println("file is created newly");
		}
		else {
			System.out.println("returns existing one");
		}
		FileWriter fileWriter=new FileWriter(file);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write("hello");
		bufferedWriter.newLine();
		bufferedWriter.write("121");
		bufferedWriter.newLine();
		bufferedWriter.write("sai");
		bufferedWriter.newLine();
		bufferedWriter.write("rama");
		bufferedWriter.newLine();
		bufferedWriter.write("raju");
		bufferedWriter.flush();
	}
	}
	
