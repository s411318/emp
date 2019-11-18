package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "LEAVE")
public class Leave {
	
	
	@Column(name = "ID")
	private int id;
	
	@Column(name = "VACATION")
	private String vacation;
	
	@Id
	@Column(name = "VACATIONSTARTDATE")
	private String vacationstartDate;
	
	@Column(name = "VACATIONENDDATE")
	private String vacationendDate;
	
	@Column(name = "VACATIONTIME")
	private String vacationTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVacation() {
		return vacation;
	}

	public void setVacation(String vacation) {
		this.vacation = vacation;
	}

	public String getVacationstartDate() {
		return vacationstartDate;
	}

	public void setVacationstartDate(String vacationstartDate) {
		this.vacationstartDate = vacationstartDate;
	}

	public String getVacationendDate() {
		return vacationendDate;
	}

	public void setVacationendDate(String vacationendDate) {
		this.vacationendDate = vacationendDate;
	}

	public String getVacationTime() {
		return vacationTime;
	}

	public void setVacationTime(String vacationTime) {
		this.vacationTime = vacationTime;
	}

	

	
}
