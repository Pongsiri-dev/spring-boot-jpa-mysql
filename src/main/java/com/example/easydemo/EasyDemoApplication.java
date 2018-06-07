package com.example.easydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EasyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyDemoApplication.class, args);
	}
}
