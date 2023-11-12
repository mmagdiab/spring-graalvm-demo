package com.example.springgraalvmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringGraalvmDemoApplication {

	@RequestMapping("/test")
	String test() {
		return "test";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGraalvmDemoApplication.class, args);
	}

}
