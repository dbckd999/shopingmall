package com.shoping.dbckd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller(value = "/sign")
/**
 * 회원이 사용하는 페이지 입니다.
 */
public class MemberController {
    
    @GetMapping("sign")
	public String sign() {
        return "sign";
	}
    
	@GetMapping("sign_up")
	public String sign_up() {
        System.out.println("aaa");
		return "sign_up";
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
    @GetMapping(value = "sign_up2")
    public String sign_up_test(@RequestParam String id2){
        System.out.println("id2: " + id2);

        System.out.println("회원가입 완료.");
        return "/";
    }

}
