package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;


public interface EmployeeService {
	
List<Employee> findAll();

List<Employee> findsById(int id);
}
