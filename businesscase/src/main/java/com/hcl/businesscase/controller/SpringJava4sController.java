package com.hcl.businesscase.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {

	@GetMapping("/index")
	public String welcomeMsg() {
		return "welcome!!!";

	}

}