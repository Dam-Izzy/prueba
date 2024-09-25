package com.examenpractico.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenpractico.entity.EmployeeWorkedHours;

import com.examenpractico.repository.EmployeeRepository;
import com.examenpractico.repository.EmployeeWorkedHoursRepository;
import com.examenpractico.service.EmployeeWorkedHoursService;


@Service
public class EmployeeWorkedHoursServiceImp implements EmployeeWorkedHoursService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeWorkedHoursRepository employeeWorkedHoursRepository;
	
	@Override
	public int findWorkedHoursByEmployee(int id) throws Exception {
		
		return employeeWorkedHoursRepository.findWorkedHoursByidEmployeeWorkedHours(id);
	}

	@Override
	public List<EmployeeWorkedHours> findWorkedHoursByWorkedDate(Long employeeId, LocalDate date, LocalDate date2) throws Exception {
		
		
		return employeeWorkedHoursRepository.findByEmployeeIdAndWorkedDateBetween(employeeId, date, date2);
	}


	@Override
	public EmployeeWorkedHours addWorkedHours(EmployeeWorkedHours newEmployeeWorkedHours) {
		return employeeWorkedHoursRepository.save(newEmployeeWorkedHours);
	}


	
	
	
}
