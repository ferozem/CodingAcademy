package com.jpm.spring.emp;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	
	
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}



	public int add(Employee employee){
		 return employeeDao.add(employee);
		
	}

}
