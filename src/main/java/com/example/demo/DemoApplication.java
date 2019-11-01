package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner //to run code in application start up
{
	final
	EmployeeRepository employeeRepository;

	final
	DepartmentRepository departmentRepository;

	public DemoApplication(final EmployeeRepository employeeRepository,
			final DepartmentRepository departmentRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String... args) throws Exception {

		Company newCompany = new Company(1, "Unisystems");
		Business newBusiness = new Business(1, "Consulting");
		Department newDepartment = departmentRepository.findById(2L).orElseThrow(() -> new RuntimeException("Wrong query in database"));


		Units newUnit = new Units(1, "Unit 1");

		Employees kostis = new Employees(1, "Giannopoulos", "Kostis", "salaminos 85", 1234, new Date(2017, Calendar.JANUARY, 17),
				new Date(2019, Calendar.FEBRUARY, 17),
				"ACTIVE", "ACTIVE", newCompany, newBusiness, newDepartment, newUnit, "Manager");

		employeeRepository.save(kostis);
	}

}
