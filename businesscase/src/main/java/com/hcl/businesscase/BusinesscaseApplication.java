package com.hcl.businesscase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BusinesscaseApplication extends ServletInitializer{

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(BusinesscaseApplication.class);
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(BusinesscaseApplication.class, args);
	}

}
