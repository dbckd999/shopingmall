package com.shoping.dbckd.service;

import org.springframework.stereotype.Service;

import com.shoping.dbckd.model.CustomerDTO;

/**
 * 회원가입 전 유효성 검사를 직접 거치고, 회원가입 시 유효성검사를 한번 더 거친다.
 */
@Service
public interface CustomerService {

    public Integer join(CustomerDTO customer);
    public Integer checkID(CustomerDTO customer);
    public Integer checkNick(CustomerDTO customer);
}
