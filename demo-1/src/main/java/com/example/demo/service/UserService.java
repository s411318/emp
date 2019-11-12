package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

import com.example.demo.entity.Punch;
import com.example.demo.entity.User;

public interface UserService {
	
	User findById(int id);
	
	List<User> findbyNamePswd(String account,String password);
}
