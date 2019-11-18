package com.example.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Punch;
import com.example.demo.entity.User;

public interface LeaveService {
	
	List<Leave> findsByTime(String start,String end);
	
	Leave save(Leave leave);
	

}
