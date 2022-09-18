package com.shoping.dbckd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

	@GetMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("customer");
		return "redirect:/";
	 }
    
    @GetMapping("find_id")
	public String find_id() {
		return "/user/find_id";
	}
	
	@ResponseBody
	@PostMapping("findMyID")
	public ModelAndView findMyID(CustomerDTO customer, Model model){
		System.out.println("id find..");
		String resultID = customerService.findMyID(customer);

		if(resultID.equals(null) | resultID.equals("")){
			resultID = "존재하지 않는 계정입니다.";
		}

		ModelAndView mav = new ModelAndView();

		mav.setViewName("/user/findidresult");
		mav.addObject("resultID", resultID);

		model.addAttribute("resultID", resultID);

		return mav;
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
		return "user/mypage";
	}

	// @ResponseBody
	@PostMapping("chageMyInfo")
	public String chageMyInfo(CustomerDTO customer, String pw1, String pw2, HttpServletRequest request){
		if(pw1.equals(pw2)){
			HttpSession session = request.getSession();
			CustomerDTO _customer = (CustomerDTO)session.getAttribute("customer");
			customer.setIden(_customer.getIden());
			customer.setPw(pw1);
		}
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
	@GetMapping("basket")
	public String basket() {
		return "/user/basket";
	}
	@GetMapping("nollnoll_story")
	public String nollnoll_story() {
		return "/user/nollnoll_story";
	}
	@GetMapping("userlike")
	public String userlike() {
		return "/user/userlike";
	}
	@GetMapping("findidresult")
	public String findIdResult() {
		return "/user/findIdResult";
	}

}
