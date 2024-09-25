package com.examenpractico.entity;

import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
@Entity
@Table(name  ="EMPLOYEE_WORKED_HOURS")
@Data
@ToString
public class EmployeeWorkedHours {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer IdWorkedHours;
	
	private Integer employeeId;
	private Integer workedHours;
	private LocalDate workedDate;


	
	

	
}
