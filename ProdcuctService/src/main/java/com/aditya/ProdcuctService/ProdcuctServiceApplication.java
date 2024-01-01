package com.aditya.ProdcuctService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.aditya.ProdcuctService.repository")
public class ProdcuctServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdcuctServiceApplication.class, args);
	}

}
