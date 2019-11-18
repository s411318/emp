package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Response;
import com.example.demo.dto.Responsepunch;
import com.example.demo.entity.Punch;
import com.example.demo.service.PunchService;

@RestController
public class PunchController {
	@Autowired
	PunchService punchService;
	
	@PostMapping("/login/punch")
	@ResponseBody
	public Response hello(@RequestBody Punch punch) {
		String id = punch.getId();//前端的ID
		
		Punch pun = new Punch();
		pun.setId(id);//設定id
		
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//格式化日期型式		
		Date current = new Date();		
		String time = sdFormat.format(current).toString();//現在時間並轉成字串型態
		
		pun.setChecktime(time);//設定現在時間
		String day2=sdFormat.format(current).subSequence(0,10).toString();//擷取字串從第0個開始 取10位 只有日期的時間 並轉成字串

		int num =punchService.findbyDayId(day2,id).size();//查詢資料庫回傳回來的筆數
		//System.out.print(num);
		Punch punadd= new Punch();
		Punch finpunch = new Punch();
		Response res = new Response("000",finpunch);//傳至前端的初始設定
		
			
//			System.out.println(time);
//			punadd.setId("10");
//			punadd.setCheckstatus("1");
//			punadd.setChecktime("2019/11/12 12:31");
			
			if(num==0) {//a.查詢打卡log裡面有沒有之前的紀錄 如果0次
			punadd.setCheckstatus("1");	//b.設定狀態 上班
            punadd.setId(punch.getId());//c.設定id
			punadd.setChecktime(time);//d.設定現在時間
			finpunch=punchService.save(punadd);//e.新增至資料庫
			res.setStatus("001");//f.設定傳至前端的代碼001
			res.setData(finpunch);//g.設定傳至前端的物件
			
			}else if(num==1) {//a.查詢打卡log裡面有沒有之前的紀錄 如果有1次
				punadd.setCheckstatus("2");	//b.設定狀態 下班
				punadd.setId(punch.getId());//c.設定id
				punadd.setChecktime(time);//d.設定現在時間
				finpunch=punchService.save(punadd);//e.新增至資料庫
				res.setStatus("002");//f.設定傳至前端的代碼002
				res.setData(finpunch);//g.設定傳至前端的物件
			}else if(num>=2) {//a.查詢打卡log裡面有沒有之前的紀錄 如果有2次 則只顯示上次的打卡時間
				res.setStatus("003");//b.設定傳至前端的代碼003
				finpunch=punchService.findbyDayId(day2, id).get(1);//c.取得資料庫的第二筆資料
				res.setData(finpunch);//e.設定傳至前端的物件
			}
			return res;
			
		
		
		
//		if(current.getHours()<=12&&current.getHours()>=8) {
//			System.out.println("中午前");
//			pun.setCheckstatus("1");//STATUS
//		}else if(current.getHours()>12) {
//			System.out.println("中午後");
//			pun.setCheckstatus("2");//STATUS
//		}
		
//		pun.getId();
//		pun.getCheckstatus();
		
//		Punch chek= new Punch();
//		chek.setId(pun.getId());
//		chek.setCheckstatus(pun.getCheckstatus());
//		chek=punchService.findbyIdStatus(chek.getId(), chek.getCheckstatus()).get(0);
//		System.out.print(chek.getId()+chek.getCheckstatus()+chek.getChecktime());
//		if(chek.getChecktime().equals("")) {
//					
//		}

//		pun = punchService.save(pun);
		
						
		
		
//		res.setId(punch.getId());
//		res.setStatus(punch.getCheckstatus());
//		res.setTime(punch.getChecktime());
		//System.out.print(res.getId());
		
	}
	
	@PostMapping("/login/punch/loggg")
	@ResponseBody
	public List<Punch> hello2(@RequestBody Punch punch) {
		String id = punch.getId();
		System.out.println(id);
		
//		pun=punchService.findAll();
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
        pun=punchService.findIdWeekly(todaydate, fromdate, id);
		
		
		return pun;
	}
	
	
}
