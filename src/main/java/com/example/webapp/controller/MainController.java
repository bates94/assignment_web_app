package com.example.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.webapp.model.User;
import com.example.webapp.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public ModelAndView showLoginPage()
	{
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@PostMapping("/login/success")
	public ModelAndView showLoginSuccessPage(@ModelAttribute("user") User user)
	{
		ModelAndView modelAndView = new ModelAndView();
		user = userService.getUser(user);
		String state = "";
			if(user.equals(null)){
				state = "login failed";
			}
			else
			{
				state = "login success";
				modelAndView.addObject("user",user);
			}
		modelAndView.addObject("state",state);
		modelAndView.setViewName("homepage");
		return modelAndView;
	}
	
	@GetMapping("/register")
	public ModelAndView showRegisterPage()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		User user = new User();
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	
	@PostMapping("/register/user")
	public ModelAndView addNewUser(@ModelAttribute("user") User user)
	{
		ModelAndView modelAndView = new ModelAndView();
		userService.addNewUser(user);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user");
		return modelAndView;
	}
	
	@PostMapping("/homepage")
	public ModelAndView showHomePage(@ModelAttribute("user") User user)
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("homepage");
		return modelAndView;
	}
	
	@GetMapping("/")
	public ModelAndView showHomePageWithOnlySlash()
	{
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("login");
		return modelAndView;
	}

}
