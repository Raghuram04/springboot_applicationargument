package com.weblearner.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplicationargsApplication implements ApplicationRunner{

	public static void main(String[] args) {
		
		for(String arg: args) {
			System.out.println("Getting arg in main class -> "+ arg);
		}
		SpringApplication.run(SpringbootApplicationargsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {		
		
		args.getNonOptionArgs().forEach(s -> {
			System.out.println("Getting arg using ApplicationArgument class --->"+ s);
		});
		
	}

}
