package com.olive.divine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.olive.divine.beans.AdminUser;
import com.olive.divine.service.impl.HelloWorldServiceImpl;

@Controller
public class HomeController {
	@Autowired
	HelloWorldServiceImpl helloWorldService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		System.out.println("yo--yo");
		return "redirect:home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String HomeDetails(){
		System.out.println(helloWorldService);
		return "index";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public ModelAndView adminWelcome(@ModelAttribute AdminUser adminUser){
		System.out.println(adminUser.getInputEmail());
		ModelMap model = new ModelMap();
		model.addAttribute("name", "niju");
		return new ModelAndView("welcome", model);
	}
}
