package com.shoping.dbckd.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.jdbc.Blob;
import com.shoping.dbckd.service.MainService;

@Controller
public class MainController {

	@Autowired
	MainService service;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/sign")
	public String sign() {
		return "sign";
	}
	@GetMapping("/sign_up")
	public String sign_up() {
		return "sign_up";
	}
	@GetMapping("/uploaditem")
	public String uploaditem() {
		return "uploaditem";
	}
	@GetMapping("/shopList")
	public String shoplist() {
		return "shopList";
	}
	@GetMapping("/view")
	public String view() {
		return "view";
	}
	@GetMapping("/index")
	public String returnindex() {
		return "index";
	}
	@GetMapping("/find_id")
	public String find_id() {
		return "find_id";
	}
	@GetMapping("/find_pw")
	public String find_pw() {
		return "find_pw";
	}
	@PostMapping("/fileTest")
	public String blobTest(@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("test...");
		service.saveImg(file);
		return "redirect:/";
	}
}
