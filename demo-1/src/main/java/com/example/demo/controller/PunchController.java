package com.example.demo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Employee;

import com.example.demo.entity.Punch;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PunchService;

@Controller
public class PunchController {
		
	@Autowired
	PunchService punchservice;
	
	@GetMapping("/punch")
    public String prod(Model model) {
		Integer id = 1;

		return "Employee";
		
	}
}
