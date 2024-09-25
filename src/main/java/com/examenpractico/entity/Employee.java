package com.examenpractico.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Integer gender_id;
	private Integer job_id;
	
//	@OneToOne
//	@JoinColumn(name = "GENDER")
//	@JsonIgnore
//	private Gender gender;
//	
//	@OneToOne
//	@JoinColumn(name = "Job")
//	@JsonIgnore
//	private Job Job;

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

//	public Gender getGender() {
//		return gender;
//	}
//
//	public void setGender(Gender gender) {
//		this.gender = gender;
//	}
//
//	public Job getJob() {
//		return Job;
//	}
//
//	public void setJob(Job job) {
//		Job = job;
//	}
//	
	
	

}
