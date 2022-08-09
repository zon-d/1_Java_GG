package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	
	public void practice1() {
		System.out.print("숫자를 한 개 입력하세요 : ");
	
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if (input % 2 == 1 && input > 0 ) {
			System.out.println("홀수 입니다.");
		} 
		
		if (input % 2 != 1 && input > 0) {
			System.out.println("짝수 입니다.");
		}
			
		if (input <0) {
			System.out.println("양수만 입력해주세요.");
		}
			
		String result;
		

		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		double result = (kor + math + eng) / 3;
		
		
		if ( result >= 60 && kor >= 40 && math>= 40 && eng>= 40) {
		
			System.out.println("국어 : " + kor );
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + (kor + math + eng));
			System.out.println("평균 : " + result );
			System.out.println("축하합니다, 합격입니다!");
			
		} else {
			System.out.println("불합격입니다.");
		}
		
			
		
		
		
	
		}
		
		
	
		
		
		
		
		
	

	public void practice3() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		String day;
		
		switch(input) {
		case 1 : case 3 : case  5 : case 7 : case 8 : case 10 : case 12 :  day = "31일"; break;
		case 2 : day = "28일"; break;
		case 4 : case 6 : case 9 : case 11 : day = "30일"; break;
		
		default : day = "잘못 입력된 달입니다.";
				
		System.out.println(input + "월은 " + day + "일까지 있습니다.");
	
		System.out.println(day);
		
		}
		
		
		
		
	}

	public void practice4() {
	
	}

	public void practice5() {
	
	}
}
