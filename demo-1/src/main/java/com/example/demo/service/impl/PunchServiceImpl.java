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
	public List<Punch> findById(int id) {
		
		return punchRespository.findAllById(id);
	}


	
	
}
