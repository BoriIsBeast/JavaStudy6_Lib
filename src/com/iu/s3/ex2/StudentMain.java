package com.iu.s3.ex2;

public class StudentMain {
public static void main(String[] args) {
	StudentData studetnData = new StudentData();
	
	ArrayList<StudentDTO> students = StudentData.init();
	
	for(int i= 0;students.size();i++) {


		System.out.println(students.get(i).getId());
		System.out.println(students.get(i).getPw());
		System.out.println(students.get(i).getName());
		System.out.println(students.get(i).getEmail());
		System.out.println(students.get(i).getAge());
		System.out.println("============================");
	}
}
}
