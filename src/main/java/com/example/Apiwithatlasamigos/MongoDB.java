package com.example.Apiwithatlasamigos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDB {

	public static void main(String[] args) {
		SpringApplication.run(MongoDB.class, args);
	}

	@Bean
	CommandLineRunner runner(CustomerRepository repository){
		return args -> {
			Customer customer=new Customer(

					"rammksf",
					"arr",
					998745621


			);
			repository.insert(customer);
		};
	}

}



