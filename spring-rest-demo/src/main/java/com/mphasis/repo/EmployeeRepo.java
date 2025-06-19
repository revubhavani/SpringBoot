package com.mphasis.repo;
 
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
 
import org.springframework.stereotype.Repository;
 
import com.mphasis.bean.Employee;
@Repository
public class EmployeeRepo {
	private Set<Employee> emps;
	
	public EmployeeRepo () {
		emps=new HashSet<Employee>();
		emps.add(new Employee(1001,"bhavani","bhavani@gmail.com",LocalDate.of(2002,07,27),50000));
		emps.add(new Employee(1002,"bhavani1","bhavani1@gmail.com",LocalDate.of(2001,05,18),55000));
		emps.add(new Employee(1003,"bhavani2","bhavani2@gmail.com",LocalDate.of(2001,05,18),50000));
		emps.add(new Employee(1004,"bhavani3","bhavani3@gmail.com",LocalDate.of(2002,03,21),45000));
		emps.add(new Employee(1005,"bhavani4","bhavani4@gmail.com",LocalDate.of(2001,06,15),75000));
	}
	public Set<Employee> getAll() {
		return emps;
	}
}