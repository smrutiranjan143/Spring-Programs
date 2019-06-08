package com.djpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djpa.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Override
	<S extends Employee> S save(S entity);

	@Override
	long count();
}