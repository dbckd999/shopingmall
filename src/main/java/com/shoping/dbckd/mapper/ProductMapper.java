package com.shoping.dbckd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shoping.dbckd.model.ProductDTO;
import com.shoping.dbckd.model.ProductImageDTO;

@Mapper
public interface ProductMapper {
    public int addProductImage(ProductImageDTO productImage);
    public int getProductImageId(String uuid);
    public void addProduct(ProductDTO product);
}
