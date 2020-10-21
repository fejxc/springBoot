package com.sunyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.sunyun.dao")
@SpringBootApplication
public class Ch002VueApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch002VueApplication.class, args);
	}

}
