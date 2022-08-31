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
    public boolean isUniqueID(CustomerDTO customer) {
        if(customer.getId().equals(customerMapper.checkID(customer).getId())){
            return true;
        }
        return false;
    }

    @Override
    public boolean isOverlapNick(CustomerDTO customer) {
        if(customer.getNick().equals(customerMapper.checkNick(customer).getNick())){
            return true;
        } else {
            return false;
        }
    }
}
