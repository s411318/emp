package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Punch;
import com.example.demo.respository.EmployeeRespository;
import com.example.demo.respository.PunchRespository;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PunchService;

@Service
public class PunchServiceImpl implements PunchService{
	
	@Autowired
	PunchRespository punchRespository;

	@Override
	public Punch save(Punch punch) {
		
		return punchRespository.save(punch);
	}

	@Override
	public List<Punch> findbyIdStatus(String id, String status) {
		// TODO Auto-generated method stub
		return punchRespository.findbyIdStatus(id, status);
	}

	@Override
	public List<Punch> findbyDayId(String day, String id) {
		// TODO Auto-generated method stub
		return punchRespository.findbyDayId(day, id);
	}

	@Override
	public List<Punch> findAll() {
		// TODO Auto-generated method stub
		return punchRespository.findAll();
	}

	@Override
	public List<Punch> findIdWeekly(String fromday1, String endday2, String id) {
		// TODO Auto-generated method stub
		return punchRespository.findIdWeekly(fromday1, endday2, id);
	}


	
	
}
