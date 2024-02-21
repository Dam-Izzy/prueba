package com.examenpractico.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.entity.EmployeeWorkedHours;
import com.examenpractico.repository.EmployeeWorkedHoursRepository;
@RestController
public class EmployeeWorkedHoursController {
	private final EmployeeWorkedHoursRepository employeeWorkedHoursRepository;

	public EmployeeWorkedHoursController(EmployeeWorkedHoursRepository employeeWorkedHoursRepository) {
		this.employeeWorkedHoursRepository= employeeWorkedHoursRepository;
	}
	
	@PostMapping(value ="/addHours")
	EmployeeWorkedHours newEmployee(@RequestBody EmployeeWorkedHours newEmployeeWorkedHours) throws Exception {
	
	  return employeeWorkedHoursRepository.save(newEmployeeWorkedHours);
	}
}
