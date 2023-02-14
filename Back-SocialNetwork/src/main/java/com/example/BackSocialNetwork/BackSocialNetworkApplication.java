package com.example.BackSocialNetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BackSocialNetworkApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackSocialNetworkApplication.class, args);

		System.out.println("Todo ok!");
	}

}
