package com.cognizant.spring_learn.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("country.xml")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
