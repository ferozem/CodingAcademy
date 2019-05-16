package com.jpm.spring.emp;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int add(Employee employee) {
		System.out.println("Adding employee records..." +employee);
		return 1;
		
	}

}
