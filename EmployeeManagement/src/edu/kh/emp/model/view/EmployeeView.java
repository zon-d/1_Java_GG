package edu.kh.emp.model.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.emp.model.vo.Employee;

public class EmployeeView {
	
	private Scanner sc = new Scanner(System.in);
	private Employee service = new Employee();
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			try {
				System.out.println("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				switch(input) {
				case 1 : addEmployee() ; break;
				case 2 : break;
				case 3 : break;
				case 4 : break;
				case 5 : break;
				case 6 : break;
				case 7 : break;
				case 8 : break;
				case 0 : break;
				}
				
				System.out.println();
				
			} catch(InputMismatchException e) {
				System.out.println("[error] 입력 형식이 유효하지 않습니다.\n");
				input = -1;
				sc.nextLine();
			}
			
		}while(input != 0);
	}
	
	public void addEmployee() {
		System.out.println("===== 사원 정보 추가 =====");
		
		System.out.print("사원 번호(사번) : ");
		int empId = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		String empName = sc.next();
		
		System.out.print("주민등록번호 : ");
		String empNo = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("직급명 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		if(service.addEmployee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("[추가 완료]");
		}else {
			System.out.println("[error] 사원 정보 추가 실패");
		}
		
	}
	
	public void viewEmployee() {
		System.out.println("===== 전체 사원 정보 조회 =====");
		
		List<Employee> eplList = service.get
		
		 System.out.println();
		
		
	}
	
	public void findEmployee() {
		System.out.println("====== 사번이 일치하는 사원 정보 조회 =====");
		
	}
	
	
	
	
	
	

}
