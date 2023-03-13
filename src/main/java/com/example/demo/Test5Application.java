package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Test5Application {
	
	@GetMapping
	public String message(){
		return "your app is deployed in azure sucessfully";
	}


	public static void main(String[] args) {
		SpringApplication.run(Test5Application.class, args);
	}

}
