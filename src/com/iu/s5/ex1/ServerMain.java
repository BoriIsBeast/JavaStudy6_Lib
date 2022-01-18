package com.iu.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String message = "";
	
	System.out.println("Server 입니다");
	ServerSocket serverSocket = null;
	Socket socket = null;
	try {
		System.out.println("클라이언트 접속을 기다리는 중");
		serverSocket = new ServerSocket(8282);//접속준비
		socket =serverSocket.accept();//client
		System.out.println("접속한 Client와 1:1 연결 완료");
		
		//
		InputStream is = socket.getInputStream();//01 처리
		InputStreamReader ir = new InputStreamReader(is);//char
		BufferedReader br = new BufferedReader(ir);//String
		
		 message = br.readLine();
		
		System.out.println("Client : " + message);
		
		//server에서 클라이언트로 메세지 전송 
		
		System.out.println("Client로 보낼 메세지 입력");
		 message = scanner.nextLine();
		System.out.println(message);//hello -> h, e, l, l, o -> 0과 1로
		
		
		OutputStream os =socket.getOutputStream(); //byte(bit처리)
		OutputStreamWriter ow = new OutputStreamWriter(os);//char(문자처리)
		BufferedWriter bw = new BufferedWriter(ow);
		
		//전송
		bw.write(message + "\r\n");
		//강제로 버퍼 비우기
		bw.flush();
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
