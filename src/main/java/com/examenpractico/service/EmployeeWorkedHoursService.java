package com.examenpractico.service;

import java.time.LocalDate;
import java.util.List;


import com.examenpractico.entity.EmployeeWorkedHours;

public interface EmployeeWorkedHoursService {

	public int findWorkedHoursByEmployee(int id) throws Exception;

	public List<EmployeeWorkedHours> findWorkedHoursByWorkedDate(Long id, LocalDate date,  LocalDate date2) throws Exception;

	public EmployeeWorkedHours addWorkedHours(EmployeeWorkedHours newEmployeeWorkedHours);
}
