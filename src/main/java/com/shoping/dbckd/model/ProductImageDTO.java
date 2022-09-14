package com.shoping.dbckd.model;

import lombok.Data;

@Data
public class ProductImageDTO {
    private int productImageId;
    private String fileName;
    private String originalName;
    private String uuid;
}