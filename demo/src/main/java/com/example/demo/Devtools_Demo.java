package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Devtools_Demo {
	
	@RequestMapping("/")
	public String message() {
		return "Welcome to Spring Boot";
	}

}
