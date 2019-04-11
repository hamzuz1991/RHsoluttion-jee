package com.example.RHjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class RhSolution1Application {

	public static void main(String[] args) {
		SpringApplication.run(RhSolution1Application.class, args);
	}

}
