package com.homeschooltracker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.homeschooltracker")
@SpringBootApplication
public class ApiApplication {

	public static void main(String... args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
