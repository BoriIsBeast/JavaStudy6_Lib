package com.iu.s1.lang.String;

import java.util.Scanner;

public class StringStudy1 {
	
	public void splitTest() {
		
		String name = "iu suji choa 펭수 춘식이";
		
		String [] names = name.split(" ");
		
		for(int i = 0;i<names.length;i++) {
		
			System.out.println(names[i].trim());
		}
	}

	public void valueTest() {

		int num = 1000;
		String result	=String.valueOf(num);
		System.out.println(result);


	}

	public void caseTset() {
		String title = "West Side Story";
		String result1 =title.toUpperCase();
		System.out.println(result1);

		String result2 = title.toLowerCase();
		System.out.println(result2);

	}

	public void replaceTest() {
		String title = "West Side Story";

		String result =title.replace("West", "North");

		System.out.println(title);
		System.out.println(result);

	}

	public void subStringExA() {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String fileName = sc.next();
		String result = fileName.substring(fileName.lastIndexOf("."+1));
		System.out.println(result);

		if(result.equals("jpg") || result.equals("gif") || result.equals("png")) {
			System.out.println("이미지 파일");
		}else if(result.equals("txt") || result.equals("pdf") || result.equals("hwp") ) {
			System.out.println("문서 파일");
		}else if(result.equals("mp3") || result.equals("wav") || result.equals("ogg")) {
			System.out.println("음원 파일");
		}else {
			System.out.println("알수 없는 파일 형식");
		}

	}


	public void subStringEx1() {
		//키보드로부터 업로드할 파일명을 입력 
		// a.text, b.pdf, iu.jpg
		//jpg, gif, png -> 이미지파일입니다 출력
		//txt, pdf, hwp -> 문서 파일입니다 출력
		//mp3, wav, ogg -> 음원 파일입니다 출력
		//나머지는 알 수 없는 파일입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String name = sc.next();
		int i = 0;
		boolean flag = true;

		String[] image = new String[3];
		image[0] = "jpg";
		image[1] = "gif";
		image[2] = "png";

		String[] doc = new String[3];
		doc[0] = "txt";
		doc[1] = "pdf";
		doc[2] = "hwp";

		String[] mus = new String[3];
		mus[0] = "mp3";
		mus[1] = "wav";
		mus[2] = "ogg";
		int com = name.indexOf(".");
		String a = name.substring(com+1); 

		for(i = 0; i<3;i++) {
			if(a.equals(image[i])) {
				System.out.println("이미지 파일입니다.");

			} else if (a.equals(doc[i])) {
				System.out.println("문서 파일입니다.");

			} else if (a.equals(mus[i])) {
				System.out.println("음원 파일입니다.");

			} else 
				flag = false;
			break;

		} if (flag == false) {

			System.out.println("알 수 없는 파일입니다");
		}
	}

	public void subStringTest() {
		String title = "West Side Story";
		String result = title.substring(5);
		String result2 = title.substring(title.indexOf("S"));
		System.out.println(result);
		System.out.println(result2);

		String result3 = title.substring(5,9);
		System.out.println(result3);
	}

	public void lengthTest() {

		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);

		String find = "S";
		//title find 에 들어가있는 글자가 몇개인지 출력

		int count = 0;

		for (int i = 0;i<title.length();i++) {

			int index =title.indexOf(find, i);

			if(index >=0) {
				count ++;
				i = index;
			}else {
				break;

			}
		}
		System.out.println("Count : " + count);


	}

	//한글짜식 출력
	//W
	//e
	//s
	//t
	//		for(int i = 0;i<title.length();i++) {
	//		char print = title.charAt(i);
	//		System.out.println(print);
	//		}




	public void indexofTest() {
		String msg = "hello World";
		int num = msg.indexOf('e'); //""도 가능
		System.out.println(num);

	}

	public void equalTest() {

		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");

		System.out.println(str);

		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);

		System.out.println("==================");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));


	}

	public void study1() {

		String name = "hello";

		//char 메서드 호출 코드 작성
		int i = 0;

		char ch =name.charAt(i);

		System.out.println(ch);







		String name2 = new String("hello2");

		System.out.println(name);
	}
}
