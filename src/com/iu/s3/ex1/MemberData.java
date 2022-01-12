package com.iu.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.s2.util.token.SeasonDTO;

public class MemberData {

	private String data;
	private Scanner sc;
	
	//기본 생성자
	
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-42-";
		this.data = this.data + "id3 - pw3 - name3 - name2@daum.net-17-";
		System.out.println(this.data);
	}
	
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		//삭제하고싶은 Id를 입력 받아서 
		//ArrayList 에서 삭제
		MemberDTO memberDTO = null;
		
		System.out.println("삭제하고싶은 ID를 입력하세요");
		String id = sc.next();
		
		//int index = -1;
		
		for(int i = 0;i<ar.size();i++) {
			if(ar.get(i).getId().equals(id)) {
				//index =i;
				memberDTO = ar.remove(i);
				break;
			}
			
		}
		
		return memberDTO;
	}
	
	
	public void addMember(ArrayList<MemberDTO> ar) {
		
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID입력");
		memberDTO.setId(sc.next());
		System.out.println("PW 입력");
		memberDTO.setPw(sc.next());
		System.out.println("Name입력");
		memberDTO.setName(sc.next());
		System.out.println("Email입력");
		memberDTO.setEmail(sc.next());
		System.out.println("Age입력");
		memberDTO.setAge(sc.nextInt());
		
		//id-pw-name
		String data = "iu-iu-iu-email-30";
		MemberDTO mem2 = new MemberDTO();
		String [] d = data.split("-");
		mem2.setId(d[0]);
		mem2.setPw(d[1]);
		mem2.setName(d[2]);
		mem2.setEmail(d[3]);
		mem2.setAge(Integer.parseInt(d[4]));
		
		
		
		
		
		
		
		
		ar.add(memberDTO);
	}
	
	public void addMembera(ArrayList<MemberDTO> ar) {///////내가한것
		
		//새로 추가할 MemberDTO 생성
		//키보드로 부터 id, pw, name, email, age 입력받아서
		//MemberDTO의 멤버변수 값으로 대입
		//매개변수로 받은 ar에 MemberDTO 추가
		Scanner sc = new Scanner(System.in);
		
		ArrayList<MemberDTO> aa = new ArrayList<>();
		String info = "";
		
		System.out.println("추가할 회원의 정보를 입력하세요");
		System.out.println("id - pw - name - email - age 순");
		
		info = sc.next();
		
		StringTokenizer st = new StringTokenizer(info, "-");
		
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			
			ar.add(memberDTO);
		}
		
	}
	
	public ArrayList<MemberDTO> init() {
		//data 에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		// MemberDTO들을 ArrayList에 담아서 리턴
		
		System.out.println("MemberEx1 Branch");
			
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			
			ar.add(memberDTO);
		}
		
		return ar;
		}
		
		
		
	}
	

