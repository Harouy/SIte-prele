package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1h3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1h3Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {

		};
	}

}
