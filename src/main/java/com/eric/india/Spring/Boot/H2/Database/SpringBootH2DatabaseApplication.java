package com.eric.india.Spring.Boot.H2.Database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DatabaseApplication.class, args);
	}

}
