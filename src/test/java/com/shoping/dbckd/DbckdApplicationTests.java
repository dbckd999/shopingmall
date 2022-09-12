package com.shoping.dbckd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shoping.dbckd.mapper.CustomerMapper;
import com.shoping.dbckd.model.CustomerDTO;
import com.shoping.dbckd.service.CustomerService;

@SpringBootTest
public class DbckdApplicationTests {
    @Autowired
    public CustomerService customerService;

    @Autowired
    public CustomerMapper customerMapper;

    @Test
    public void test() {
        // CustomerDTO customer = new CustomerDTO();
        // customer.setId("id");
        // customer.setPw("pwp");
        // System.out.println(customerMapper.login(customer).getPhone_call());
        System.out.println(customerMapper.dummy());
    }

}
// 시간 문자열 생성 > 삽입
/*
id varchar(20) unique not null,         -- 아이디
pw varchar(20) not null,            -- 비밀번호
nick varchar(20) unique not null,      -- 별명
name varchar(10) not null,            -- 이름(본명)
address varchar(35) not null,         -- 주소
address_eng varchar(93) not null,      -- 영문주소(외국인)
phone_call varchar(11) not null,      -- 휴대전화 번호
general_call varchar(11) not null,      -- 집 전화번호
email varchar(50) not null,            -- 이메일
birth date null                     -- 생년월일
 */