package com.fmh.controller;

import com.fmh.pojo.User;
import com.fmh.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
	public String add(User user) {
		userService.add(user);
		return "redirect:list";
	}

	@RequestMapping(value = "/find", method = {RequestMethod.GET, RequestMethod.POST})
	public String find(HttpServletRequest request, Model model) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		User user = userService.find(id);
		model.addAttribute("user", user);
		return "showUser";
	}

	@RequestMapping(value = "/list", method = {RequestMethod.POST, RequestMethod.GET})
	public String listUser(HttpServletRequest request, Model model) {
		List<User> list = userService.getAllUser();
		model.addAttribute("userList", list);
		return "listUser";
	}

}
