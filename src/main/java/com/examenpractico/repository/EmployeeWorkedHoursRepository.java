package com.examenpractico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.examenpractico.entity.Employee;
import com.examenpractico.entity.EmployeeWorkedHours;
@Repository
public interface EmployeeWorkedHoursRepository extends JpaRepository<EmployeeWorkedHours, Integer> {
	@Query(value = "CALL InsertarHorasTrabajadas(:p_id);", nativeQuery = true)
	public	List<Employee> consultBySalary(@Param(value = "p_id") Integer id) throws Exception ;
}
