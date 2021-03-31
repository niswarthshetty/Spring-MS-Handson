package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoanMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanMsApplication.class, args);
	}

}
