package com.shoping.dbckd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shoping.dbckd.model.CustomerDTO;
import com.shoping.dbckd.service.CustomerService;

/**
 * 회원이 사용하는 페이지 입니다.
 */
@Controller
@RequestMapping("/sign")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
    
    @GetMapping
	public String sign() {
        return "sign";
	}

	@PostMapping
	public String sign_(CustomerDTO customer, HttpServletRequest request){
		HttpSession sessoin = request.getSession();
		sessoin.setAttribute("customer", customerService.login(customer));
		return "redirect:/";
	}
    
    @GetMapping("find_id")
	public String find_id() {
		return "find_id";
	}

	@GetMapping("find_pw")
	public String find_pw() {
		return "find_pw";
	}

	@GetMapping("indexlogin")
	public String indexlogin() {
		return "indexlogin";
	}

	@GetMapping("mypage")
	public String mypage() {
		return "mypage";
	}
	
	@GetMapping("usablereserve")
	public String usablereserve() {
		return "usablereserve";
	}
	
	@GetMapping("userinfo")
	public String userinfo() {
		return "userinfo";
	}

	@GetMapping("ordercheck")
	public String ordercheck() {
		return "ordercheck";
	}

	@GetMapping("list")
	public String list() {
		return "list";
	}
	@GetMapping("deposit")
	public String deposit() {
		return "deposit";
	}
	@GetMapping("register")
	public String register() {
		return "register";
	}
	@GetMapping("notice")
	public String notice() {
		return "notice";
	}
	@GetMapping("qanda")
	public String qanda() {
		return "qanda";
	}
	@GetMapping("review")
	public String review() {
		return "review";
	}
	@GetMapping("qandawrite")
	public String qandawrite() {
		return "qandawrite";
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
