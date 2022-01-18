package com.iu.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			int num =it.next();
			System.out.println(num);
		}
	}//study4

	public void study3() {
		Random random = new Random();

		HashSet<Integer> Lotto = new HashSet<>();

		boolean check= true;	
		while(check) {
			int num= random.nextInt(45)+1;
			Lotto.add(num);
			if(Lotto.size() == 6) {

				check = false;
			}
		}
		System.out.println(Lotto);
	}

	public void study3_1() {

		Random random = new Random();

		ArrayList<Integer> Lotto = new ArrayList<>();
		//Lotto 번호를 랜덤으로 뽑음
		while(Lotto.size() !=6) {

			int num = random.nextInt(45)+1;
			Lotto.add(num);

		}
		System.out.println(Lotto);
	}


	public void study2() {
		//Random
		Random random = new Random();

		ArrayList<Integer> Lotto = new ArrayList<>();
		//Lotto 번호를 랜덤으로 뽑음
		for(int i = 0; i<6; i++) { //0~10미만의 랜덤한 수 뽑아줌

			int num= random.nextInt(45)+1;
			Lotto.add(num);
		}
		System.out.println(Lotto);
	}

	public void study1() {
		HashSet<Integer> hs = new HashSet<>();

		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);


		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());
	}
}
