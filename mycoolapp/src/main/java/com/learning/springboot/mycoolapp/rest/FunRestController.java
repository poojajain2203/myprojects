package com.learning.springboot.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// Expose / than return Hellow World
	@GetMapping("/")
	public String sayHellow()
	{
		return "Hellow World...! Time on Server is "+ LocalDateTime.now();
				
	}
	

}
