package com.shoping.dbckd.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.jdbc.Blob;
import com.shoping.dbckd.mapper.MainMapper;
import com.shoping.dbckd.model.CustomerDTO;
import com.shoping.dbckd.service.MainService;

@Controller
/**
 * 전반적인 페이지를 나타냅니다.
 */
public class MainController {

	@Autowired
	MainService service;

	@Autowired
	MainMapper mapper;

	@GetMapping("/")
	public String index(Model model) {
		// 아래 주석을 해제하면 내 집에있는 db서버에서 데이터를 가져온다.
		// 너무 많이 새로고침만 하지 마셈.... 파이로 켜놓는거라 자원이 적다
		System.out.println(mapper.test(1));

		CustomerDTO dto = mapper.test(1);

		model.addAttribute("var123", dto.getNick());

		return "index";
	}

	@GetMapping("/index")
	public String returnindex() {
		return "index";
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


	@PostMapping("/fileTest")
	public String blobTest(@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("test...");
		service.saveImg(file);
		return "redirect:/";
	}
}
