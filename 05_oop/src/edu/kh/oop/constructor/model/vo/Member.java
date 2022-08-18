package edu.kh.oop.constructor.model.vo;

public class Member { 
	
	// 추상화 -> 아이디, 비밀번호, 전화번호, 나이
	// 캡슐화 -> 추상화 결과를 묶고, 데이터 직접 접근을 제한
	
	// 필드(== 멤버 변수)
	private String memberId;
	private String memberPw;
	private String memberPhone;
	private int memberAge;
	
	public Member() {
	
	// 생성자 사용 목적 1. 필드 초기화
	memberId = "member01";
	memberPw = "pass01!";
	memberPhone = "010-1234-1234";
	memberAge = 25;

	// 생성자(객체를 생성할 때 사용하는 기능)
	
	// 생성자 작성 규칙 1. 클래스명 == 생성자명
	// 생성자 작성 규칙 2. 반환형 X

	// 기본 생성자 : () 내에 아무것도 없는 생성자
	//          --> 매개변수가 없는 생성자
	
	// 생성자 사용 목적 2. 객체 생성 시 특정 기능 수행
	System.out.println("Member 객체가 생성 되었습니다.");
	
	
	// 한번 만들어둔 생성자를 계속 재사용
	// -> 코드길이 감소, 재사용성 증가
	}

	// 기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다!
	// -> 클래스에 생성자가 하나도 작성되지 않으면
	//    컴파일러가 자동으로 기본 생성자를 추가해준다!
	//    public Member(){} // Member 클래스에 자동 추가

	// 생성자
		
	public Member(String memberId, String memberPw, String memberPhone, int memberAge) {
					// -> 매개 변수(Parameter) 
					// * 매개 : 둘 사이에 관계 형성
		
		System.out.println(memberId);
		System.out.println(memberPw);
		System.out.println(memberPhone);
		System.out.println(memberAge);
		
	}
		
		
		
		
	// 메서드(기능)
	

}
