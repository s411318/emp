package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Punch;
import com.example.demo.entity.User;
import com.example.demo.respository.EmployeeRespository;
import com.example.demo.respository.PunchRespository;
import com.example.demo.respository.UserRespository;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PunchService;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRespository userRespository;

	@Override
	public User findById(int id) {
		
		return userRespository.findById(id);
	}

	@Override
	public List<User> findbyNamePswd(String account, String password) {
		
		return userRespository.findbyNamePswd(account, password);
	}
	
	





	
	
}
