package com.mphasis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.bean.Employee;
import com.mphasis.repo.IEmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private IEmployeeRepo irepo;
	
	public List<Employee> getAllEmployees(){
		return irepo.findAll();
	}
	
	public Employee creatEmployee(Employee e) {
		Employee emp=irepo.saveAndFlush(e);
		return emp;
	}
	
	public Employee fetchEmployeeById(int empid) {
		Optional<Employee> op= irepo.findById(empid);
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
	public Employee updateEmployee(Employee e) {
		if(fetchEmployeeById(e.getEmpid())!=null) {
			return irepo.saveAndFlush(e);
		}
		else {
			return null;
		}
	}
	public boolean deleteEmployee(int empid) {
		if(fetchEmployeeById(empid)!=null) {
			irepo.deleteById(empid);
			return true;
		}
		else {
			return false;
		}
	}
	public List<Employee> fetchEmployeeByCity(String city){
		return irepo.findByCity(city);
	}
	public List<Employee> fetchEmployeeByName(String name){
		return irepo.findByName(name);
	}
	public List<Employee> fetchEmployeeByNameAndCity(String name, String city){
		return irepo.findByNameAndCity(name, city);
	}
}
