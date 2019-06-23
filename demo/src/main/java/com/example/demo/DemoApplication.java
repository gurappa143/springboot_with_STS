package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import hello.Greeting;

@SpringBootApplication(scanBasePackageClasses = {})
@ComponentScan("hello")
public class DemoApplication {
@Value("@name@")	
public static String name;
	public static void main(String[] args) {
		//System.setProperty("spring.devtools.restart.enabled", "false");//by using this line we can controle to stop the auto restart
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("this is for Devtool Demo4");
	System.out.println(name);
	}

	
}
