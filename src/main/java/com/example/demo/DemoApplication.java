package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner //to run code in application start up
{
	@Autowired
	EmployeeRepository employeeRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	public void run(String... args) throws Exception {

        Company unisystems=new Company();
        Department technology=new Department();

		Employees kostis = new Employees(1, "Giannopoulos", "Kostis", "salaminos 85", 1234, new Date(2017, Calendar.JANUARY, 17), new Date(2019, Calendar.FEBRUARY, 17),
				"ACTIVE", "ACTIVE", "IT");

        kostis.setDepartment(technology);

		employeeRepository.save(kostis);


	}


}
