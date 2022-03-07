package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	
	Service1 service;
	
	public HelloWorld(Service1 service) {
		this.service = service;
	}

	@GetMapping("/hello")
	public String Hello() {
		
		return "Hello";
	}

}
