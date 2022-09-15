package com.shoping.dbckd.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductVO {
    private String name;
    private String inherentNum;
    private int price;
    private MultipartFile mainImage;
    private MultipartFile subImage;
}
