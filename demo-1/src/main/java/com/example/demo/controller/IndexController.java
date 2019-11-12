package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;

@Controller
public class IndexController {
	@GetMapping("/")
    public String prod(Model model) {

		return "user";
		
		}
}
