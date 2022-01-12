package com.iu.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {

	public void ex1() {
		//키보드로 부터 주민등록번호 입력 받고
		// 991224-1234567
		// 나이를 대충 계산 현재년도 -출생년도
		//남자 ? 여자 

		//3~5월생 : 봄에 태어난사람
		//6~8월생 : 여름 태어난사람
		//9~ 11 : 가을 태어난사람
		//12~3 : 겨울

		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록 번호를 입력하세요.");

		String Id = sc.next();

		System.out.println(Id);

		String num =Id.substring(0, 2);

		int age =2022 -(1900+Integer.parseInt(num));

		System.out.println("나이는 : " +age);


		String a = Id.substring(7,8);

		int sex = Integer.parseInt(a);



		if(sex == 1) {
			System.out.println("남성입니다");

		} else if (sex ==2) {
			System.out.println("여성입니다.");

		}

	}//ex1 메서드

	public void ex2() {
		//키보드로부터 주민등록 번호 입력
		// 9  7 1 2  2  4 - 1 2  3  4 5  6 7  - 마지막 번호는 체크용 번호
		//* 2  3 4 5  6  7 - 8 9  2  3 4  4
		//18 21 4 10 12 28  8 18 6 12 20 24 
		// 결과를 모두 더함 ex) 122

		//2. 모두 더한 결과값을 11로 나누어서 나머지를 구함 
		//    122/11    -> 11 ... 1

		//3. 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 값을 같은지 비교
		//  11-1 = 10 == 7
		//4. 만약에 결과값이 두자리면 결과값을 다시 10으로 나누어서 그 나머지 값을 
		// 체크용 번호랑 같은지 비교  
		// 10 / 10 --- 0 == 7
		//같으면 정상적인 주민번호 , 아니면 잘못된 번호
		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록 번호를 입력하세요.");

		String Id = sc.next();
		
		String[] checks = new String[15];
		for(int i =0; i<checks.length;i++) {
			
			if(i == 6) {
				continue;
			}
			checks[i] = Id.substring(i,i+1);
			
		}
		
		int result0 = Integer.parseInt(checks[0])*2;
		int result1 = Integer.parseInt(checks[1])*3;
		int result2 = Integer.parseInt(checks[2])*4;
		int result3 = Integer.parseInt(checks[3])*5;
		int result4 = Integer.parseInt(checks[4])*6;
		int result5 = Integer.parseInt(checks[5])*7;
		
		int result7 = Integer.parseInt(checks[7])*8;
		int result8 = Integer.parseInt(checks[8])*9;
		int result9 = Integer.parseInt(checks[9])*2;
		int result10 = Integer.parseInt(checks[10])*3;
		int result11 = Integer.parseInt(checks[11])*4;
		int result12 = Integer.parseInt(checks[12])*4;

		int sum = result0 + result1 +result2 +result3 +result4 +result5
				+result7 +result8 +result9 + result10 +result11 + result12;
		 
		int surplus = sum%11;
		
		int check =11-surplus; 
		
		int cn = Integer.parseInt(checks[13]);
		
		int check2 = check/10;
		if(check != cn) {
			if(check2 > 1) {       
				if(check2 ==cn) {
					System.out.println("정상입니다");
					
				}else 
					System.out.println("잘못된 주민번호입니다.");
				
				
				
			}
			
			
		} else System.out.println("정상입니다");
		
			 
		
		
		
		
	}
}
