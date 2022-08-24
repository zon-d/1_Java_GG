package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.HGD;
import edu.kh.poly.ex2.model.vo.HSH;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractionService {
	
	public void ex1() {
		
		// 추상 클래스는 정말로 객체 생성이 안될까?
		//Animal a = new Animal(); // Cannot instantiate the type Animal
		// -> 진짜 안되네 ...
		
		// Animal을 상속 받은 자식 클래스를 이용해 객체 생성
		
		Fish f1 = new Fish();
		f1.setType("어류"); // 자식 객체 내부에 부모 부분이 있음을 확인
//		f1.breath();
		
		Person p1 = new Person();
		p1.setType("포유류"); // 자식 객체 내부에 부모 부분이 있음을 확인
		
		// 추상 클래스는 부모 타입의 참조 변수로 사용할 수 있다!
		// -> 다형성의 업캐스팅
		
		Animal a1 = new Fish();
		Animal a2 = new Person(); // 업캐스팅 확인
		
		// 추상 메서드였던 breath() 호출 가능 여부 확인
		
		a1.breath();
		a2.breath();
		// 실행 전에는 Animal의 breath()와 연결 된 것으로 보임 (정적 바인딩)
		// 실행 중 오버라이딩한 자식의 breath()로 연결됨(동적 바인딩)
		// -> 동적 바인딩에 의해 정상 수행될 것을 알기 때문에 에러 X
		
		// 객체배열 + 추상 클래스
		Animal[] arr = new Animal[3]; // Animal 참조 변수 3개 묶음
		
		arr[0] = new Person();
		arr[1] = new Fish();
		arr[2] = new Person();
		
		System.out.println("---------------------------");
		
		// arr[i] 인덱스에 어떤 Animal 자식 객체가 있는지 모르지만
		// 다들 강제 오버라이딩한 breath()라는 공통적인 메서드를
		// 가지고 있으므로 arr[i].breath(); 작성 가능
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i].breath();
		}
		
		Animal aaa = new Animal() {
			@Override
			public void breath() {
				
			}
		};
		
	}
	
	public void ex2() {
		
		// 인터페이스는 미완성 메서드로만 이루어져 있어서 직접 객체 생성이 불가
//		KH k1 = new KH(); // KH cannot be resolved to a type
		
		// 상속 받은 자식 클래스르 이용해서 생성
		HSH sh1 = new HSH();
		
		HGD gd1 = new HGD();
		
		sh1.lesson();
		gd1.lesson();
		
		// 클래스/추상 클래스를 상속한 자식 객체는
		// 내부에 부모 객체를 포함하고 있으나
		
		// 인터페이스를 상속한 자식 객체는
		// 부모 객체를 포함하지 않는다.
		
		
	}

}
