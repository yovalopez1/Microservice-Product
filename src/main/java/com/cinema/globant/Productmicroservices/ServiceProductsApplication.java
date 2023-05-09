package com.cinema.globant.Productmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProductsApplication.class, args);
	}

}
