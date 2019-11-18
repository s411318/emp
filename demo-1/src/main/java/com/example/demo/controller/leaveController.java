package com.example.demo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.WebServiceException;

import com.example.demo.dto.Response;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Punch;
import com.example.demo.entity.User;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.LeaveService;
import com.example.demo.service.PunchService;
import com.example.demo.service.UserService;

@RestController
public class leaveController {
		
	@Autowired
	LeaveService leaveservice;
	
	
	
    @PostMapping("/leave")
    @ResponseBody
    public Response findId(@RequestBody Leave leave) {
    	Leave lev1;	
    	Response res = new Response();
    	
    	if((leave.getId()==0)||(leave.getVacation()==null)||(leave.getVacationendDate()==null)||(leave.getVacationstartDate()==null)||(leave.getVacationTime()==null)) {
    		res = new Response("400",new Leave());
    	}else {
    		List<Leave> time =leaveservice.findsByTime(leave.getVacationstartDate(), leave.getVacationendDate());
    		
    		if(!time.isEmpty()) { 
    			res = new Response("300",new Leave());	
    		}else {
    			lev1 = leaveservice.save(leave);
    			res = new Response("200",lev1);
    		}
    	}

    	
		return res;
    	
    	
    		
    	  
    	 }
}
