package edu.api.tasklater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasklaterApplication {
	public String PORT = System.getenv("PORT");
	public static void main(String[] args) {
		SpringApplication.run(TasklaterApplication.class, args);
	}

}
