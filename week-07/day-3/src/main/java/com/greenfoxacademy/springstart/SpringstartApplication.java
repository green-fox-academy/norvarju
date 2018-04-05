package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner{

	@Autowired
	HelloBeanWorld helloBeanWorld;

	@Autowired
	MyColor myColor;

	public static void main(String[] args) {
		SpringApplication.run(SpringstartApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		System.out.println(helloBeanWorld.log("hello"));
		System.out.println(myColor.printColor());
	}
}
