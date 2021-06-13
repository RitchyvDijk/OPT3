package com.ritchyvdijk;

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

    public long getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(long productBarcode) {
        this.productBarcode = productBarcode;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getUseBy() {
        return useBy;
    }

    public void setUseBy(Date useBy) {
        this.useBy = useBy;
    }
}
