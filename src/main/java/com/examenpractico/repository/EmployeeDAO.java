package com.examenpractico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenpractico.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
