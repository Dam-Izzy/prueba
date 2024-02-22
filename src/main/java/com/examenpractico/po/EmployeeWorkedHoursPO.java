package com.examenpractico.po;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

public class EmployeeWorkedHoursPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeWorkedHoursPO() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	private Integer idEmployeeWorkedHours;
	private Integer id_employee;
	private Integer worked_hours;
	private Date worked_date;

	public Integer getIdEmployeeWorkedHours() {
		return idEmployeeWorkedHours;
	}
	public void setIdEmployeeWorkedHours(Integer idEmployeeWorkedHours) {
		this.idEmployeeWorkedHours = idEmployeeWorkedHours;
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
	

	
	
	
	
	
}
