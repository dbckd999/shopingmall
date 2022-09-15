package com.shoping.dbckd.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shoping.dbckd.mapper.ProductMapper;
import com.shoping.dbckd.model.ProductDTO;
import com.shoping.dbckd.model.ProductImageDTO;

@Service
public class ProductManagerSevImpl implements ProductManagerSev{

    @Autowired
    ProductMapper productMapper;

    @Override
    public int addProduct(ProductDTO product, MultipartFile mainImage, MultipartFile subImage){
        product.setMainImageFileName(addProductImage(mainImage));
        product.setSubImageFileName(addProductImage(subImage));

        System.out.println(product);

        productMapper.addProduct(product);

        return 0;
    }

    private String addProductImage(MultipartFile file) {
        UUID uuid = UUID.randomUUID();
        String fileName = uuid.toString() + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        
        String path = System.getProperty("user.dir") + "/src/main/resources/static/file";
        File saveFile = new File(path, fileName);

        ProductImageDTO img = new ProductImageDTO();
        img.setFileName(fileName);
        img.setOriginalName(file.getOriginalFilename());
        img.setUuid(uuid.toString());

        productMapper.addProductImage(img);

        try {
            file.transferTo(saveFile);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName;
    }
    
}
