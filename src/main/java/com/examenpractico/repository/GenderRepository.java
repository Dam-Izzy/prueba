package com.examenpractico.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.examenpractico.entity.Gender;

	
public interface GenderRepository extends JpaRepository<Gender, Integer> {
	
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
