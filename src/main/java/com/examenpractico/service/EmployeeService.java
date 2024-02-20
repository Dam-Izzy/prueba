package com.examenpractico.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examenpractico.entity.Employee;


public interface EmployeeService {
@Query(value = "CALL InsertarEmpleado(:p_name,:p_lastname,p_birthdate);", nativeQuery = true)	
Boolean validateEmployee(@Param("p_name") String emp_name,@Param("emp_id") String emp_lastname,@Param("p_birthdate") Date emp_birthdate)  throws Exception;
	
	
Employee saveEmployee(Employee employe)  throws Exception;

@Query(value = "CALL ConsultarEmpleadoPorPuesto(:p_name);", nativeQuery = true)
public	List<Employee> consultByPosition(String position) throws Exception ;

@Query(value = "CALL InsertarHorasTrabajadas(:p_name);", nativeQuery = true)
public	List<Employee> consultBySalary(int id) throws Exception ;

@Query(value = "CALL ValidarExistenciaEmpleado(:p_name);", nativeQuery = true)
public	List<Employee> paymentsToEmployee(Date initDate, Date untilDate) throws Exception ;

}
