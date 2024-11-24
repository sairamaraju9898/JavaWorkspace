package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Regexutility {
	
public static boolean isvalidphunum(String phnum)
{
	boolean isvalidphunum=true;
	Pattern pattern= Pattern.compile("[6-9][0-9]{9}");
	Matcher matcher=pattern.matcher(phnum);
	if (matcher.find()&&matcher.group().equalsIgnoreCase(phnum)) {
		System.out.println("it is a valid phnum");}
	else {
		System.out.println("its invalid phn no");
		isvalidphunum=false;
	}
	return isvalidphunum;
}}
