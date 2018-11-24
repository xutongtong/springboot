package com.mybatis.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {
	private final CityMapper cityMapper;

	public HelloApplication(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.cityMapper.findByState("CA"));
	}
}
