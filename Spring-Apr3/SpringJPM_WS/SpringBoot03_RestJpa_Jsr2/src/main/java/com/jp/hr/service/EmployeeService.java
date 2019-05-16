package com.jp.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.hr.dao.IEmployeeDao;
import com.jp.hr.entities.Employee;
import com.jp.hr.exception.EmployeeException;
import com.jp.hr.service.IEmployeeService;


@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao employeeDao;
	

	@Override
	@Transactional
	public Long addEmployee(Employee employee) throws EmployeeException {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeList() throws EmployeeException {
		return employeeDao.getEmployeeList();
	}

	@Override
	@Transactional
	public boolean updateEmployee(Employee employee) throws EmployeeException {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	@Transactional
	public boolean deleteEmployeeById(Long empId) throws EmployeeException {
		return employeeDao.deleteEmployeeById(empId);
	}

	@Override
	public Employee getEmployeeById(Long empId) throws EmployeeException {
		return employeeDao.getEmployeeById(empId);
	}

}
