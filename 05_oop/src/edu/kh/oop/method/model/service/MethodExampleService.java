package edu.kh.oop.method.model.service;

// 기능 제공용 클래스
public class MethodExampleService {
	
	// 메서드는 이름 뒤에 ()가 있다!
	
	// 필드
	private int num;
	
	// 생성자
	public MethodExampleService() {} // 생성자도 메서드다!
	
	// 1. 매개변수 X, 반환형 X 메서드
	public void method1() {
		
		System.out.println("method1() 실행");
		
		int a = 10;
		int b = 20;
		
		System.out.println("a + b = " + (a+b));
	}

}
