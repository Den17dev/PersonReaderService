package com.person.personreaderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PersonReaderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonReaderServiceApplication.class, args);
	}

}
