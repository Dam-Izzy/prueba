package com.examenpractico.serviceImpl;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenpractico.entity.Job;
import com.examenpractico.repository.JobRepository;
import com.examenpractico.service.JobService;
@Service
public class JobServiceImpl implements JobService {
	@Autowired
	JobRepository jobRepository;
	
	@Override
	public boolean findJobById(Long jobId) {
		
		return jobRepository.existsById(jobId);
	}

	@Override
	public List<Job> findByEmployeeSalary(Long id, LocalDate date, LocalDate date2) throws Exception {
		// TODO Auto-generated method stub
		return jobRepository.findByEmployeeSalary(id, date, date2);
	}


}
