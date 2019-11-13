package com.example.demo.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Employee;

import com.example.demo.entity.Punch;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PunchService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	

	
	@GetMapping("/employee/{itemid}")
    public String prod(@PathVariable("itemid") int itemid,Model model) {

		
		List<Employee> emplist = employeeservice.findsById(itemid);
		
		model.addAttribute("emplist",emplist.get(0) );
            
            
        

		return "Employee";
		
	}
}
