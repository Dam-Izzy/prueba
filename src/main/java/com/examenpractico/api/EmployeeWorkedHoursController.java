package com.examenpractico.api;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.constantes.Constantes;
import com.examenpractico.entity.Employee;
import com.examenpractico.entity.EmployeeWorkedHours;
import com.examenpractico.po.DateRequest;
import com.examenpractico.service.EmployeeService;
import com.examenpractico.service.EmployeeWorkedHoursService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeWorkedHoursController {
	@Autowired
	EmployeeWorkedHoursService employeeWorkedHoursService;

	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "/addHours" , consumes = { "application/json" })
	ResponseEntity<String> newEmployee(@RequestBody EmployeeWorkedHours newEmployeeWorkedHours) throws Exception {
	
			//Optional<Employee> employeeId = employeeService.findEmployeeById(newEmployeeWorkedHours.getEmployeeId());
			
			Integer horasTrabajadas = employeeWorkedHoursService.findWorkedHoursByEmployee(newEmployeeWorkedHours.getEmployeeId());
			
			
			if (!newEmployeeWorkedHours.getWorkedDate().isEqual(LocalDate.now()) || newEmployeeWorkedHours.getWorkedHours() >Constantes.HORAS_TRABAJADAS_MAXIMAS || horasTrabajadas >0) {
				log.info("entro aqui");
				return (ResponseEntity.badRequest().body("id: null\nsuccess: " + "false" ));
			}
			if (newEmployeeWorkedHours.getWorkedHours() <= Constantes.HORAS_TRABAJADAS_MAXIMAS) {
				log.info("No hay horas trabajadas aun");
				employeeWorkedHoursService.addWorkedHours(newEmployeeWorkedHours);
				
				return ResponseEntity.ok()
				        .body("id: "+ newEmployeeWorkedHours.getEmployeeId().toString()+ "\nsuccess: " + "true");
		
			}else {
				return (ResponseEntity.badRequest().body("id: null\nsuccess: " + "false" ));


			}

	}
	 
	@PostMapping(value = "/getHoursByDate" , consumes = { "application/json" })
	ResponseEntity<String> obtenerHorasPorfecha(@RequestBody DateRequest request ) throws Exception{
		Integer horasTrabajadas = 0;
		
		if (request.getStartDate().isAfter(request.getEndDate())) {
			log.info("la fecha inicio es despues de la final");
			return (ResponseEntity.badRequest().body("id: null\nsuccess: " + "false" ));
		}
		else {
			
			List<EmployeeWorkedHours> ListaEmployeeWorkedHours = employeeWorkedHoursService.findWorkedHoursByWorkedDate(request.getIdEmployees(), request.getStartDate(), request.getEndDate());
			for (EmployeeWorkedHours employeeWorkedHours : ListaEmployeeWorkedHours) {
				log.info(employeeWorkedHours.getWorkedHours().toString());
				horasTrabajadas += employeeWorkedHours.getWorkedHours();
			}
			
			log.info(request.getIdEmployees() +" start " + request.getStartDate().toString()+" end " + request.getEndDate() );
			return ResponseEntity.ok()
			        .body("total_worked_hours: "+ horasTrabajadas.toString()+ "\nsuccess: " + "true");
		}
		
	}
}
