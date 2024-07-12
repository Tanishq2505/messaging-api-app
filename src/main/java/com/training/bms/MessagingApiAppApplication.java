package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {

	@GetMapping("/")
	public String printGreetings() {
		return "I'm Tanishq Kashyap's server";
	}
	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
		System.out.println("App started");
	}

}
