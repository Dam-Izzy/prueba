package com.examenpractico.entity;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name  ="Employees")
public class Employee {
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEmployees;
	
	private String name;
	private String last_name;
	private Date birthdate;
	
	
	@OneToOne
	@JoinColumn(name = "GENDER_ID")
	private Gender gender_id;
	
	@OneToOne
	@JoinColumn(name = "id_Job")
	private Job id_Job;
	
	
	
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
	public Gender getGender_id() {
		return gender_id;
	}
	public void setGender_id(Gender gender_id) {
		this.gender_id = gender_id;
	}
	public Job getId_Job() {
		return id_Job;
	}
	public void setId_Job(Job id_Job) {
		this.id_Job = id_Job;
	}

	

}
