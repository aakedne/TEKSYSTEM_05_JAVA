package com.example.entity;

import javax.persistence.Entity;

@Entity
public class StudentEntity {
	
	//setting our fields
	private String rollNo; 
	private String name;
	
	// getters and setters
	public String getRollup() {
		return rollNo;
	}
	public void setRollup(String rollup) {
		this.rollNo = rollup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
