package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rameshsoft.automation.customisedexceptions.Frameworksexception;

public class Textreader {
private String filepath;
private File file;
private FileWriter fileWriter;
private BufferedWriter bufferedWriter;
private FileReader fileReader;
private BufferedReader bufferedReader;
private String value;
public Textreader(String filepath) throws IOException {
	this.filepath=filepath;
	file=new File(filepath);
	boolean status=file.createNewFile();
	if(status) {
		System.out.println("file is created newly");
	}
	else {
		System.out.println("returns existing file");
	}
	fileWriter=new FileWriter(file);
	bufferedWriter=new BufferedWriter(fileWriter);
	fileReader=new FileReader(file);
	bufferedReader=new BufferedReader(fileReader);
}
public void writedata(String data) throws IOException, Frameworksexception {
	if(bufferedWriter!=null) {
	bufferedWriter.write(data);
	bufferedWriter.flush();
	}
	else {
		//System.out.println("Bufferedwriter is pointing to null");
		Frameworksexception exception=new Frameworksexception("Bufferedwriter is pointing to null...");
 		throw exception;
	}
}
public void writedata(int data) throws IOException, Frameworksexception {
	if(bufferedWriter!=null) {
		bufferedWriter.write(data);
		bufferedWriter.flush();
		}
		else {
			//System.out.println("Bufferedwriter is pointing to null");
			Frameworksexception exception=new Frameworksexception("Bufferedwriter is pointing to null...");
	 		throw exception;
		}
}
public String getdata() throws IOException, Frameworksexception {
	if(bufferedReader!=null) {
		value=bufferedReader.readLine();
	}
	else {
		//System.out.println("bufferedreader is pointing to null");
		Frameworksexception exception=new Frameworksexception("Bufferedwriter is pointing to null...");
 		throw exception;
	}
	return value;
}
public List<String> gettotaldata() throws IOException, Frameworksexception {
List<String> filedata =new ArrayList<String>();
   if(bufferedReader!=null) {
	   value=bufferedReader.readLine();
	   filedata.add(value);
   }
   else {
	  // System.out.println("bufferedreader is pointing to null");
	   Frameworksexception exception=new Frameworksexception("Bufferedwriter is pointing to null...");
		throw exception;
   }
   return filedata;
}
}