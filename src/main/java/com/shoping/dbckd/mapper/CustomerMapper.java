package com.shoping.dbckd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shoping.dbckd.model.CustomerDTO;

/**
 * 회원에 관한 동작을 정의하는 인터페이스입니다.
 */
@Mapper
public interface CustomerMapper {
    /**
     * @param customer 회원가입에 사용될 정보입니다
     * @return 회원가입 성공여부를 반환합니다
     */
    public Integer Join(CustomerDTO customer);
}
