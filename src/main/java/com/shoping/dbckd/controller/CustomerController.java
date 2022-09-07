package com.shoping.dbckd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoping.dbckd.model.CustomerDTO;

/**
 * 회원이 사용하는 페이지 입니다.
 */
@Controller
@RequestMapping("/sign")
public class CustomerController {
    
    @GetMapping
	public String sign() {
        return "/user/sign";
	}

	@PostMapping
	public String sign_(){
		System.out.println("login");
		return "redirect:/";
	}
    
    @GetMapping("find_id")
	public String find_id() {
		return "/user/find_id";
	}

	@GetMapping("find_pw")
	public String find_pw() {
		return "/user/find_pw";
	}

	@GetMapping("indexlogin")
	public String indexlogin() {
		return "/user/indexlogin";
	}

	@GetMapping("mypage")
	public String mypage() {
		return "/user/mypage";
	}
	
	@GetMapping("usablereserve")
	public String usablereserve() {
		return "/user/usablereserve";
	}
	
	@GetMapping("userinfo")
	public String userinfo() {
		return "/user/userinfo";
	}

	@GetMapping("ordercheck")
	public String ordercheck() {
		return "/user/ordercheck";
	}
	@GetMapping("list")
	public String list() {
		return "/user/list";
	}
	@GetMapping("deposit")
	public String deposit() {
		return "/user/deposit";
	}
	@GetMapping("register")
	public String register() {
		return "/user/register";
	}
	@GetMapping("notice")
	public String notice() {
		return "/user/notice";
	}
	@GetMapping("qanda")
	public String qanda() {
		return "/user/qanda";
	}
	@GetMapping("review")
	public String review() {
		return "/user/review";
	}
	@GetMapping("qandawrite")
	public String qandawrite() {
		return "/user/qandawrite";
	}
	// @PostMapping(value = "sign_up")
	// public String sign_up123(CustomerDTO customer){
	// 	System.out.println(customer);
    //     System.out.println("회원가입 완료.");
    //     return "sign";
	// }

	// @GetMapping("test")
	// public String test(){
	// 	return "/";
	// }

}
