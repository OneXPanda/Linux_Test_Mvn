package com.linux.test.mvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LinuxTestMvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinuxTestMvnApplication.class, args);
	}
	
	@GetMapping("/msg")
	public String showMsg() {
		return "Test for Linux Machine..";
	}

}
