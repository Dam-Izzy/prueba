package com.examenpractico.mapping;


import com.examenpractico.entity.Employee;
import com.examenpractico.entity.Gender;
import com.examenpractico.entity.Job;
import com.examenpractico.po.EmployeePO;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class EmployeeHelper {
	
	public static Employee employeePO2Employee(EmployeePO po) {
		Employee entidad = new Employee();
		
		if (po.getName() !=null) {
			entidad.setName(po.getName());
		}else {
			log.info("El nombre esta vacio");
		}
		
		if (po.getLast_name() !=null) {
			entidad.setLastName(po.getLast_name());
		}else {
			log.info("El apellido esta vacio");
		}
		
		if (po.getBirthdate() !=null) {
			entidad.setBirthdate(po.getBirthdate());
		}else {
			log.info("La fecha esta vacia");
		}
		
		if (po.getGender_id() !=null) {
			Gender gender = new Gender();
			gender.setIdGenders(po.getGender_id());
			
			entidad.setGender(gender);
		}else {
			log.info("El genero esta vaci@");
		}
		if (po.getJob_id() !=null) {
			Job job = new Job();
			job.setIdJob(po.getJob_id());
			
			
			entidad.setJob(job);
		}else {
			log.info("El puesto esta vacio");
		}
		return entidad;
	}
//
//	
//	
//	public static Employee employee2EmployeePO(Employee entidad) {
//		EmployeePO po = new EmployeePO();
//		
//		if (entidad.getName() !=null) {
//			po.setName(entidad.getName());
//		}else {
//			log.info("El nombre esta vacio");
//		}
//		
//		if (entidad.getLastName() !=null) {
//			po.setLast_name(entidad.getLastName());
//		}else {
//			log.info("El apellido esta vacio");
//		}
//		
//		if (entidad.getBirthdate() !=null) {
//			po.setBirthdate(entidad.getBirthdate());
//		}else {
//			log.info("La fecha esta vacia");
//		}
//		
//		if (entidad.getGenderId() !=null) {
//			po.setGender_id(entidad.getGenderId());
//		}else {
//			log.info("El genero esta vaci@");
//		}
//		if (entidad.getJobId() !=null) {
//			po.setJob_id(entidad.getJobId());
//		}else {
//			log.info("Las horas trabajadas estan vacias");
//		}
//		return entidad;
//	}
}
