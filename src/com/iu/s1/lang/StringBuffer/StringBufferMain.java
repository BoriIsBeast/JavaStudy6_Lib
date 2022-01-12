package com.iu.s1.lang.StringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		//iu lee
		StringBuffer sb = new StringBuffer();
		sb.append("iu");
		sb.append("lee");
		
		System.out.println(sb);
		String name = "iu";
		String name2 = "lee";
		name = name + name2;
		System.out.println(name);
	}

}
