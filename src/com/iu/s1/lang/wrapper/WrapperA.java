package com.iu.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperA {
	private Scanner sc;


	public void ex2() {
		this.sc = new Scanner(System.in);	


		System.out.println("주민번호 입력");

		String jumin = sc.next();

		System.out.println(jumin);
		String result  ="";
		int source =2;
		int sum = 0;
		for(int i = 0;i<jumin.length()-1;i++) {


		
			if(result.equals("-")){

				continue;
			}


			result = jumin.substring(i, i+1);
			System.out.println(Integer.parseInt(result));

		}
		//---------------------------------------
		for(int i = 0;i<jumin.length()-1;i++) {
			if(source>9) {
				source =2;
			}
			char ch = jumin.charAt(i);
			
			if(ch!= '-') {
				int num = Integer.parseInt(String.valueOf(ch));
			sum = sum + num*source;
			source++;
			}
		}//for 끝
		System.out.println(sum);
		
		sum = sum%11;
		
		sum = 11-sum;
		
		if(sum>9) {
			sum = sum%10;
		}
		int check = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		
		if (sum ==check) {
			System.out.println("OK");
			
		}else {
			System.out.println("FAil");
			
		}
	}

	public void ex1() {
		this.sc = new Scanner(System.in);
		System.out.println("주민번호 입력");

		String jumin = sc.next();

		System.out.println(jumin);

		int age = 0; 
		int year = 0;

		//--------연도 파싱------------
		String y = jumin.substring(0,2);

		year = Integer.parseInt(y);




		//-----------성별 파싱-----------
		String s =jumin.substring(7,8);
		char ss = jumin.charAt(7);

		if(s.equals("1") || s.equals("2")){


		}

		int preYear = 2000;

		if(ss == '1' || ss =='2') {

			preYear = 1900;
		}

		year = preYear + year;

		age = 2022 - year+1;

		System.out.println("Age : " +age);

		String se = "Woman";
		if(ss%2 ==1) {
			se= "Man";

		}

		System.out.println(" 성별 : " + se);

		String result = "";
		int season = Integer.parseInt(jumin.substring(2, 4));

		if(season>= 3 &&season <=5) {
			result = "봄";


		}else if (season >=6 && season<=8) {
			result = "여름";

		} else if (season >=9 && season<=11) {
			result = "가을";
		}else {
			result = "겨울";
		}
		System.out.println(result);
	}



}
