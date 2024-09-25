package com.examenpractico.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenpractico.entity.Employee;
import com.examenpractico.repository.EmployeeRepository;
import com.examenpractico.service.EmployeeService;





@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	 
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> searchEmployeeByNameAndLastName(String name, String lastName) {
				
		return employeeRepository.findEmployeeByNameAndLastName(name, lastName);
	}

	@Override
	public Optional<Employee> findEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public List<Employee> findEmployeeJobId(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeeByJob(id);
	}

	@Override
	public List<Employee> findEmployeesBySalaryRange(double min, double max, String order, int size) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeesBySalaryRange(min, max);
	}
	

}
