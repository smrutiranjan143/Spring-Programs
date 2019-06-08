package com.djpa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.djpa.config.RootConfig;
import com.djpa.entity.Employee;
import com.djpa.service.EmployeeService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);

		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		Employee employee = new Employee();
		employee.setEname("Smruti");
		employee.setSalary(40000);

		int id = employeeService.saveEmployee(employee);
		System.out.println(id);
		System.out.println(employeeService.countEmployee());
	}
}