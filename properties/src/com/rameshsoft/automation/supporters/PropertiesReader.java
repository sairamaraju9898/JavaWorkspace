package com.rameshsoft.automation.supporters;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.rameshsoft.automation.customisedexceptions.FrameworksException;

public class PropertiesReader {
private String filepath;
private FileInputStream fip;
private Properties properties;
private String value;
public PropertiesReader(String filepath) throws IOException
{
	this.filepath=filepath;
	 fip=new FileInputStream(filepath); //to specify the location of the file
	 properties=new Properties(); //to use properties classs mathods we created object for this properties class
	 properties.load(fip); //here we are loading that file(fip) to here  by using this load method
}
public String getpropertyvalue(String key) throws FrameworksException {
	if (properties!=null) {
value =	properties.getProperty(key);} //here this key can be anything maybe the config/or propertiy files keys for both getting urls keys and the keys of the webelement identifications
else {
	//should throw exception
	FrameworksException exception=new FrameworksException("properties object is pointing to null");
	System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
	throw exception;    }
return value;
}
public String getpropertyvalue(String key,String defaultvalue) throws FrameworksException {
	if (properties!=null) {
value =	properties.getProperty(key); //we have to specify the key 
if (value==null) {
	value=defaultvalue;
}}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object  is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
		   throw exception;               }
	return value;
	}
public String getpropertyvalue(Object key) throws FrameworksException {
	if (properties!=null) {
value =	(String)properties.get(key);
	}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
	throw exception;	
	}
	return value;
	}
public String getpropertyvalue(Object key,Object defaultvalue) throws FrameworksException {
	if (properties!=null) {
value =	(String) properties.get(key);
if (value==null) {
	value=(String) defaultvalue;
}}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
		throw exception; }
	return value;
	}
//till we wrote methods to get values from properties class which is child class of our hashtable ,so now e will use set propeerties to set values by using this properties class 
public void writekeyvalue(String key,String value) throws IOException, FrameworksException {
	if (properties!=null) {
properties.setProperty(key,value);
FileOutputStream fop=new  FileOutputStream(filepath);
properties.store(fop, "file is saved succesfully");
	}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
		throw exception;  }
	}
public void writekeyvalue(Object key,Object value) throws IOException, FrameworksException {
	if (properties!=null) {
properties.put(key,value);
FileOutputStream fop=new  FileOutputStream(filepath);
properties.store(fop, "file is saved succesfully");
	}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
		throw exception; }	 
	}
//to get all the keys we have method in map(I) which is implemented in hashtable we know ,we use keyset() method now
public Set getkeys() throws FrameworksException {
	Set setkeys=null;
	if(properties!=null) {
		setkeys=properties.keySet();
	}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
		throw exception;    }
	return setkeys;   }
// now to get all values we have method in map that is collection as return type and method name is values(), but sir didnt taken this method directly he did in lenghty process now lets have a lok at this
public List getvalues() throws FrameworksException {
	List listvalues=new ArrayList<>();
	if(properties!=null) {
		Set set =properties.keySet();	
		for(Object obj : set)
		{
			Object value=properties.get(obj);
			 listvalues.add(value);		
		}}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");      
		    throw exception;                }
	return listvalues;   }

public Map getkeyvalues() throws FrameworksException {
Map map=new HashMap<>();
if (properties!=null) {
Set set =properties.keySet();
		for(Object obj : set)
		{
			Object value=properties.get(obj);
			map.put(obj ,value );	
	}}
	else {
		//should throw exception
		FrameworksException exception=new FrameworksException("properties object is pointing to null");
		System.out.println("PROPERTIES OBJECT IS POINTING TO NULL...");
		throw exception;}
	return map;   }}















