package com.cg.capstoreapp.CapStroreAppFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.capstoreapp.controller")
public class CapStroreAppFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapStroreAppFrontApplication.class, args);
	}
}
