package com.springtutorial.listservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ListServiceApplication {

	//7955FEC4796F5D746C4A6446884DB98A
	//A6DB66504F584960CDC311158A39C258
	public static void main(String[] args) {
		SpringApplication.run(ListServiceApplication.class, args);
	}

}
