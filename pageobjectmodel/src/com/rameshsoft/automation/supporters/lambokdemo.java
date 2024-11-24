package com.rameshsoft.automation.supporters;

public class lambokdemo {
	int i=5;
	String string;
	String string2;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
public static void main(String[] args) {
	lambokdemo ne=new lambokdemo();
	ne.setI(200);
	ne.setString("ram");
	ne.setString2("sdfcsf");
	System.out.println(ne.getString()); 
	System.out.println(ne.getString2()); 
	System.out.println(ne.getI()); 
	System.out.println(ne.hashCode());
}
}
