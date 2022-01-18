package com.iu.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {

		//Calendar는 추상 클래스
		//GregorianCalendar 가 Calendar 클래스 상속
		//Calendar의 메서드는 GregorianCalendar에 있다
		
		GregorianCalendar gc = new GregorianCalendar();

		Calendar calendar = new GregorianCalendar();
		
		//  == 위와 같은 코드
		
		Calendar ca = Calendar.getInstance();//Gregorian
	
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH)+1; // 월만 0부터 시작함
		int d = ca.get(Calendar.DATE);
		
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY); // 24시간 형식
		int min = ca.get(Calendar.MINUTE); 
		int s = ca.get(Calendar.SECOND); 
		int ms = ca.get(Calendar.MILLISECOND); //천분의 1초 //1000 == 1초
		
		long millis = ca.getTimeInMillis();
		
		Date date = ca.getTime();   //깃허브 참조
		
		//System.out.println(gc);
	//System.out.println(calendar);
	//System.out.println(ca);
	
		System.out.println("Y : "+ y);
		System.out.println("M :" + m);
		System.out.println("D :" + d);
		System.out.println("H :" + h);
		System.out.println("HH :" + hh);
		System.out.println("Min :" + min);
		System.out.println("S :" + s);
		System.out.println("MS :" + ms);
		
		System.out.println("Millis :"+ millis);
		System.out.println(date);
	}

}
