package com.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.loja.model")
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}
}
