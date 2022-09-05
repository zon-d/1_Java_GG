package edu.kh.network.client.model.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class ClientService {
	
	public void clientStart() {
	
		
//	1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		
		String serverIP = "127.0.0.1"; // loop back IP (현재 컴퓨터를 나타내는 IP)
		int port = 8500;
		
		Socket clientSocket = null;
		
		InputStream is =null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("[Client]");
			
			clientSocket = new Socket(serverIP, port);
			// UnknownHostException : IP가 잘못 되었을 때 발생하는 예외
			
		
//	2. 서버와의 입출력 스트림 오픈
		
		if(clientSocket != null) { // 서버와 연결이 성공한 경우
			
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
		}
		
//	3. 보조 스트림을 통해 성능 개선
		br = new BufferedReader(new InputStreamReader(is));
		pw = new PrintWriter(os);
		
//	4. 스트림을 통해 읽고 쓰기
		
		String serverMessage = br.readLine();
		// 서버 -> 클라이언트에게 보낸 메세지를 저장
		
		// 서버로 부터 받은 메세지 화면에 출력
		System.out.println(serverMessage);
		
		// 클라이언트 -> 서버로 메세지 전송
		Scanner sc = new Scanner(System.in);
		
		System.out.print("서버로 전달할 메세지 : ");
		String str = sc.nextLine();
		
		pw.println(str); // 메세지를 서버쪽으로 출력
		pw.flush(); // 스트림 내용 밀어내기
		
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
		
		
//	5. 통신 종료
			
		}
	}
}



/*
 * SUPER참조변수 : 자식객체 내부의 부모객체 참조
 * SUPER()생성자 : 자식클래스 첫 번째 줄에 작성되는 생성자
 * 
 * 접근제한자
 * PUBLIC : 전체
 * (DEFAULT) : 같은 패키지
 * PRIVATE : 해당 클래스
 * 
 * STATIC : 정적메모리 영역, 입력된 메소드가 클래스, 필드 형식으로 할당
 * 
 * FINAL 필드 : 상수
 *      메서드 : 오버라이딩 불가
 *      클래스 : 상속불가
 *      
 * 자동 생성구문
 * RETURN, TOSTRING(), THIS, 기본생성자
 * 
 * THIS참조변수  : 생성되는 모든 인스턴스 내부에 숨겨진 참조변수
 * THIS()생성자 :  같은 클래스 내 다른 생성자 호출시 사용 
 * 
 * 프로토콜
 * 컴퓨터끼리 데이터를 주고받기위해 정해놓은 통신규약
 * 
 * 서버
 * 서비스를 제공하는 컴퓨터 또는 프로그램
 * 
 * 예외처리문
 * TRY~CATCH~FINALLY
 * TRY구문에서 발생한 예외를 CATCH구문에서 처리함
 * THROWS
 * 예외를 호출한 메서드로 던짐
 * 
 * FINAL
 * 필드 : 상수
 * 메서드 : 오버라이딩불가
 * 클래스 : 상속불가
 * 
 * SUPER참조변수 자식객체 내부의 부모객체를 참조
 * SUPER()생성자 클래스 내 첫번째 줄에 작성되는 예약어
 * 
 * THIS 참조변수 인스턴스 내부에 숨겨진 참조변수
 * THIS()생성자 같은 클래스내 다른 생성자를 호출하기 위한 생성자
 * 
 * UPCASTING 자식타입의 객체를 참조하는 부모타입 참조변수
 * DOWNCASTING UPCASTING 상태의 부모타입 참조변수를 자식 타입으로 형변환하는 것. 자식멤버 모두 참조가능
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 */