package com.catalog.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.catalog")
@EntityScan(basePackages = "com.catalog.bean")
@EnableJpaRepositories(basePackages = "com.catalog.persistence")
@EnableEurekaClient
public class CataogProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CataogProjectApplication.class, args);
	}

}
