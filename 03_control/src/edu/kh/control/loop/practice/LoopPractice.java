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
			
			for(int col=1; col<=row; col++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
	}
	
	public void practice12() {}
	
	public void practice13() {}
	
	public void practice14() {}
	
	public void practice15() {}
	
}
