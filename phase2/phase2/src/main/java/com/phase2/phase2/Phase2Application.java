package com.phase2.phase2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Phase2Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase2Application.class, args);
	}
}
