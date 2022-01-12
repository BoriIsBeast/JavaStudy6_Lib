package com.iu.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄,16,여름,32, 가을,20, 겨울,-15";

		//String [] s = str.split(","); //스플릿도 가능

		StringTokenizer st = new StringTokenizer(str); //봄,16,여름,25 이런식 데이터면 토크나이저가 더 편함

		//StringTokenizer st = new StringTokenizer(str,","); 주석가능

		ArrayList<SeasonDTO> ar = new ArrayList<SeasonDTO>();
		
		
		
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();

			String token =st.nextToken(",").trim();
			//String token =st.nextToken();     주석 가능

			seasonDTO.setName(token);//봄

			token = st.nextToken();//16

			seasonDTO.setGion(Integer.parseInt(token.trim()));		
			
			ar.add(seasonDTO);
			
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getGion());

		}
		for(int i = 0;i<ar.size();i++) {
			SeasonDTO seasonDTO =ar.get(i);
		
			System.out.println(seasonDTO.getName());
			System.out.println(ar.get(i).getGion());
			
		}
	}
}
