package com.examenpractico.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examenpractico.entity.Employee;

	
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	List<Employee> findEmployeeByNameAndLastName(String name, String lastName);
	
	@Query(value = "SELECT * FROM EMPLOYEES E INNER JOIN JOBS J ON J.ID_JOB = E.JOB_ID WHERE E.JOB_ID=:id", nativeQuery = true)
	List<Employee> findEmployeeByJob(Long id);
	
	@Query(value = "SELECT * FROM EMPLOYEES E  INNER JOIN JOBS J ON J.ID_JOB = E.JOB_ID  WHERE  J.SALARY BETWEEN :min  AND :max ", nativeQuery = true)
	List<Employee> findEmployeesBySalaryRange(double min, double max);
	
	//Employee saveEmployee(Employee employe)  throws Exception;
/*
	@Query(value = "CALL ConsultarEmpleadoPorPuesto(:p_name);", nativeQuery = true)
	public	List<Employee> consultByPosition(String position) throws Exception ;

	@Query(value = "CALL InsertarHorasTrabajadas(:p_name);", nativeQuery = true)
	public	List<Employee> consultBySalary(int id) throws Exception ;

	@Query(value = "CALL ValidarExistenciaEmpleado(:p_name);", nativeQuery = true)
	public	List<Employee> paymentsToEmployee(Date initDate, Date untilDate) throws Exception ;
*/
}
