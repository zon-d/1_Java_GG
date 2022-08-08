package edu.kh.op.practice;

import java.util.Scanner;


public class OperatorPractice4 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
	
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
	
		System.out.println("합계 : " + (input1 + input2 + input3));
		System.out.println("평균 : " + (input1 + input2 + input3)/3);
		
		
		System.out.println("--------------------------------------------");
		
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
	
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		
		
		// 합계를 저장하기 위한 변수
		int sum = kor + eng + math;
		
		// 평균을 저장하기 위한 변수
		double avg = sum / 3.0;
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ?
				"합격" : "불합격";
		
		System.out.println(result);
		
		
		
	}	
}
