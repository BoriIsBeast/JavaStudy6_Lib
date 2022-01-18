package com.iu.s2.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {    
	
	private final int NUM = 1;
	
	public List<String> study5() {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		return list;
		
		
	}
	public void study4() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		
		System.out.println(list.get(0));
	}
	
	
	public void study3() {
		
		//ArrayList<E> 변수명 = new Arrayist<E>();
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		//add(E e)
		ArrayList<String> ar3 = new ArrayList<String>();
		
		
		ArrayList<Object> ar = new ArrayList<Object>();//< > 기본값이 Object , ex)Integer.. 등등
		
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("iu");
		
		for(int i = 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		Object obj = 1;
		//obj = "iu";
		int n =(Integer)obj;
		
		int num = (int)ar.get(0);
		String name = (String)ar.get(3);
	}
	
	public void study2() {
		
		ArrayList ar = new ArrayList();
		int num = 1;
		Integer n = num;
		ar.add(n); //autoBoxing 다형성
		ar.add(1);//autoBoxing 다형성
		
		ar.add('a');//autoBoxing 다형성
		
		ar.add(3.12);//autoBoxing 다형성
		
		ar.add("name");//다형성
		
		String k = "iu"; //String is a Object
		Object obj = k; //다형성
	}

	
	public void study1() {
		int [] numbers = new int [2];
		ArrayList ar = new ArrayList();
		
	//대입
		numbers[0] = 1; //칸 고정
		numbers[1] = 2;
		
		ar.add(1); //0     //넣고싶은만큼 넣을수 있다
		ar.add(2);//1
		ar.add(3);//2
		ar.add(1, 100);   // 1 100 2 3 순으로 처리됨
	    ar.set(0, 2000);    // 2000 100 2 3  //수정
	    ar.remove(0);  // 100 2 3 
	    ar.clear();
	    
		
		System.out.println(numbers[0]);
		//System.out.println(ar.get(0));
		
		for(int i = 0;i<numbers.length;i++) { //배열
			System.out.println(numbers[i]);
			
		}
		System.out.println("list출력");
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
	}
}
