package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		for(int a=1; input>=a; a++) {
			System.out.print(a+" ");
		}
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");		
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int a=1; input>=1; input--) {
			System.out.print(input +" ");
		}
		
		if(input >=0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int a=1; a<=input; a++) {
			sum += a;
			System.out.print(a);
			
			if(input>a) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
		
		
	}
		
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		if(input1<1 ||  input2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int a=input1 ; a<=input2; a++) {
				System.out.print(a+ " ");
			}	
			for(int a=input2 ; a<=input1; a++) {
				System.out.print(a+ " ");
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("==== "+input+"단 ====");
	
			for(int a=1 ; a<=9 ; a++) {
				System.out.printf("%d * %d = %d \n", input, a, input*a);
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		/*if( input >=2 && input <=9) {
			
			for(int dan = input ; dan <= 9 ; dan++) {
				
				System.out.println("=====" + dan + "단 =====");
				
				for(int i = 1 ; i<=9 ; i++) {
					System.out.printf("%d X %d = %2d \n", dan, i, dan*i);
				}
				
				System.out.println(); // 단 사이 줄바꿈
			}
			
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		}*/
		
		
		
		
		
		if(input<2 || input>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
			
		}else {
			for(int a=input ; a<=9 ; a++) {
				System.out.println("==== "+a+"단 ====");
			
				for(int b=1 ; b<=9 ; b++) {
					System.out.printf("%d * %d = %d \n", a, b, a*b);
				}
				
				System.out.println();
			}
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) {
			
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=input ; row>=1; row--) {
			
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) {
			
			/* for문을 이용한 풀이
			 * for(int i=input--row ; i>=1 ; i--) {
				
			for(int i = input-1 ; i>= row ; i--) {
				System.out.print(" ");
			}	for(int col=1; col<=row; col++) {
				System.out.print("*");*/
			
			
			//if문을 이용한 풀이
			for(int col=1; col<=input; col++) {
				if(col<=input-row) {
					
					System.out.println(" ");
					
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
//		//위쪽 삼각형
//		for(int row=1 ; row<=input ; row++) {
//			for(int col=1 ; col<=row ; col++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// 아랫쪽 삼각형
//		for(int row=input-1 ; row>=1 ; row--) {
//			for(int col=1 ; col<=row ; col++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int row=1 ; row<=input*2-1 ; row++ ) {
			
			if(row < input) {
				
				for(int col=1 ; col<=row ; col++) {
					System.out.print("*");
				}
			}else {
				for(int col=input ; col>row-input ; col--) {
					System.out.print("*");
				}
			}
					
			System.out.println();
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		for(int col = 1 ; col <= input * 2 - 1 ; ) {
			
			if(input-row>=col || input+row<=col) {
				System.out.println(" ");
			
			}else {
				System.out.println("*");
			}
		}
		
	}
		
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++){
			
			for(int col=1 ; col<=input ; col++) {
				
				// 첫 번째 / 마지막 줄, 칸일 때만 * 출력
				if(row==1 || row==input || col==1 || col==input) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
		
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i=1 ; i<=input ; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i%2==0 || i%3==0) {
				System.out.print( i + " ");
			
				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
				if(i%2==0 && i%3==0) {
					count++;//count 증가
				}
				
			}
		}
		
		System.out.println("\ncount : " + count);
	}
}
