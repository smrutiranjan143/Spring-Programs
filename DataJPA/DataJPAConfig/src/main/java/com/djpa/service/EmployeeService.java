package com.djpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djpa.entity.Employee;
import com.djpa.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Transactional(readOnly = false)
	public int saveEmployee(Employee employee) {
		employee = employeeRepo.save(employee);
		return employee.geteId();
	}

	public long countEmployee() {
		return employeeRepo.count();
	}
}
