package com.fmh.controller;

import com.fmh.pojo.User;
import com.fmh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add",method = {RequestMethod.GET,RequestMethod.POST})
	public void add(User user){
		userService.add(user);
	}

	@RequestMapping(value = "/find",method = {RequestMethod.GET,RequestMethod.POST})
	public User find(int id){
		return userService.find(id);
	}

}
