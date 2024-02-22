package com.examenpractico.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examenpractico.po.EmployeeWorkedHoursPO;
import com.examenpractico.service.EmployeeWorkedHoursService;
@RestController
public class EmployeeWorkedHoursController {
	private final EmployeeWorkedHoursService service;

	public EmployeeWorkedHoursController(EmployeeWorkedHoursService service) {
		this.service= service;
	}
	
	@PostMapping(value ="/addHours")
	EmployeeWorkedHoursPO newEmployee(@RequestBody EmployeeWorkedHoursPO newEmployeeWorkedHoursPO) throws Exception {
	
	  return service.addWorkedHours(newEmployeeWorkedHoursPO);
	}
}
