package com.kamathad.constructordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication(
//		scanBasePackages = {"com.kamathad.constructordemo",
//							"com.kamathad.util"
//		}
//)
@SpringBootApplication
public class ConstructorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorDemoApplication.class, args);
	}

}
