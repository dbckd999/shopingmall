package com.shoping.dbckd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoping.dbckd.service.MainService;

// service단에서 만든 데이터를 사용자들에게 보여질 데이터로 만든다.

@Controller
public class MainController {
	
	@Autowired
	MainService service;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(String id, String pw, Model model) {
		model.addAttribute("id", service.loginRes(id, pw));
		return "login";
	}
}
