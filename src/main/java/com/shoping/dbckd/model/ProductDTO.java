package com.shoping.dbckd.model;

import lombok.Data;

@Data
public class ProductDTO {
    private int id;
    private String name;
    private String inherentNum;
    private int price;
    private String mainImageFileName;
    private String subImageFileName;
}
