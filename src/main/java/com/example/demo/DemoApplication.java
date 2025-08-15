package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	private NewApi service = new NewApi();


	public DemoApplication (NewApi service){
		this.service = service;
	}
	@Override
	public void run (String... args) throws Exception{
		String payment = service.pay();
		System.out.println("payment done"+ payment);
	}
}
