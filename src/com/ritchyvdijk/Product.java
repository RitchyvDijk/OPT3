package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.Date;

public abstract class Product {
    private long productBarcode;
    private String productBrand;
    private String productName;
    private Date useBy;

    public Product(long barcode, String brand, String name, Date useBy ) {
        this.productBarcode = barcode;
        this.productBrand = brand;
        this.productName = name;
        this.useBy = useBy;
    }

}
