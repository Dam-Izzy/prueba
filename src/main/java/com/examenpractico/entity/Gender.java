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
@Table(name="GENDERS")
@Data
public class Gender {
	@Id
	@GeneratedValue
	private Integer idGenders;
	private String name;


	@OneToOne
	@JoinColumn(name="idGenders")
	@JsonIgnore
	private Employee employee;


	
}
