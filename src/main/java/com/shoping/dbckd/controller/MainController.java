package com.shoping.dbckd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
