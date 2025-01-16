package com.example.SHD_backend.SHD_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShdBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShdBackendApplication.class, args);
	}

}
