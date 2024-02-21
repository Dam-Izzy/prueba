package com.examenpractico.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenpractico.entity.Employee;
import com.examenpractico.repository.EmployeeRepository;
import com.examenpractico.service.EmployeeService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
    EntityManager entityManager;
	@Override
	public Boolean addEmployee(Employee employee) {
		
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("InsertarEmpleado");
		// set parameters
		storedProcedure.registerStoredProcedureParameter("name", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("last_name", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("birthdate", Date.class, ParameterMode.IN);
		storedProcedure.setParameter("name", employee.getName());
		storedProcedure.setParameter("last_name", employee.getLast_name());

		storedProcedure.setParameter("birthdate", employee.getBirthdate());
		
		// execute SP
		Boolean exito= storedProcedure.execute();
		// get result
		if (exito) {
			employeeRepository.save(employee);
		}
		return exito;
	}

}
