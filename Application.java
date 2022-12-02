package com.restweb.services.restfulservice.in28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.restweb.services.restfulservice.in28.user"})
public class RestfulserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulserviceApplication.class, args);
	}

}
