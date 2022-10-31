package com.shoping.dbckd.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String testMain(){
        return "test";
    }

    @GetMapping("imagetest")
	public String imgtest(){
		return "imagetest";
	}

    @PostMapping(value="imagetest")
	public String postMethodName(
		@RequestParam("p_name") String p_name, 
		@RequestParam("p_img") List<MultipartFile> p_img) {
		// String[] imgNames = req.getParameterValues("imgName");

		System.out.println(p_name);

		for(MultipartFile i : p_img){
			System.out.println(i);
			// p_srv.addProduct(p_name, i);
		}

		return "redirect:uploadItem";
	}
}
