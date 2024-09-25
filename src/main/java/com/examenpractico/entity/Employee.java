package com.examenpractico.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name  ="Employees")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmployees;
	
	private String name;
	private String lastName;
	private LocalDate  birthdate;
	//private int jobId;
	//private int genderId;

	
	@OneToOne
	@JoinColumn(name = "JOB_ID")
	private Job job;
	
	@OneToOne
	@JoinColumn(name = "GENDER_ID")
	private Gender gender;

	
	

}
