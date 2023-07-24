package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.demo")
@SpringBootApplication
public class MybatisPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPracticeApplication.class, args);

	}

}
