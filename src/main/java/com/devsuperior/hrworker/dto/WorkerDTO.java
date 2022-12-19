package com.devsuperior.hrworker.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WorkerDTO {

	private Long id;
	private String name;
	private Double dailyIncome;

}
