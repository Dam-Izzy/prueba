package com.examenpractico.service;

import org.springframework.data.jpa.repository.Query;

import com.examenpractico.entity.EmployeeWorkedHours;


public interface EmpoyeeWorkedHoursService {
@Query(value = "CALL ValidarExistenciaEmpleado(:p_name);", nativeQuery = true)
void saveEmpoyeeWorkedHours(EmployeeWorkedHours empoyeeWorkedHours)throws Exception;
}
