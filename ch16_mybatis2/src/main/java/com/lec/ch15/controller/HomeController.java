package com.lec.ch15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lec.ch15.service.EmpService;

@Controller
public class HomeController {
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("msg", "Hello, Mybatis!");
		return "home";
	}
	
}
