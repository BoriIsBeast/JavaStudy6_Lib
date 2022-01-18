package com.iu.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
 
		public void study1(){
			//HashMap
			HashMap<String, Integer> map = new HashMap<>();
			
			//put
			map.put("f1", 1);
			map.put("f2", 2);
			map.put("f3", 1);
			
			System.out.println(map);
			
			int num = map.get("f2");
		System.out.println(num);
		
		map.remove("f3");
		System.out.println(map);
		
		map.put("f1", 100);
		
		System.out.println(map);
		
		//없는 키로 꺼내면 ?
		Integer n = map.get("test"); //null 이 나올수도 있으므로 Integer 타입이라고 명시해주는게 좋다
		System.out.println(n);
		
		String name = "k5";
		map.put(name,  n);
		
	    map.clear();
	    
	    System.out.println(map);
		}
}
