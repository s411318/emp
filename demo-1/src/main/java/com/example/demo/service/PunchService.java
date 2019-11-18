package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Punch;

public interface PunchService {
	
	Punch save(Punch punch);
	List<Punch> findbyIdStatus(String id,String status);
	List<Punch> findbyDayId(String day,String id);
	List<Punch> findAll();
	List<Punch> findIdWeekly(String fromday1,String endday2,String id);
}
