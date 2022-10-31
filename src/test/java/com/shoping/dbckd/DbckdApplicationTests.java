package com.shoping.dbckd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shoping.dbckd.mapper.CustomerMapper;
import com.shoping.dbckd.service.CustomerService;

@SpringBootTest
public class DbckdApplicationTests {
    @Autowired
    public CustomerService customerService;

    @Autowired
    public CustomerMapper customerMapper;

    @Test
    public void test() {
    }

}