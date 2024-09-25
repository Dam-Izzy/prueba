package com.examenpractico.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.examenpractico.po.EmployeePO;
import com.examenpractico.po.EmployeeWorkedHoursPO;
import com.examenpractico.service.EmployeeWorkedHoursService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class EmployeeWorkedHoursServiceImp implements EmployeeWorkedHoursService {
	
	@Autowired
    EntityManager entityManager;
	
	@Override
	public EmployeeWorkedHoursPO addWorkedHours(EmployeeWorkedHoursPO employeeWorkedHoursPO) {
		// TODO Auto-generated method stub

		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("InsertarHorasTrabajadas");
		// set parameters
		storedProcedure.registerStoredProcedureParameter("p_employee_id", Integer.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("p_worked_hours", Integer.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter("p_worked_date", Date.class, ParameterMode.IN);
		storedProcedure.setParameter("p_employee_id",employeeWorkedHoursPO.getId_employee() );
		storedProcedure.setParameter("p_worked_hours",employeeWorkedHoursPO.getWorked_hours());
		storedProcedure.setParameter("p_worked_date",employeeWorkedHoursPO.getWorked_date());
		
		// execute SP
		storedProcedure.execute();
		
		return employeeWorkedHoursPO;
	}

}
