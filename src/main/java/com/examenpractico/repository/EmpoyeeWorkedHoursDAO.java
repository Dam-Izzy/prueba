package com.examenpractico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenpractico.entity.EmployeeWorkedHours;


public interface EmpoyeeWorkedHoursDAO extends JpaRepository<EmployeeWorkedHours, Integer> {

}
