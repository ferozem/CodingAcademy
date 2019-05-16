package com.jp.hr.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="EMPLOYEE_HR")
public class Employee {
	@Id
	@SequenceGenerator(name="EMP_GEN", sequenceName ="emp_rest_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_GEN")
	private Long empId;
	
	@NotNull
	@Size(min = 3, max = 20, message="Name not meeting size constraints.")
	@Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters")
	private String firstName;
	
	@NotNull
	@Size(min = 3, max = 20, message="Name not meeting size constraints.")
	@Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters")
	private String lastName;
	
	@NotEmpty(message="Pls submit email address")
	@Email(message="Email not in format")
	private String email;
	
	@Min(value=18, message="Age can not be below 18.")
	@Max(value=60, message="Age can not be more than 60")
	private int age;
	
	@Past(message="The date must before of today")
	private Date dtBirth;
	
	@Future(message="The date must after of today")
	private Date dtRetire;
	
	public Employee(Long empId, String firstName, String lastName) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public Employee(Long empId,
			@NotNull @Size(min = 3, max = 20, message = "Name not meeting size constraints.") @Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters") String firstName,
			@NotNull @Size(min = 3, max = 20, message = "Name not meeting size constraints.") @Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters") String lastName,
			@NotEmpty(message = "Pls submit email address") @Email(message = "Email not in format") String email,
			@Min(value = 18, message = "Age can not be below 18.") @Max(value = 60, message = "Age can not be more than 60") int age,
			@Past(message = "The date must before of today") Date dtBirth,
			@Future(message = "The date must after of today") Date dtRetire) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.dtBirth = dtBirth;
		this.dtRetire = dtRetire;
	}


	public Employee() {
		super();
	}

	
	public Long getEmpId() {  // Property name: empId
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = (long) empId;
	}

//	@Column(name="FIRSTNAME")
	public String getFirstName() {  // firstName
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//	@Column(name="LASTNAME")
	public String getLastName() {	// lastName
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public Date getDtBirth() {
		return dtBirth;
	}

	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}

	public Date getDtRetire() {
		return dtRetire;
	}

	public void setDtRetire(Date dtRetire) {
		this.dtRetire = dtRetire;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + ", dtBirth=" + dtBirth + ", dtRetire=" + dtRetire + "]";
	}


}
