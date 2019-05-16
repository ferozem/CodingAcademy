package com.smita.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/*CREATE Table emp_rest(
employee_id numeric(6) primary key,	
name varchar(30),
salary numeric(6,2));*/

@Entity
@Table(name="emp_rest")
public class Employee {
	
	@Id
	@SequenceGenerator(name="EMP_GEN", sequenceName ="emp_rest_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_GEN")
	@Column(name="employee_id")
	private Long employeeId;
	
	@NotNull
	@Size(min=3, max=30, message="Emp name is null")
	@Pattern(regexp="[a-zA-Z]*", message ="Emp name should be only characters")
	private String name;
	
	@Min(value=3, message="Employee Salary should be min 3 digits")
	@Max(value=8, message="Employee Salary should be max 8 digits")
	private Double salary;
	

	public Employee() {
		
	}
	public Employee(Long employeeId, String name, Double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
