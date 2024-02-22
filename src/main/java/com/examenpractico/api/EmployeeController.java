package com.examenpractico.api;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.po.EmployeePO;
import com.examenpractico.service.EmployeeService;

@RestController
public class EmployeeController {
	
	//private final EmployeeRepository repository;

	private final EmployeeService service;

	  EmployeeController(EmployeeService service) {
	    this.service = service;
	  }
@PostMapping(value ="/addEmployee", consumes={"application/json"})
public EmployeePO addEmployee(@RequestBody EmployeePO newEmployee) throws Exception {
	
	service.addEmployee(newEmployee);
//	if (repository.InsertarEmpleado(newEmployee.getName(), newEmployee.getLast_name(), newEmployee.getBirthdate())!=null) {
//		return repository.save(newEmployee);
//	}
  return newEmployee;
}


}
