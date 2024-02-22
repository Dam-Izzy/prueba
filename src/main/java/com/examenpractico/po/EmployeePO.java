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

public class EmployeePO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeePO() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	private Integer idEmployees;
	
	private String name;
	private String last_name;
	private Date birthdate;
	private Integer gender_id;
	private Integer job_id;
	
	public Integer getIdEmployees() {
		return idEmployees;
	}

	public void setIdEmployees(Integer idEmployees) {
		this.idEmployees = idEmployees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}


	public Integer getGender_id() {
		return gender_id;
	}

	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
	}

	public Integer getJob_id() {
		return job_id;
	}

	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}

	@Override
	public String toString() {
		return "EmployeePO [idEmployees=" + idEmployees + ", name=" + name + ", last_name=" + last_name + ", birthdate="
				+ birthdate + ", gender_id=" + gender_id + ", job_id=" + job_id + "]";
	}

	
	
}
