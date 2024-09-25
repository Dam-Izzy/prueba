package com.examenpractico.api;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.constantes.Constantes;
import com.examenpractico.entity.Employee;
import com.examenpractico.entity.Job;
import com.examenpractico.mapping.EmployeeHelper;
import com.examenpractico.po.DateRequest;
import com.examenpractico.po.EmployeePO;
import com.examenpractico.service.EmployeeService;
import com.examenpractico.service.GenderService;
import com.examenpractico.service.JobService;
import com.examenpractico.util.CalculateDates;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {

	// private final EmployeeRepository repository;

	private EmployeeService employeeService;
	private GenderService genderService;
	private JobService jobService;

	public EmployeeController(EmployeeService employeeService, GenderService genderService, JobService jobService) {
		this.employeeService = employeeService;
		this.genderService = genderService;
		this.jobService = jobService;
	}

	@PostMapping(value = "/addEmployee", consumes = { "application/json" })
	public ResponseEntity<String> addEmployee(@RequestBody EmployeePO newEmployeePO) throws Exception {
		Employee newEmployee = EmployeeHelper.employeePO2Employee(newEmployeePO);

		boolean job = jobService.findJobById(newEmployee.getJob().getIdJob());

		boolean gender = genderService.findGenderById(newEmployee.getGender().getIdGenders());

		List<Employee> em = employeeService.searchEmployeeByNameAndLastName(newEmployee.getName(),
				newEmployee.getLastName());
		boolean success = false;
		LocalDate birthDate = LocalDate.of(newEmployee.getBirthdate().getYear(), newEmployee.getBirthdate().getMonth(),
				newEmployee.getBirthdate().getDayOfYear());

		for (Employee employee : em) {
			System.out.println(employee.toString());
			if (employee.getName().contains(newEmployee.getName())
					&& employee.getLastName().contains(newEmployee.getLastName())) {
				log.info("Empleado existe");
			}
		}
		int edad = CalculateDates.calculateAge(birthDate, LocalDate.now());
		if (em.isEmpty() && job && gender && edad >= Constantes.EDAD_MINIMA_TRABAJO) {
			employeeService.addEmployee(newEmployee);
			success = true;
			log.info("Empleado guardado");
			return ResponseEntity.ok().body("id: " + newEmployee.getIdEmployees().toString() + "\nsuccess: " + success);
		} else {
			log.info("Puede que el job o genero no existan o ambos o el usuario sea menor de edad");

			return (ResponseEntity.badRequest().body("id: null\nsuccess: " + success));
		}

	}

	@PostMapping(value = "/getEmployeeSalaryByDates", consumes = { "application/json" })
	ResponseEntity<String> obtenerSalarioPorfechas(@RequestBody DateRequest request) throws Exception {
		double salarioPagado = 0;

		if (request.getStartDate().isAfter(request.getEndDate())) {
			log.info("la fecha inicio es despues de la final");
			return (ResponseEntity.badRequest().body("id: null\nsuccess: " + "false"));
		} else {

			List<Job> listaEmployee = jobService.findByEmployeeSalary(request.getIdEmployees(), request.getStartDate(),
					request.getEndDate());
			for (Job employee : listaEmployee) {
				log.info("$" + employee.getSalary());
				salarioPagado += employee.getSalary();
			}

			log.info(request.getIdEmployees() + " start " + request.getStartDate().toString() + " end "
					+ request.getEndDate());
			return ResponseEntity.ok().body("payment: $" + salarioPagado + "\nsuccess: " + "true");
		}

	}

	@GetMapping("/getSalarysByRanges")
	public List<Employee> obtenerSalariosPorRangos(@RequestParam double min, @RequestParam double max,
			@RequestParam String order, int size) throws Exception {
		List<Employee> lstEmployees;
		if (max < min || size == 0 || order.isBlank()) {
			log.info("error revisar parametros");
			return List.of();
		} else {

			lstEmployees = employeeService.findEmployeesBySalaryRange(min, max, order, size);
			if (order.contains("desc")) {
				Collections.sort(lstEmployees,
						(o1, o2) -> Double.compare(o2.getJob().getSalary(), o1.getJob().getSalary()));
			}

			return lstEmployees;
		}

	}
}
