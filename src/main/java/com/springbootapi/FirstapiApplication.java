package com.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages={
"com.springbootapi"},exclude = {JpaRepositoriesAutoConfiguration.class, DataSourceAutoConfiguration.class})
@EnableMongoRepositories("com.springbootapi.repository")
public class FirstapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstapiApplication.class, args);
	}

}
