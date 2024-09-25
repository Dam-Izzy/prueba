package com.examenpractico.service;




import java.util.List;
import java.util.Optional;


import com.examenpractico.entity.Employee;



public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public List<Employee> searchEmployeeByNameAndLastName(String name, String lastName);
	public Optional<Employee> findEmployeeById(Long id);
	public List<Employee> findEmployeeJobId(Long id);
	List<Employee> findEmployeesBySalaryRange(double min, double max, String order, int size);

}
