package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		System.out.println(" got called /");
		return "Hello World!";
	}

    @GetMapping("/name")
	public String getName() {
		System.out.println(" got called /name");
		return "Mohan here !!";
	}

}