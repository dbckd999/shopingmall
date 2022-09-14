package com.shoping.dbckd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shoping.dbckd.model.ProductImageDTO;

@Mapper
public interface ProductMapper {
    public int insertProductImage(ProductImageDTO productImage);
}
