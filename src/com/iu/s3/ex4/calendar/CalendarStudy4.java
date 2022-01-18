package com.iu.s3.ex4.calendar;

import java.util.Calendar;


public class CalendarStudy4 {
	public static void main(String[] args) {
		
	
	Calendar ca = Calendar.getInstance();
	Calendar ca2 = Calendar.getInstance();
	
	//현재시간
	System.out.println(ca.getTime());
	
	
	//태어난날
	ca2.set(1993, 5, 16);
	System.out.println(ca2.getTime());
	//며칠
	long t1 = ca.getTimeInMillis();
	long t2 =ca2.getTimeInMillis();
	
	long result = t1 - t2;
	
	System.out.println(result/(1000*60*60*24));
	
	
	//나이
	System.out.println(result/(1000*60*60*24*365.2425));
	
}
}