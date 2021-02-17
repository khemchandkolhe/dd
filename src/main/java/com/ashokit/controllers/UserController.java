package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/index")
	public String index(Model model) {

		// set data in model to send to ui
		model.addAttribute("msg", "Hey User, Good Morning..!!");

		return "index";
	}

}
