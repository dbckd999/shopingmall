package com.shoping.dbckd.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.jdbc.Blob;
import com.shoping.dbckd.mapper.MainMapper;
import com.shoping.dbckd.model.CustomerDTO;
import com.shoping.dbckd.service.CustomerService;
import com.shoping.dbckd.service.MainService;

import ch.qos.logback.core.util.SystemInfo;

@Controller
@RequestMapping("/")
/**
 * 전반적인 페이지를 나타냅니다.
 */
public class MainController {

	@Autowired
	MainService service;

	@Autowired
	MainMapper mapper;

	@Autowired
	CustomerService customerService;

	/**
	 * @param model 데이터를 가져오는 실험적 기능입니다.
	 * @return index.html
	 */
	@GetMapping
	public String index(Model model) {
		// 데이터베이스 가져오기 기능(실험적)
		System.out.println(mapper.test(1));
//		CustomerDTO dto = mapper.test(1);
//		model.addAttribute("var123", dto.getNick());

		return "index";
	}

	@GetMapping("uploaditem")
	public String uploaditem() {
		return "uploaditem";
	}
	@GetMapping("shopList")
	public String shoplist() {
		return "shopList";
	}
	@GetMapping("detailpage")
	public String detailpage() {
		return "detailpage";
	}
	@GetMapping("deposit")
	public String deposit() {
		return "deposit";
	}

	// 파일을 저장하는 태그. 실험용으로써 삭제할 수도 있음.
	@PostMapping("fileTest")
	public String blobTest(@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("test...");
		service.saveImg(file);
		return "redirect:/";
	}

	/**
	 * @return 회원가입 페이지
	 */
	@GetMapping("sign_up")
	public String sign_up() {
		return "sign_up";
	}

	@PostMapping("sign_up")
	public String sign_up(CustomerDTO customer) {
		System.out.println(customer);
		if(customer.getAddress_eng() == null){
			customer.setAddress_eng("n/a");
		}
		if(customer.getPhone_call() == null){
			customer.setPhone_call("010...1");
		}
		if(customer.getGeneral_call() == null){
			customer.setGeneral_call("053...01");
		}
		customerService.join(customer);
		return "index";
	}
}
