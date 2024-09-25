package com.examenpractico.po;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

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


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		
	private Integer idEmployees;
	
	private String name;
	private String last_name;
	private LocalDate birthdate;
	private Integer gender_id;
	private Long job_id;
	
	

	
	
}
