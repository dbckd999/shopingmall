package com.shoping.dbckd.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 상품을 관리하는 사용자의 서비스 인터페이스 입니다.
 */
public interface ProductManagerSev {
    public int addProduct(String name, MultipartFile file);
}
