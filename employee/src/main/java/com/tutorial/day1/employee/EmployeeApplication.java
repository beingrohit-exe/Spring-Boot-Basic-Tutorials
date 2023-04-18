package com.tutorial.day1.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	/**
	 *  Postman
	 * Client -> Controller -> Buisness Layer(Service) -> POJO(Entity or Datasource) -> Database
	 * 
	 * POJO -> Publicly accessible (= or ! not private), not necessary to use getter and setters
	 * 			default constructor
	 * 
	 * JAVA Beans Utils -> private, getter and setters, default constructor, seriazable interface
	 * 
	*/

}
