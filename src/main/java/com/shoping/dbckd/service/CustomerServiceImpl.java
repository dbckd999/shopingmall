package com.shoping.dbckd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoping.dbckd.mapper.CustomerMapper;
import com.shoping.dbckd.model.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Integer join(CustomerDTO customer){
        return customerMapper.Join(customer);
    }

    @Override
    public Integer checkID(CustomerDTO customer) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer checkNick(CustomerDTO customer) {
        // TODO Auto-generated method stub
        return null;
    }
}
