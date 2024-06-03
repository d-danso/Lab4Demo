package com.example.Lab4demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
	@Value("${welcome.message}")
	private String welcomeMessage;

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(welcomeMessage);
	}

}
