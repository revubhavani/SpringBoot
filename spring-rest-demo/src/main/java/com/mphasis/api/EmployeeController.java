package com.mphasis.api;
import java.time.LocalDate;
import java.util.Set;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.mphasis.bean.Employee;
import com.mphasis.repo.EmployeeService;
 
 
@RestController
@RequestMapping("employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public Set<Employee> getAllEmp(){
		return service.getallEmployees();
	}
	@GetMapping("/{eid}")
	public Employee getEmpById(@PathVariable int eid){
		return service.getEmployee(eid);
	}
	
	
}