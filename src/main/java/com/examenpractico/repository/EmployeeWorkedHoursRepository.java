package com.examenpractico.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examenpractico.entity.EmployeeWorkedHours;

public interface EmployeeWorkedHoursRepository extends JpaRepository<EmployeeWorkedHours, Integer> {
	
	@Query(value = "SELECT COALESCE( SUM(e.WORKED_HOURS),0) WORKED_HOURS FROM EMPLOYEE_WORKED_HOURS e WHERE e.EMPLOYEE_ID =:id and e.WORKED_DATE =CURRENT_DATE()", nativeQuery = true)
	public	int findWorkedHoursByidEmployeeWorkedHours(@Param("id") int id) throws Exception ;
	
	//@Query(value = "SELECT COALESCE( SUM(H.WORKED_HOURS),0) FROM EMPLOYEE_WORKED_HOURS H  JOIN EMPLOYEES E ON H.EMPLOYEE_ID = E.ID_EMPLOYEES  WHERE E.ID_EMPLOYEES = :id and H.WORKED_DATE BETWEEN  :date AND :date2", nativeQuery = true)
	
	public	List<EmployeeWorkedHours> findByEmployeeIdAndWorkedDateBetween(Long employeeId, LocalDate date, LocalDate date2) throws Exception ;
	
	
	}
