package com.iu.s3.ex2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentData {

	private String info;

public StudentData() {
	this.info = "name1,1,15,50,60,";
	this.info = this.info + "name2,2,52,68,40,";
	this.info = this.info + "name3,3,8,87,75,";
	
	//학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	//학생의 정보를 추가
	
	
	public ArrayList<StudentDTO> init(){

		
	StringTokenizer st = new StringTokenizer(this.info,",");
	ArrayList<StudentDTO> ar = new ArrayList<>();
	
	while(st.hasMoreTokens()) {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(st.nextToken().trim());
		studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
		studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
		studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
		studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
		
		ar.add(studentDTO);
		
		
	}
	
	return ar;
	}
}
}
