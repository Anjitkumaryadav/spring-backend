package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//this is a way to make dependency injection. (there are two types to make dependency injection first @Autowired and second Constructor
	@Autowired
	private NewApi service = new NewApi();


	//here we are making constructor for making dependency injection of NewApi
//	public DemoApplication (NewApi service){
//		this.service = service;
//	}
	@Override
	public void run (String... args) throws Exception{
		String payment = service.pay();
		System.out.println("payment done"+ payment);
	}
}
