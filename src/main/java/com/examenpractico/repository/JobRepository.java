package com.examenpractico.repository;



import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.examenpractico.entity.Job;

	
public interface JobRepository extends JpaRepository<Job, Long> {
	@Query(value = "SELECT COALESCE( SUM(J.salary),0) SALARY, J.ID_JOB, J.NAME FROM JOBS J INNER JOIN EMPLOYEES E ON J.ID_JOB = E.JOB_ID INNER JOIN EMPLOYEE_WORKED_HOURS H ON H.EMPLOYEE_ID = E.ID_EMPLOYEES  WHERE E.ID_EMPLOYEES = :id and H.WORKED_DATE BETWEEN :date  AND :date2", nativeQuery = true)
	List<Job> findByEmployeeSalary(@Param("id") Long id,@Param("date") LocalDate date, @Param("date2") LocalDate date2) throws Exception ;
}
