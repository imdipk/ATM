package com.springboot.ATM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.springboot.ATM.model.UserData;

@Controller
public class RegistrationController {
	@GetMapping("/")

	public String openRegistration(Model model) {
		model.addAttribute("userData", new UserData());
		return "registration";
	}
//handler for processing form
	@PostMapping("/process")
	public String processForm(@ModelAttribute("userData") UserData userData ) {
		System.out.println(userData);
		return "success";
	}
}

