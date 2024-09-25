package com.examenpractico.entity;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
@Entity
@Table(name  ="EMPLOYEE_WORKED_HOURS")
public class EmployeeWorkedHours {
	EmployeeWorkedHours(){}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEmployeeWorkedHours;
	
	private Integer id_employee;
	private Integer worked_hours;
	private Date worked_date;


	public Integer getIdEmployeeWorkedHours() {
		return idEmployeeWorkedHours;
	}


	public Integer getId_employee() {
		return id_employee;
	}


	public void setId_employee(Integer id_employee) {
		this.id_employee = id_employee;
	}


	public Integer getWorked_hours() {
		return worked_hours;
	}


	public void setWorked_hours(Integer worked_hours) {
		this.worked_hours = worked_hours;
	}


	public Date getWorked_date() {
		return worked_date;
	}


	public void setWorked_date(Date worked_date) {
		this.worked_date = worked_date;
	}


	public void setIdEmployeeWorkedHours(Integer idEmployeeWorkedHours) {
		this.idEmployeeWorkedHours = idEmployeeWorkedHours;
	}

	

	
}
