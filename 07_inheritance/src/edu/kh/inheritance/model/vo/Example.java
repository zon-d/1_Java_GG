package edu.kh.inheritance.model.vo;

import edu.kh.inheritance.model.vo.Student;

public class Example {
	
	public void ex1() {
		
	// Student 자식 객체 생성
	Student s1 = new Student();
		
	// 자식만의 기능/필드 (grade, classRoom)
	s1.setGrade(2);      //setGreade(int grade) : void - Student (Studentd의 메서드)
	s1.setClassRoom(3); // - Student (Student의 메서드)
	
	s1.setName("김개똥"); // setName(String name) : void - Person (Person의 메서드)
					  // -> 부모인 Person으로 부터 상속 받은 메서드라는 뜻
	
	s1.setAge(15);
	
	
	// int edu.kh.inheritance.model.vo.Student.getGrade()
	System.out.println(s1.getGrade());
	System.out.println(s1.getClassRoom());
	
	//String edu.kh.inheritance.model.vo.Person.getName()
	System.out.println(s1.getName());
	System.out.println(s1.getAge());
	}

}
