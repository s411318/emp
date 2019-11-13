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
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	

	
	@GetMapping("/employee")
    public String prod(Model model) {
		Integer id = 1;
		List<Employee> emp = employeeservice.findAll();
		Iterator<Employee> it = emp.iterator();
        while (it.hasNext()) {
            Employee emplo = it.next();
            System.out.println(emplo.getPunch().get(0).getCheckstatus());
            System.out.println("TTESSSSSSSSSSSSSSSSSSSSSS");
            
            
            
        }

		return "Employee";
		
	}
}
