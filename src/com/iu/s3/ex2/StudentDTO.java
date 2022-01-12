package com.iu.s3.ex2;

public class StudentDTO {
private String Name;
private int num;
private int kor;
private int eng;
private int math;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
}
