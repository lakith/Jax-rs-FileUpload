package com.advance_jersey_app_3.app.jdbcConnection.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int emp_id=0;
	
	@Column
	@NotBlank (message = "Name cannot be null")
	@NotNull(message = "Name cannot be null")
	String name;

	@Column
	@NotBlank (message = "Email cannot be null")
	@Email
	@Pattern(regexp ="[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}",message = "pattern missmatch")
	@NotNull(message = "Email cannot be null")
	String email;
	
	@Column
	@NotBlank (message = "Telephone number cannot be null")
	@NotNull(message = "Telephone number cannot be null")
	String tel_no;
	
	@Column
	@NotBlank (message = "Address cannot be null")
	@NotNull(message = "Address cannot be null")
	String Address;

	@Column
	@NotBlank(message = "age cannot be blank")
	@NotNull(message = "age cannot be blank")
	int age;
	
	
	
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, String tel_no, String address,
			int age) {
		
		this.name = name;
		this.email = email;
		this.tel_no = tel_no;
		Address = address;
		this.age = age;
	}
	public Employee(String name, String email, String tel_no, String address,
			int age, int emp_id) {
		
		this.name = name;
		this.email = email;
		this.tel_no = tel_no;
		Address = address;
		this.age = age;
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel_no() {
		return tel_no;
	}
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	
}
