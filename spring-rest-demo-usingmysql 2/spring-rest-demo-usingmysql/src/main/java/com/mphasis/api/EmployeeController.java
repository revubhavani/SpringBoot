package com.mphasis.api;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.bean.Employee;
import com.mphasis.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@GetMapping
	public List<Employee> getAllEmps(){
		return service.getAllEmployees();
	}
	@PostMapping
	public Employee creteEmp(@RequestBody Employee e) {
		return service.creatEmployee(e);
	}
	@GetMapping("/empid/{empid}")
	public Employee getEmployeeById(@PathVariable int empid) {
		return service.fetchEmployeeById(empid);
	}
	@PutMapping
	public Employee updateEmploy(@RequestBody Employee e) {
		return service.updateEmployee(e);
	}
	@DeleteMapping("/delete/{empid}")
	public String deleteEmploy(@PathVariable int empid) {
		if(service.deleteEmployee(empid)) {
			return empid+"\t"+"Deleted.";
		}
		else {
			return empid+"\t"+"Not Deleted.";
		}
	}
	@GetMapping("/city/{city}")
	public List<Employee> getEmployeeByCity(@PathVariable String city){
		return service.fetchEmployeeByCity(city);
	}
	@GetMapping("/name/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name){
		return service.fetchEmployeeByName(name);
	}
	@GetMapping("/nameandcity/{name}/{city}")
	public List<Employee> getEmployeeByNameAndCity(@PathVariable String name,@PathVariable String city){
		return service.fetchEmployeeByNameAndCity(name, city);
	}
}
