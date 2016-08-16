package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("/login")
	public String login(HttpServletRequest request,String userName,String password, Model model){
		User user = this.userService.findByNameAndPassword(userName,password);
		model.addAttribute("user", user);
		return "main";
	}

	@RequestMapping("/showUser2")
	public String findByName(HttpServletRequest request,Model model){
		String name = request.getParameter("name");
		List<User> list = this.userService.findByUserName(name);
		model.addAttribute("user", list.size());
		return "showUser";
	}
}
