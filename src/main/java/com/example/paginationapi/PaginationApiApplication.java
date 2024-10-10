package com.example.paginationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.paginationapi.entity"})
@EnableJpaRepositories(basePackages = {"com.example.paginationapi.repository"})
public class PaginationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationApiApplication.class, args);
	}

}
