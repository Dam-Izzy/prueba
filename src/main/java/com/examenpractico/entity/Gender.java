package com.examenpractico.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Gender {
    @JsonCreator
	public Gender(){}
	@Id
	@GeneratedValue
	private Integer gender_id;
	private String name;
//	@JsonProperty("gender_id")
//	@OneToOne(mappedBy = "gender", cascade = CascadeType.ALL)
//    private Employee employee;

	

	public Integer getGender_id() {
		return gender_id;
	}
	public void setGender_id(Integer gender_id) {
		this.gender_id = gender_id;
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
	
}
