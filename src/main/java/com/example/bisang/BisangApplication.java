package com.example.bisang;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BisangApplication {
	public static void main(String[] args) {
		SpringApplication.run(BisangApplication.class, args);
	}
}