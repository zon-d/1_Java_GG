package edu.kh.emp.run;

import edu.kh.emp.model.view.EmployeeView;
import edu.kh.emp.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		
		Employee service = new Employee();
		
		new EmployeeView().displayMenu();
		
		
		
	}

}
