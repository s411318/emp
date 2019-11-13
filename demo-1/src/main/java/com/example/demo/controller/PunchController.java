package com.example.demo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Response;
import com.example.demo.entity.Employee;

import com.example.demo.entity.Punch;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PunchService;

@Controller
public class PunchController {
		
	@Autowired
	PunchService punchservice;
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/punch")
    public String prod(Model model) {
		Integer id = 1;

		return "Employee";
		
	}
	
	@PostMapping("/punch/in")
	@ResponseBody
	public Response punch(@RequestBody Punch punch) {
		
		System.out.println(punch.getCheckstatus());
		System.out.println(punch.getChecktime());
		System.out.println(punch.getId());
		Response res = new Response("200",punch);
		return res;
		
	}
}
