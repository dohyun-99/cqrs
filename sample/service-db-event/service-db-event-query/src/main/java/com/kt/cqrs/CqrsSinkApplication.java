package com.kt.cqrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableKafka
@SpringBootApplication
public class CqrsSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CqrsSinkApplication.class, args);
	}
}
