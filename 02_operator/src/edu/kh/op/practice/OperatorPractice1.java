package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {
	public static void main(String[] args) {
		

		
		Scanner sc  = new Scanner(System.in);

		
		System.out.print("사탕 개수 : ");
		int input1 = sc.nextInt();
	
		System.out.print("인원 수 : ");
		int input2 = sc.nextInt();
		
		
				
		System.out.println("1인당 사탕 개수 : " + input1/input2);
		
		int result1 = (input1/input2);
		int result2 = (input1 - (result1*input2)) ;
		
					
					
		System.out.println("남는 사탕 개수 : " + result2 );
		
	}
	
	
	
}
