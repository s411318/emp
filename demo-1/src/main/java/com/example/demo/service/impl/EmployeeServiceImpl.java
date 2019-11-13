package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.respository.EmployeeRespository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRespository employeeRespository;

	public List<Employee> findAll(){
		return employeeRespository.findAll();
		
	}

	@Override
	public List<Employee> findsById(int id) {
		// TODO Auto-generated method stub
		return employeeRespository.findsById(id);
	}


	
}
