package com.imooc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {

	@RequestMapping("/getUser")
    //	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		
		return u;
	}
	
	@RequestMapping("/getJSONUser")
    //	@ResponseBody
	public IMoocJSONResult getJSONUser() {
		
		User u = new User();
		u.setName("imooccha2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooccha2");
		u.setDesc("hello imooccha2~~");
		
		return IMoocJSONResult.ok(u);
	}
	

}
