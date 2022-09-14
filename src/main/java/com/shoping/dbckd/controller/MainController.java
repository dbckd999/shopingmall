package com.shoping.dbckd.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.shoping.dbckd.mapper.MainMapper;
import com.shoping.dbckd.model.CustomerDTO;
import com.shoping.dbckd.model.ProductDTO;
import com.shoping.dbckd.service.CustomerService;
import com.shoping.dbckd.service.MainService;
import com.shoping.dbckd.service.ProductManagerSev;
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

	@Autowired
	ProductManagerSev productService;

	/**
	 * @param model 데이터를 가져오는 실험적 기능입니다.
	 * @return index.html
	 */
	@GetMapping
	public String index(Model model) {
		return "index";
	}

	// 관리자가 사용할 페이지 임으로 /admin 하위로 옮기기
	@GetMapping("uploadItem")
	public String uploadItem() {
		return "uploadItem";
	}

	// 나머지 정보는 나중에..
	@PostMapping("uploadItem")
	public String postUploadItem(ProductDTO product, MultipartFile mainImage0, MultipartFile subImage0){
		System.out.println(product);
		System.out.println(mainImage0);
		System.out.println(subImage0);

		productService.addProduct(product, mainImage0, subImage0);

		return "uploadItem";
	}

	@GetMapping("shopList")
	public String shoplist() {
		return "shopList";
	}
	@GetMapping("detailpage")
	public String detailpage() {
		return "detailpage";
	}
	
	@GetMapping("index")
	public String index(){
		return "index";
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
		if(customer.getGeneralCall() == null){
			customer.setGeneralCall("053...01");
		}
		customerService.join(customer);
		return "redirect:/";
	}

	@GetMapping("imagetest")
	public String imgtest(){
		return "imagetest";
	}

	@GetMapping("manager_menu")
	public String manager_menu() {
		return "manager_menu";
	}

	@Autowired
	ProductManagerSev p_srv;

	@PostMapping(value="imagetest")
	public String postMethodName(@RequestParam("p_name") String p_name, @RequestParam("p_img") List<MultipartFile> p_img) {
		// String[] imgNames = req.getParameterValues("imgName");

		System.out.println(p_name);

		for(MultipartFile i : p_img){
			System.out.println(i);
			// p_srv.addProduct(p_name, i);
		}

		return "redirect:uploadItem";
	}
	
}
