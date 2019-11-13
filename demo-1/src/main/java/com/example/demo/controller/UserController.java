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

import com.example.demo.entity.Punch;
import com.example.demo.entity.User;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PunchService;
import com.example.demo.service.UserService;

@RestController
public class UserController {
		
	@Autowired
	UserService userservice;
	
	
	
    @PostMapping("/user/findId")
    @ResponseBody
    public Response findId(@RequestBody User user) {
    		

    	String account = user.getAccount();
    	String pswd = user.getPswd();
    	List<User> user1;
    	Response res = new Response();
    	System.out.println(account+pswd);
    	try {
    	user1 = userservice.findbyNamePswd(account, pswd);
    	if(!user1.isEmpty()) {
    		res = new Response("200",user1);
    	}else {
    		res = new Response("400",user1);
    	}
    	 
    	}catch(NullPointerException e) {
    		e.printStackTrace();
    	}
		return res;
    	
    	
    		
    	  
    	 }
}
