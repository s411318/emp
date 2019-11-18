package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PUNCH")
public class Punch {
	
	
	@Column(name = "ID")
	private String id;
	
	@Column(name = "CHECKSTATUS")
	private String checkstatus;
	@Id
	@Column(name = "CHECKTIME")
	private String checktime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCheckstatus() {
		return checkstatus;
	}

	public void setCheckstatus(String checkstatus) {
		this.checkstatus = checkstatus;
	}

	public String getChecktime() {
		return checktime;
	}

	public void setChecktime(String checktime) {
		this.checktime = checktime;
	}
	
}
