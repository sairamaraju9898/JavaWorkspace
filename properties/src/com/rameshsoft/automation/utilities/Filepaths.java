package com.rameshsoft.automation.utilities;

public interface Filepaths { //here by default all the variables of interface are public,static,final,so we can acess /read data by interface name,so in pojo class we are calling individual variables of this interface that maybe the location of the or/config wit the interface name in pojoreader class 
String confFilepath=System.getProperty("user.dir")+"\\config.properties";
String orFilepath=System.getProperty("user.dir")+"\\src\\com\\rameshsoft\\automation\\appln\\objectrepository\\or.properties";
String excelpath=System.getProperty("user.dir")+"\\src\\com\\rameshsoft\\automation\\appln\\testdata\\Testdata.xls";
String xmlFilepath="";
String txtFilepath="";
	}
