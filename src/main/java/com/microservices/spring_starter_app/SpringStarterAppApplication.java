package com.microservices.spring_starter_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterAppApplication.class, args);
		System.out.println("Spring Starter App is running...");
	}

}
