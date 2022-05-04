package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class MessageResource {
	
	@GetMapping("/simpleMessageWelcome")
	   public String simpleMessageWelcome() {
	      var hostName = System.getenv("HOSTNAME");
	      return "environment: " + hostName;
	   }

}