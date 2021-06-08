package com.raj.multiplepropfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = { "classpath:email.properties", "classpath:database.properties" })
public class MultiplePropFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplePropFilesApplication.class, args);
	}

}
