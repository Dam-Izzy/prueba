package com.examenpractico.serviceImp;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.examenpractico.entity.Employee;
import com.examenpractico.repository.EmployeeDAO;
import com.examenpractico.service.EmployeeService;



public class EmployeeServiceImpl implements EmployeeService{
	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeServiceImpl.class) ;
	private	EmployeeDAO employeeDAO ;
	@Override
	public Employee saveEmployee(Employee employe) throws Exception {
		// TODO Auto-generated method stub
		return employeeDAO.save(employe);
	}
	@Override
	public List<Employee> consultByPosition(String position) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> consultBySalary(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> paymentsToEmployee(Date initDate, Date untilDate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Employee validateEmployee(String emp_name, String emp_lastname, Date emp_birthdate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
