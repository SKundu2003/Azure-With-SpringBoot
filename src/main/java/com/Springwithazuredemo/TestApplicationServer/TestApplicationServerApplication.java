package com.Springwithazuredemo.TestApplicationServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplicationServerApplication {
	@GetMapping("/test")
	public String checkDeployment(){
		return "Deployment Successful";
	}
	@GetMapping("/test2")
	public String sayHello(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestApplicationServerApplication.class, args);
	}

}
