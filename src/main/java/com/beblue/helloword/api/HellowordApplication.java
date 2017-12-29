package com.beblue.helloword.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
		System.out.println("Hello Word Spring Boot");
	}
}
