package com.examenpractico.entity;

import java.util.Date;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class EmployeeWorkedHours {
	EmployeeWorkedHours(){}
	@Id
	@GeneratedValue
	private Integer idEmployeeWorkedHours;
	private Integer workedHours;
	private Date workedDate;
	@JdbcTypeCode(SqlTypes.JSON)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPLOYEES")
	private Employee employee;
	

	public Integer getIdEmployeeWorkedHours() {
		return idEmployeeWorkedHours;
	}
	public void setIdEmployeeWorkedHours(Integer idEmployeeWorkedHours) {
		this.idEmployeeWorkedHours = idEmployeeWorkedHours;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Integer getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(Integer workedHours) {
		this.workedHours = workedHours;
	}
	public Date getWorkedDate() {
		return workedDate;
	}
	public void setWorkedDate(Date workedDate) {
		this.workedDate = workedDate;
	}
	public Employee getEmploye() {
		return employee;
	}
	public void setEmploye(Employee employee) {
		this.employee = employee;
	}
}
