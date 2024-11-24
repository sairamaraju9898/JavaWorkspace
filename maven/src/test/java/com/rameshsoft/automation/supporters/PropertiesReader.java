package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.rameshsoft.automation.customisedexceptions.Frameworksexception;

public class PropertiesReader {
	private String filepath;
	private FileInputStream fip;
	private Properties properties;
	private String  value;
	public PropertiesReader(String filepath) throws IOException {//constructor
		this.filepath=filepath;
		fip=new FileInputStream(filepath);
		properties=new Properties();
		properties.load(fip);
		}
	// from here see property class methods i.e getproperty method which is child class of hastable
	public String getpropertyvalue(String key) throws Frameworksexception {
		if(properties!=null) {
		value=properties.getProperty(key);
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties object is pointing to null...");
	 		throw exception;
		}
		return value;
	}
	public String getpropertyvalue(String key,String defaultvalue) throws Frameworksexception { //with default value if value is null it returns default value
		if(properties!=null) {
		value=properties.getProperty(key);
		  if(value==null) {
			  value=defaultvalue;
		  }
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties object is pointing to null...");
	 		throw exception;
		}
		return value;
	}

	//from here see hashtable class methods i.e get method//which is taking object as parameter  , where as in properties 
	//getproperty method from property will take string as parameter anyway object means we will type caste to string in hashmap get method

	public String getpropertyvalue(Object key) throws Frameworksexception {
		if(properties!=null) {
		value=(String)properties.get(key);
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
	 		throw exception;
		}
		return value;
	}
	public String getpropertyvalue(Object key,Object defaultvalue) throws Frameworksexception { //with default value if value is null it returns default value
		if(properties!=null) {
		value=(String)properties.get(key);
		  if(value==null) {
			  value=(String)defaultvalue;
		  }
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
	 		throw exception;
		}
		return value;
	}

	//from now we will see how to write/set vale by using property class setvalue and put value method from hashtable
	// property method setproperty method
	public void writekeyvalue(String key, String value) throws IOException, Frameworksexception {
		if(properties!=null) {
			properties.setProperty(key, value);
			FileOutputStream fop=new FileOutputStream(filepath);
			properties.store(fop, "file is saves sucessfully");
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
	 		throw exception;
		}
	}
	public void writekeyvalue(Object key, Object value) throws IOException, Frameworksexception {
		if(properties!=null) {
			properties.put(key, value);
			FileOutputStream fop=new FileOutputStream(filepath);
			properties.store(fop, "file is saves sucessfully");
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
	 		throw exception;
		}
	}

	// from here we see how to get only keys we have keyset method from hashtable
	public Set getkeys() throws Frameworksexception {
		Set setkeys=null;
		if(properties!=null) {
			setkeys=properties.keySet(); //this method retrns all keys in refereed /req property files
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
	 		throw exception;
		}
		return setkeys;
	}
	//if u want to get all values heer we willntake list bcz values ncan be duplicate but not keys so before method 
	// to get keys we have taken set
	public List getvalues() throws Frameworksexception {
		List listvalues=new ArrayList<>();
		if(properties!=null) {
			Set set=properties.keySet(); 
			for(Object obj: set)
			{
			 Object value=properties.get(obj); 
			 listvalues.add(value);
			// Object o=(Object)listvalues; //here were doing typecasting to obj from list directly wecant convert to string
			//String string=(String)o; //here remember object is parent class or root class to each and every methodb in java
			}
		}
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
	 		throw exception;
		}
		return listvalues;
		
	}
	public Map  getkeysvalues() throws Frameworksexception {
		Map map=new HashMap<>();
		if(properties!=null) {
			Set set=properties.keySet(); 
			for(Object obj: set)
			{
			 Object value=properties.get(obj); 
			map.put(obj, value);
			}
	     }
		else {
			//System.out.println("properties object is pointing to null");
			Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
	 		throw exception;
		}
		return map;
	} 
	public String getpropertyvaluebujs(String key ,String defaultvalue) throws Frameworksexception {
	if(properties!=null) {
	value=	properties.getProperty(key);
	if(value==null) {
		value=defaultvalue ;
	}
	}
	else {
		Frameworksexception exception=new Frameworksexception("properties is pointing to null...");
		throw exception;
	}
	return value;
	}
	}
