package com.devsuperior.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.devsuperior.hrworker.dto.WorkerDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Worker implements Serializable{

	@Id
	private Long id;
	@Column(name = "name")
	private String name;
	@Column( name = "daily_income")
	private Double dailyIncome;
	
	public Worker(WorkerDTO vo) {
		
		this.id = vo.getId();
		this.name = vo.getName();
		this.dailyIncome = vo.getDailyIncome();
		
	}
}
