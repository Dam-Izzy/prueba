package com.examenpractico.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.entity.Employee;
import com.examenpractico.entity.Job;
import com.examenpractico.service.EmployeeService;
import com.examenpractico.service.JobService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class JobController {
	
	@Autowired
	JobService jobService;
	
	@Autowired 
	EmployeeService employeeService;
	
	@PostMapping(value = "/job", consumes = { "application/json" })
	public List<Employee> buscarEmpleadoPorPuesto(@RequestBody Job job)  throws Exception{

		boolean existe = jobService.findJobById(job.getIdJob());
		if (existe) {
			List<Employee> em = employeeService.findEmployeeJobId(job.getIdJob());
			return em;
		}
		else {
			return employeeService.findEmployeeJobId(job.getIdJob())  ;
		}	
		
	}
}
