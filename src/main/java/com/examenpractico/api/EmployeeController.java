package com.examenpractico.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.entity.Employee;
import com.examenpractico.service.EmployeeService;

@RestController
public class EmployeeController {
private final EmployeeService employeeService;

EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

@PostMapping("/addEmployee")
Employee newEmployee(@RequestBody Employee newEmployee) throws Exception {
  return employeeService.saveEmployee(newEmployee);
}

}
