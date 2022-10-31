package com.shoping.dbckd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shoping.dbckd.model.ProductDTO;
import com.shoping.dbckd.model.ProductImageDTO;

@Mapper
public interface ProductMapper {
    // demo
    public List<ProductDTO> viewProducts();
    public int addProductImage(ProductImageDTO productImage);
    public int getProductImageId(String uuid);
    public void addProduct(ProductDTO product);
}
