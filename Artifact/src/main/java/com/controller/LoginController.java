package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.UserDetail;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(Model model) {
		model.addAttribute("user", new UserDetail());
		return new ModelAndView("login");
	}
}
