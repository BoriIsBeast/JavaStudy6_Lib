package com.iu.s3.ex2;

import java.util.ArrayList;

public class StudentMain {
public static void main(String[] args) {
	StudentData studentData = new StudentData();
	
	ArrayList<StudentDTO> students = studentData.init();
	
	for(int i= 0;i<students.size();i++) {


		System.out.println(students.get(i).getName());
		System.out.println(students.get(i).getNum());
		System.out.println(students.get(i).getKor());
		System.out.println(students.get(i).getEng());
		System.out.println(students.get(i).getMath());
		System.out.println("============================");
	}
}
}
