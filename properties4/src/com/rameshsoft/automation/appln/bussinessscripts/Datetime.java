package com.rameshsoft.automation.appln.bussinessscripts;

import java.time.LocalDate;

abstract public class Datetime {
	  public static String getcurrentyearmonthdate() { // to get yr,month,date
	LocalDate localdate=LocalDate.now();
String localdate1=	localdate.toString();
return localdate1;
	  }
	  
	  public static String getcurrentyear() { // to get year
	String localdate=getcurrentyearmonthdate();
String[] localdate1=	localdate.split("-");
String year= localdate1[0];
return year;
	  }

	  public static String getcurrentmonth() { // to get month
			String localdate=getcurrentyearmonthdate();
		String[] localdate1=localdate.split("-");
		 String  month=localdate1[1];
		 return month;}
	  
	  public static String getcurrentdate() { // to get date
			String localdate=getcurrentyearmonthdate();
		String[] localdate1=localdate.split("-");
		 String  date=localdate1[2];
		 return date;
		 }
	  
public static void main(String[] args) { //here were just printing them on console all above 3 methods
	System.out.println( getcurrentyearmonthdate());
	System.out.println(getcurrentdate());
	System.out.println(getcurrentmonth());
	System.out.println( getcurrentyear());
	
}	  
	 
public static String getfuturedate() { // to get tomorrows date
LocalDate localDate=	LocalDate.now();
LocalDate localDate2=  localDate.plusDays(1);
      String tomorrowdate=    localDate2.toString();
      return tomorrowdate;
}

public static String getpastdate() { // to get yesterdays date or u can specify ur required day imean how many days back u want u can get that by specifying the index
LocalDate localDate=	LocalDate.now();
LocalDate localDate2=  localDate.minusDays(1);
      String yesterdaydate=   localDate2.toString();
      return yesterdaydate;
}



}