package com.shoping.dbckd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shoping.dbckd.model.CustomerDTO;

/**
 * 회원에 관한 동작을 정의하는 인터페이스입니다.
 */
@Mapper
public interface CustomerMapper {
    public Integer join(CustomerDTO customer);
    public List<CustomerDTO> checkID(CustomerDTO customer);
    public List<CustomerDTO> checkNick(CustomerDTO customer);
    public CustomerDTO login(CustomerDTO customer);
    public CustomerDTO dummy();
    public List<CustomerDTO> checkEmail(CustomerDTO customer);
    public CustomerDTO findMyID(CustomerDTO customer);
    public Integer chageMyPassword(CustomerDTO customer);
    public Integer chageMyInfo(CustomerDTO customer);
}
