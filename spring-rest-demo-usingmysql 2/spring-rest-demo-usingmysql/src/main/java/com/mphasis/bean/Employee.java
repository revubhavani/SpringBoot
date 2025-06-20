package com.mphasis.bean;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity
public class Employee {
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//generates value automatically
	private int empid;
	private String name;
	private String email;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	@Column(name = "DateOfBirth")
	private LocalDate dob;
	private double salary;
	private String city;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, LocalDate dob, double salary, String city) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.salary = salary;
		this.city = city;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
