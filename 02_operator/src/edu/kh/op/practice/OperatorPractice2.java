package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		
		
		// sc.next() : 한 단어 입력, 띄어쓰기 미포함
		// 			   -> 띄어쓰기, 엔터가 입력 종료를 의미
		
		// sc.nexLine() : 한 문장(한 줄) 입력, 띄어쓰기 포함
		//				-> 엔터가 입력 종료를 의미
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("이름 : ");
		String input1 = sc.next();
		
		System.out.print("학년(정수) : ");
		int input2 = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int input3 = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int input4 = sc.nextInt();
		// 입력버퍼에 엔터가 남음.
		
		sc.nextLine(); // 입력 버퍼 맨 앞에 남은 엔터를 꺼내옴 -> 입력 버퍼를 청소
	
		
		System.out.print("성별(남학생/여학생) : ");
		String input5 = sc.nextLine();
//nextLine// 버퍼에 맨앞에 남은 엔터를 가져옴
		// -> 문자열을 입력하지 못하고 넘어감
		
		// ** 해결 방법 **
		// 입력버퍼 맨앞에 있는 엔터(개행문자)를 제거
		
		// 맨 앞에 엔터(개행문자)가 남는 경우
		// -> next(), nextInt(), nextFloat(), nextDouble() 등...
		//	  nextLine()을 제외한 모두
		//    뒤에 sc.nextLine()을 한번 더 작성하기
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double input6 = sc.nextDouble();
		
		System.out.println( input2 + "학년 " + input4 + "반 " + input3 + "번 " + input1 + " "+ input5 + "의 성적은 " + input6 + "점 입니다.");
	
		
		
	
	}
	
	
	
}
