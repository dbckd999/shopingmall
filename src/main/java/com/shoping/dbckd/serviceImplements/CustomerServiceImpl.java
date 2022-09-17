package com.shoping.dbckd.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoping.dbckd.mapper.CustomerMapper;
import com.shoping.dbckd.model.CustomerDTO;
import com.shoping.dbckd.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Integer join(CustomerDTO customer){
        return customerMapper.join(customer);
    }

    @Override
    public boolean isUniqueID(CustomerDTO customer) {
        if(customerMapper.checkID(customer).size() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOverlapNick(CustomerDTO customer) {
        if(customerMapper.checkNick(customer).size() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CustomerDTO login(CustomerDTO customer){
        return customerMapper.login(customer);
    }

    @Override
    public boolean isOverlapEmail(CustomerDTO customer) {
        if(customerMapper.checkEmail(customer).size() == 0){
            return true;
        } else {
            return false;
        }
    }
}
