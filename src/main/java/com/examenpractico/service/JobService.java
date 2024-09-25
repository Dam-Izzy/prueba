package com.examenpractico.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;


import com.examenpractico.entity.Job;

public interface JobService {

	public boolean findJobById(Long id);
	public List<Job> findByEmployeeSalary(Long id, LocalDate date,LocalDate date2) throws Exception ;
	
}
