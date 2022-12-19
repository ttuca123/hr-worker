package com.devsuperior.hrworker;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.hrworker.dto.WorkerDTO;
import com.devsuperior.hrworker.entities.Worker;

@SpringBootApplication
public class HrWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args);
	}
	
}
