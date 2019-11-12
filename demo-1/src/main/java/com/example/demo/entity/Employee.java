package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CascadeType;

@Entity(name="EMPLOYEE")
public class Employee {
	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SEX")
	private String Sex;
	@Column(name = "PERSONID")
	private String personid;
	@Column(name = "BIRTHDATE")
	private String birthdate;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "POSITION")
	private String position;
	@Column(name = "DEPARTMENT")
	private String department;
	
	@OneToMany(mappedBy="id",fetch=FetchType.EAGER)
	private List<Punch> Punch =new ArrayList();

	
	public List<Punch> getPunch() {
		return Punch;
	}
	public void setPunch(List<Punch> punch) {
		this.Punch = punch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
}
