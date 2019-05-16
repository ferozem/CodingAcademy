package com.jp.hr.service;
import java.util.List;

import com.jp.hr.entities.Employee;
import com.jp.hr.exception.EmployeeException;


public interface IEmployeeService {
	//CRUDS Operation
	public Long addEmployee(Employee employee)throws EmployeeException;//C-create
	public List<Employee> getEmployeeList()throws EmployeeException;//R All Employee -retrieve
	public boolean updateEmployee(Employee employee)throws EmployeeException;//U-update
	public boolean deleteEmployeeById(Long empId)throws EmployeeException;//D-delete
	public Employee getEmployeeById(Long empId)throws EmployeeException;//S-search
}
