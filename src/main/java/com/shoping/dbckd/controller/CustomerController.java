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
        return "/user/sign";
	}

	@PostMapping
	public String sign_(CustomerDTO customer, HttpServletRequest request){
		HttpSession sessoin = request.getSession();
		sessoin.setAttribute("customer", customerService.login(customer));
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
	@GetMapping("policy")
	public String policy() {
		return "/user/policy";
	}
	@GetMapping("terms_of_service")
	public String terms_of_service() {
		return "/user/terms_of_service";
	}
	@GetMapping("lookbook")
	public String lookbook() {
		return "/user/lookbook";
	}
	@GetMapping("events")
	public String events() {
		return "/user/events";
	}
	@GetMapping("thanks")
	public String thanks() {
		return "/user/thanks";
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
