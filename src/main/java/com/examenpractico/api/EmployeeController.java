package com.examenpractico.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.entity.Employee;
import com.examenpractico.service.EmployeeService;

@RestController
public class EmployeeController {
	
	//private final EmployeeRepository repository;

	private final EmployeeService service;

	  EmployeeController(EmployeeService service) {
	    this.service = service;
	  }
@PostMapping(value ="/addEmployee")
public Employee addEmployee(@RequestBody Employee newEmployee) throws Exception {
	service.addEmployee(newEmployee);
//	if (repository.InsertarEmpleado(newEmployee.getName(), newEmployee.getLast_name(), newEmployee.getBirthdate())!=null) {
//		return repository.save(newEmployee);
//	}
  return newEmployee;
}

@GetMapping("/listEmployee")
public List<Employee> listEmployee() throws Exception {
	
  return null;
}
}
