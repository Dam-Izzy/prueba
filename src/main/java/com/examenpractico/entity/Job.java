package com.examenpractico.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Job {
	@Id
	@GeneratedValue
	private Integer id_Job;
	private String name;
	private double salary;
//	@OneToOne(mappedBy = "Job", cascade = CascadeType.ALL)
//    private Employee employee;
	
 Job() {
		// TODO Auto-generated method stub

	}

	public Integer getId_Job() {
		return id_Job;
	}
	public void setId_Job(Integer id_Job) {
		this.id_Job = id_Job;
	}
//	public Employee getEmployee() {
//		return employee;
//	}
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
