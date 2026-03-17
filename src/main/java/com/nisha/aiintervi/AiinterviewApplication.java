package com.nisha.aiintervi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.nisha.aiintervi.repository")
	public class AiinterviewApplication {

	    public static void main(String[] args) {
	        SpringApplication.run(AiinterviewApplication.class, args);
	        System.err.println("Server started successfuully....!");
	    }
	}


