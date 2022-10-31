package com.shoping.dbckd.service;

import org.springframework.web.multipart.MultipartFile;

import com.shoping.dbckd.model.ProductDTO;

/**
 * 상품을 관리하는 사용자의 서비스 인터페이스 입니다.
 */
public interface ProductManagerSev {
    public int addProduct(ProductDTO product, MultipartFile mainImage, MultipartFile subImage);
}
