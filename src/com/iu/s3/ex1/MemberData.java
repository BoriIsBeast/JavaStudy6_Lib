package com.iu.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.iu.s2.util.token.SeasonDTO;

public class MemberData {

	private String data;
	
	//기본 생성자
	
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-42-";
		this.data = this.data + "id3 - pw3 - name3 - name2@daum.net-17-";
		System.out.println(this.data);
	}
	
	public ArrayList<memberDTO> init() {
		//data 에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		// MemberDTO들을 ArrayList에 담아서 리턴
		
		System.out.println("MemberEx1 Branch");
			
			

		}
		
		
		return ;
	}
	
}
