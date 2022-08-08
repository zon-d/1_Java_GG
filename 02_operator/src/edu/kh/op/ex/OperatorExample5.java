package edu.kh.op.ex;

public class OperatorExample5 {
	public static void main(String[] args) {
		
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		
		int a = 10;
		
		a++; // 붙여쓰기(띄어쓰기X)
		System.out.println("a를 1 증가 : " + a); // 11
		
		a += 4; // a = a + 4; (띄어쓰기 해도됨)
		System.out.println("a를 4 증가 : " + a); // 15
		
		a -= 10; // a = a - 10;
		System.out.println("a를 10 감소 : " + a ); // 5
		
		a *= 3; // a = a * 3;
		System.out.println("a를 3배 증가 : " + a ); // 15
		
		a /= 6; // a = a / 6
		System.out.println("a를 6으로 나눴을 때의 몫 : " + a); // 2
		
		a %= 2; // a = a % 2
		System.out.println("a를 2로 나눴을 때의 나머지 : " + a ); // 0
		
		
		
		
		
		
	}
	
	
	
}
