package com.example.demo.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Punch;
import com.example.demo.entity.User;
import com.example.demo.service.PunchService;

@Controller
public class IndexController {
	@GetMapping("/")
    public String prod() {

		return "index";
		
		}
	
	@Autowired
	PunchService punchService;
	
	@GetMapping("/member/loggg/{id}")
    public String prod3(Model model,@PathVariable("id") String itemid) {
		System.out.print(itemid);
		
		List<Punch> pun = new ArrayList<>();	
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, 0);
        Date todate1 = cal.getTime();//現在日期    
        String todaydate=sdFormat.format(todate1).substring(0,10).toString();
        System.out.println(todaydate);
        cal.add(Calendar.DATE, -6);
        Date todate2 = cal.getTime();//七天前的日期 
        String fromdate = sdFormat.format(todate2).substring(0,10).toString();//七天前的日期
        System.out.println(fromdate);
        pun=punchService.findIdWeekly(todaydate, fromdate, itemid);
        
        model.addAttribute("loggglist",pun);
		
        return "punchdata";	
		}
}
