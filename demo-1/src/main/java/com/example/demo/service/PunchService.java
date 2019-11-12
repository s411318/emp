package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Punch;

public interface PunchService {
	


List<Punch> findById(int id);
}
