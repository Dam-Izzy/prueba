package com.examenpractico.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.examenpractico.po.EmployeePO;
import com.examenpractico.po.EmployeeWorkedHoursPO;
import com.examenpractico.service.EmployeeService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
    EntityManager entityManager;
	@Override
	public Boolean addEmployee(EmployeePO employeePO) {
		
		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("InsertarEmpleado");
		// set parameters
		storedProcedure.registerStoredProcedureParameter("p_gender_id", Integer.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("p_job_id", Integer.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("name", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("last_name", String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("birthdate", Date.class, ParameterMode.IN);
		
		storedProcedure.setParameter("p_gender_id", employeePO.getGender_id());
		storedProcedure.setParameter("p_job_id", employeePO.getJob_id());
		storedProcedure.setParameter("name", employeePO.getName());
		storedProcedure.setParameter("last_name", employeePO.getLast_name());
		storedProcedure.setParameter("birthdate", employeePO.getBirthdate());
		

		
		// execute SP

		return storedProcedure.execute();
	}
	

}
