package com.examenpractico.bean;

import java.util.Date;

public class EmpoyeeWorkedHours {
	private Integer id;
	private Integer idEmployee;
	private Integer workedHours;
	private Date workedDate;
	private EmployeBean employeBean;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
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
	public EmployeBean getEmployeBean() {
		return employeBean;
	}
	public void setEmployeBean(EmployeBean employeBean) {
		this.employeBean = employeBean;
	}

	
}
