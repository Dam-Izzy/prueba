package com.examenpractico.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JOBS")
@Data
public class Job {
	@Id
	@GeneratedValue
	private Long idJob;
	private String name;
	private double salary;

	@OneToOne
	@JoinColumn(name="idJob")
	@JsonIgnore
	private Employee employee;

}
