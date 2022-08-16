package edu.kh.oop.basic;

public class BasicRun {
	
	public static void main(String[] args) {
		
		JJY 정지윤 = new JJY();
		// heap 영역에 JJY 클래스에 정의된 내용을 이용하여
		// JJY 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 정지윤.name);
		System.out.println("나이 : " + 정지윤.age);
		System.out.println("생년월일 : "+ 정지윤.birthday);
		
		// 기능 수행
		정지윤.eat();
		정지윤.study();
		정지윤.plus(50, 100);
		
	}

}
