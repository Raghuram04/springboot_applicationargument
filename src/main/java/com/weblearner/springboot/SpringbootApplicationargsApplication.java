package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplicationargsApplication implements ApplicationRunner {
	
	@Value("${name}")
	private String name;
	
	@Value("${location}")
	private String location;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplicationargsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Name -->"+ name);
		System.out.println("location -->"+ location);

	}

}
