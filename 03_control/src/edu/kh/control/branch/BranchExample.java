package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {
	
	// break 문 : 가장 가까운 반복문을 빠져 나가는 구문
	
	for(int i=1 ; i<=10000 ; i++) {
		
		System.out.println(i);
		
		if(i == 20) {
			break;
			
		}
	
		
		System.out.println("-----------------");
	
		for(int row = 1 ; row <= 5 ; row++) {
			
			for(int col=1; col<=100 ; col++) {
				
				System.out.printf("(%d , %d) ", row, col);
				
				if(col == 3) {
					break;
				}
			}
			
			System.out.println();
			
			if(row == 3) {
				break;
			}
		}
	}
}
	
	


	public void ex2() {
		
		// 0이 입력될 때 까지의 입력된 정수의 합
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) { // 조건식에 강제로 true 작성 == 무한 반복
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			sum += input; //누적
			
		}
		
		System.out.println("합계 : " +sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다.
			
	}


	public void ex3() {
		
		// "exit@" 문자열이 입력될 때까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; // 빈 문자열
		
		System.out.println("--- 문자열 입력 (종료 시 exit@ 입력) ---");
		while( true ) {
			
			String input = sc.nextLine(); // 한 줄 입력
			
			// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다
			// -> String은 기본 자료형 X, 참조형 0
			
			// -> 참조형은 A.equals(B) 값을 비교할 수 있다!
			
			// A.equals(B)    A == B
			if(input.equals("exit@")) {
				break;
			}
			
			str += input + "\n"; // 누적하면서 줄 바꿈
		}
		
		System.out.println(str);
		
		
		
	}
}


		
	


	
	

