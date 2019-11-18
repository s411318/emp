package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Punch;
import com.example.demo.entity.User;
import com.example.demo.respository.EmployeeRespository;
import com.example.demo.respository.LeaveRespository;
import com.example.demo.respository.PunchRespository;
import com.example.demo.respository.UserRespository;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.LeaveService;
import com.example.demo.service.PunchService;
import com.example.demo.service.UserService;

@Service
public class LeaveServiceImpl implements LeaveService{
	
	@Autowired
	LeaveRespository leaveRespository;



	@Override
	public Leave save(Leave leave) {
		
		return leaveRespository.save(leave);
	}

	@Override
	public List<Leave> findsByTime(String start, String end) {
		
		return leaveRespository.findsByTime(start, end);
	}




	
	





	
	
}
